/**
 * 
 */
package com.cts.employee.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cts.employee.domain.AllowanceViewModel;
import com.cts.employee.entity.AssociateAllowance;
import com.cts.employee.entity.AssociateShiftAllowance;
import com.cts.employee.entity.AssociateTransportAllowance;
import com.cts.employee.exception.AllowanceException;
import com.cts.employee.repository.AssociateShiftAllowanceRepository;
import com.cts.employee.repository.AssociateTransportAllowanceRepository;
import com.cts.employee.service.AllowanceConstants;
import com.cts.employee.service.AllowanceDataProcessor;

@Controller

/**
 * Controller for handling bulk upload of associates allowances and 
 * transport opt out .
 * @author 221310
 *
 */
public class AssociateAllowanceController {

	@Autowired
	private AllowanceDataProcessor dataprocessor;

	@Autowired
	private AssociateShiftAllowanceRepository shiftAllowanceRepository;

	@Autowired
	private AssociateTransportAllowanceRepository transportAllowanceRepository;

	@RequestMapping(value = "/sampleTest", method = RequestMethod.GET)
	@ResponseBody
	public String processShiftAllowance(HttpServletRequest request) {

		return "displayShiftAllowances";
	}

	@RequestMapping(value = "/showAllowance", method = RequestMethod.GET)
	public String showAllowance(@RequestParam("allowance") String allowance,
		@RequestParam(name="operation")	String operation,Model model) {
		
		//TODO cleanup
		System.out.println("----------------" + allowance);
		System.out.println("----------------" + operation);
		System.out.println("-----------associateShiftAllowanceRepository-----"
				+ shiftAllowanceRepository.findDistinctByaccountIds());

		model.addAttribute("allowance", allowance);
		model.addAttribute("operation", operation);
		return "associate/uploadAssociateAllowance";
	}


	@RequestMapping(value = "/processShiftAllowance", method = RequestMethod.GET)
	public String loadAllowance(Model model,HttpSession session,
			@RequestParam(name="keepAlive",required=false,defaultValue="false")
			String info){		
		//cleanup session info		
		AllowanceViewModel viewModel = session.getAttribute("processAllowanceView") != null ?
				(AllowanceViewModel)session.getAttribute("processAllowanceView") : null;
		if(viewModel != null && !"true".equals(info)){
			viewModel.reset();
		}
		System.out.println("--------------loadAllowance access by user-------"+session.getAttribute("ctsId"));
		model.addAttribute("userid", session.getAttribute("ctsId"));
		return "associate/uploadAssociateAllowance";		
	}

	
	
