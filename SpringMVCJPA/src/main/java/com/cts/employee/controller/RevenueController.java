package com.cts.employee.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.employee.domain.InvoiceValidation;
import com.cts.employee.domain.Process;
import com.cts.employee.domain.Project;
import com.cts.employee.domain.RevenuePojo;
import com.cts.employee.service.RevenueProjectionService;


@Controller
public class RevenueController {
	
	
	//RevenueProjectionserviceImpl revenueProjectionUlit = new RevenueProjectionserviceImpl();
	
	@Autowired
	RevenueProjectionService revenueProjectionService;

	@RequestMapping(value="/revenue/variance")
	public String login(Model model,HttpServletRequest request){
		RevenuePojo revenuePojo =  new RevenuePojo();
		HttpSession session = request.getSession();
		model.addAttribute("userid", session.getAttribute("ctsId"));
		model.addAttribute("RevenuePojo", revenuePojo);			
		return "associate/revenuevariance";
	}
	
	
	@ModelAttribute("sectorList")
	public Map<String, String>  getSectorList(){
		Map<String,String> sectorList = revenueProjectionService.getSubsector();	
		return sectorList;
		
	}
	
	
	@RequestMapping(value="/revenue/getProcess",method=RequestMethod.GET)
	public  @ResponseBody List <Process> getProcess(@RequestParam("id") String id){
		
		List <Process> process=revenueProjectionService.getProcessBySectorID(id);
		return process;
		
	}
	
	
	@RequestMapping(value="/revenue/getProject",method=RequestMethod.GET)
	public  @ResponseBody List <Project> getProjectsByCustomer(@RequestParam("processId") String processId){
		
		List <Project> projectList=revenueProjectionService.getProjectByProcessId(processId);		
		return projectList;
		
	}
	
	
	@RequestMapping(value="/revenue/getRevenueSummary",method=RequestMethod.GET)
	public  @ResponseBody List<RevenuePojo> getRevenueSummary(@RequestParam("searchby") String searchBy,																	
																	@RequestParam("value") String value){
		
		List<RevenuePojo> revenueProjectionList = revenueProjectionService.createRevenueVarianceList(searchBy, value);
		return revenueProjectionList;
		
	}
	
	
	@RequestMapping(value="/revenue/getRevenueProjection",method=RequestMethod.GET)
	public  @ResponseBody List<RevenuePojo> getRevenueProjection(@RequestParam("searchby") String searchBy,																	
																	@RequestParam("value") String value){
		
		List<RevenuePojo> revenueProjectionList = revenueProjectionService.createRevenueProjectionList(searchBy, value);
		return revenueProjectionList;
		
	}
	
	
	@RequestMapping(value="/revenue/valiadation")
	public String valiadationView(Model model,HttpServletRequest request){
		RevenuePojo revenuePojo =  new RevenuePojo();
		HttpSession session = request.getSession();
		model.addAttribute("userid", session.getAttribute("ctsId"));
		model.addAttribute("RevenuePojo", revenuePojo);	
		return "associate/revenuevaliadation";
	}
	
	@ModelAttribute("monthList")
	public Map<String, String>  getMonthList(){
		Map<String,String> monthList = new HashMap<String,String>();	
		monthList.put("1", "JANUARY");
		monthList.put("2", "FEBUARY");
		monthList.put("3", "MARCH");
		monthList.put("4", "APRIL");
		monthList.put("5", "MAY");
		monthList.put("6", "JUNE");
		monthList.put("7", "JULY");
		monthList.put("8", "AUGUST");
		monthList.put("9", "SEPTEMBER");
		monthList.put("10", "OCTOBER");
		monthList.put("11", "NOVEMBER");
		monthList.put("12", "DECEMBER");
		return monthList;
		
	}
	
	
	@ModelAttribute("yearList")
	public Map<String, String>  getYearList(){
		Map<String,String> yearList = new HashMap<String,String>();	
		yearList.put("2017", "2017");
		yearList.put("2018", "2018");
		yearList.put("2019", "2019");
		yearList.put("2020", "2020");
		return yearList;
		
	}
	
	@RequestMapping(value = "/revenue/invoiceValidation", method = RequestMethod.GET)
	public @ResponseBody List<InvoiceValidation> invoiceValidation(@RequestParam("month") Integer month,@RequestParam("year") Integer year)
			{		
		List<InvoiceValidation> result = revenueProjectionService.invoiceValidation(month, year);
		return result;
		//http://localhost:8080/SpringMVCJPA/spring/revenue/invoiceValidation?projectId=1000062711&month=4&year=2017
	}
	
	@RequestMapping(value="/revenue/projection")
	public String revenueProjection(Model model,HttpServletRequest request){
		HttpSession session = request.getSession();
		model.addAttribute("userid", session.getAttribute("ctsId"));
		RevenuePojo revenuePojo =  new RevenuePojo();
		model.addAttribute("RevenuePojo", revenuePojo);	
		return "associate/revenueprojection";
	}
	
}