	/**
	 * This method process the night shift allowance of associates in a bulk
	 * process.
	 * 
	 * @return
	 */

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/processShiftAllowance", method = RequestMethod.POST)
	public String processShiftAllowance(@RequestParam("file") MultipartFile file,
			@RequestParam("allowance") String allowance,@RequestParam(name="operation")
			String operation , Model model,HttpSession session) {
		
		AllowanceViewModel viewModel = new AllowanceViewModel();
		session.removeAttribute("processAllowanceView");
		System.out.println("operation :: " +operation);
		
		viewModel.setAllowance(allowance);
		viewModel.setOperation(operation);		
		// basic validations
		if(!validateAllowanceForm(file, allowance, operation, model)){
			session.setAttribute("processAllowanceView", viewModel);
			return "associate/uploadAssociateAllowance";
		}
		
		// format the data
		boolean uploadStatus = false;
		System.out.println("file " + file.getSize() + " file " + file.getName() + " allowance " + allowance);
		try {
			Map<String, Set<? extends AssociateAllowance>> resultMap = null;
			try {
				resultMap = dataprocessor.uploadAssociatesDetails(file.getInputStream(), allowance);
			} catch (AllowanceException e) {
				viewModel.setUploadFailed("Invalid file :: "+e.getMessage());
				session.setAttribute("processAllowanceView", viewModel);
				return "associate/uploadAssociateAllowance";
			}
			Set<? extends AssociateAllowance> listAllowance = 
					resultMap.get(AllowanceConstants.ALLOWANCE_RECORDS);
			
			Set<? extends AssociateAllowance> listAllowanceDuplicate = 
					resultMap.get(AllowanceConstants.DUPLICATE_RECORDS);
			
			Set<? extends AssociateAllowance> listAllowanceInvalidRecords = 
					resultMap.get(AllowanceConstants.INVALID_RECORDS);
			
			System.out.println("DUPLICATES :: "+listAllowanceDuplicate);
			
			if(listAllowance.size()>0){
				if (AllowanceConstants.SHIFT.equals(allowance) && 
					AllowanceConstants.ADD_OPERATION.equals(operation)){
					
					List<AssociateShiftAllowance> saved = shiftAllowanceRepository
							.save((Set<AssociateShiftAllowance>) listAllowance);				
					//TODO cleanup
					System.out.println("Records saved :: "+saved);
					uploadStatus = true;
					viewModel.setMessage("Processed allowances sucessfully.");					
				}else if(AllowanceConstants.SHIFT.equals(allowance) && 
						AllowanceConstants.UPDATE_OPERATION.equals(operation)){
					
					//retrieve from db and compare upload one 
					//save the objects retrieved from db					
					List<AssociateShiftAllowance> allowanceInDB = shiftAllowanceRepository.findAll();
					Map<String,Set< ? extends AssociateAllowance>> updateAllowanceMap = dataprocessor.
							updateAllowanceEntities(allowanceInDB, listAllowance);
					
					Set< ? extends AssociateAllowance> mismatchRecords = updateAllowanceMap.get(AllowanceConstants.NOT_MATCHED);					
					System.out.println("Mismatches :: "+mismatchRecords);
					if(mismatchRecords.size()>0){
						viewModel.setMismatchMessage(buildLogMessagesForClient(mismatchRecords));						
					}					
					Set<AssociateShiftAllowance> allowanceUpdateSet = (Set<AssociateShiftAllowance>)
							updateAllowanceMap.get(AllowanceConstants.UPDATED_RECORDS); 
					System.out.println("\n\n\n"+allowanceUpdateSet);
					
					if(allowanceUpdateSet.size()>0){
						List<AssociateShiftAllowance> saved = shiftAllowanceRepository.save(allowanceUpdateSet);				
						//TODO cleanup
						System.out.println("Records updated :: "+saved);
						uploadStatus = true;						
						viewModel.setMessage("Updated allowances sucessfully.");
					}else{
						viewModel.setUploadFailed("No records found in the xls feed, pls check data.");
					}
				} else if (AllowanceConstants.OUTPUT.equals(allowance) && 
						AllowanceConstants.ADD_OPERATION.equals(operation)) {
					List<AssociateTransportAllowance> saved = transportAllowanceRepository
							.save((Set<AssociateTransportAllowance>) listAllowance);
					//TODO cleanup
					System.out.println("Records saved :: "+saved);
					uploadStatus = true;					
					viewModel.setMessage("Processed opt-out sucessfully.");					
				}else if (AllowanceConstants.OUTPUT.equals(allowance) && 
						AllowanceConstants.UPDATE_OPERATION.equals(operation)) {
					
					List<AssociateTransportAllowance> allowanceInDB = transportAllowanceRepository.findAll();
					Map<String,Set< ? extends AssociateAllowance>> updateAllowanceMap = 
							dataprocessor.updateAllowanceEntities(allowanceInDB, listAllowance);
					Set< ? extends AssociateAllowance> mismatchRecords = updateAllowanceMap.get(AllowanceConstants.NOT_MATCHED);
					
					System.out.println("Mismatches :: "+mismatchRecords);
					if(mismatchRecords.size()>0){						
						viewModel.setMismatchMessage(buildLogMessagesForClient(mismatchRecords));						
					}					
					Set<AssociateTransportAllowance> allowanceUpdateSet = (Set<AssociateTransportAllowance>)
							updateAllowanceMap.get(AllowanceConstants.UPDATED_RECORDS); 
					System.out.println("\n\n\n"+allowanceUpdateSet);
					
					if(allowanceUpdateSet.size()>0){
						List<AssociateTransportAllowance> updated = transportAllowanceRepository.save(allowanceUpdateSet);				
						//TODO cleanup
						System.out.println("Records updated :: "+updated);
						uploadStatus = true;						
						viewModel.setMessage("Updated opt_out sucessfully.");						
					}else{
						viewModel.setUploadFailed("No records found in the xls feed, pls check data.");
					}
				}
				
				//view duplicates / mismatch
				if(listAllowanceDuplicate.size()>0){
					viewModel.setDuplicateMessage(buildLogMessagesForClient(listAllowanceDuplicate));					
				}
				if(listAllowanceInvalidRecords.size()>0){
					viewModel.setInvalidMessage(buildLogMessagesForClient(listAllowanceInvalidRecords));					
				}				
			}else{
				//No records found to upload 
				//Pass error message
				viewModel.setUploadFailed("No records found in the xls feed, pls check data.");				
			}			
			System.out.println("saved records status :: " + uploadStatus);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file " + file.getSize() + " file " + file.getName() + " allowance " + allowance);

		if (!uploadStatus){			
			viewModel.setMessage("Falied to upload " + allowance + ".");
		}
		
		//return "associate/uploadAssociateAllowance";
		session.setAttribute("processAllowanceView", viewModel);
		return "redirect:/spring/processShiftAllowance?keepAlive=true";
	}

	/**This method validates the input data from the Allowance update form
	 * @param file
	 * @param allowance
	 * @param operation
	 * @param model
	 * @return
	 */
	private boolean validateAllowanceForm(MultipartFile file, String allowance, String operation, Model model) {

		boolean validationFlag = true;
		if (file.isEmpty() ) {
			model.addAttribute("fileError", "Please select a file to upload");
			validationFlag = false;
		}
		if("".equals(allowance)){
			model.addAttribute("allowanceError", "Please select allowance type");
			validationFlag = false;
		}
		if("".equals(operation)){
			model.addAttribute("operationError", "Please select operation type");
			validationFlag = false;
		}
		return validationFlag;
	}
	
	/**
	 * This method generates logs for client
	 * @param listAllowanceDuplicate
	 * @return
	 */
	private String buildLogMessagesForClient(Set<? extends AssociateAllowance> listAllowanceDuplicate){
		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append("<table>");
		for(AssociateAllowance allowance : listAllowanceDuplicate){
			errorMessage.append("<tr><td>Associate Id : "+allowance.getAssociateId()+"</td>"
			+"<td>Project Id : "+allowance.getProjectId()+"</td>"
			+"<td>Month : "+allowance.getMonth()+"</td>"
			+"<td>Input type : "+allowance.getInputType()+"</td></tr>");
		}
		errorMessage.append("</table>");		
		return errorMessage.toString();
	}
}
