package com.cts.employee.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.employee.domain.Allocation;
import com.cts.employee.domain.User;
import com.cts.employee.entity.AccountDetails;
import com.cts.employee.entity.AccountManagerDetails;
import com.cts.employee.entity.AssociateAllocationDetails;
import com.cts.employee.entity.AssociateAttritionDetails;
import com.cts.employee.entity.AssociateInternalMovements;
import com.cts.employee.entity.AssociateSummary;
import com.cts.employee.entity.BCSummary;
import com.cts.employee.entity.DeliveryLeadDetails;
import com.cts.employee.entity.InvoiceSummary;
import com.cts.employee.entity.ProcessOwnerDetails;
import com.cts.employee.entity.ProjectDetails;
import com.cts.employee.entity.ProjectManagersDetails;
import com.cts.employee.entity.SeatDetails;
import com.cts.employee.entity.SubProcessDetails;
import com.cts.employee.entity.TOSummary;
import com.cts.employee.entity.TaskOrderAllocationDetails;
import com.cts.employee.entity.Users;
import com.cts.employee.repository.AccountDetailsRepository;
import com.cts.employee.repository.AccountManagerDetailsRepository;
import com.cts.employee.repository.AssociateAllocationDetailsRepository;
import com.cts.employee.repository.AssociateAttritionDetailsRepository;
import com.cts.employee.repository.AssociateInternalMovementsRepository;
import com.cts.employee.repository.AssociateSeatChangeDetailsRepository;
import com.cts.employee.repository.AssociateSummaryRepository;
import com.cts.employee.repository.BCSummaryRepository;
import com.cts.employee.repository.CtsGradeRepository;
import com.cts.employee.repository.DeliveryLeadDetailsRepository;
import com.cts.employee.repository.InvoiceSummaryRepository;
import com.cts.employee.repository.ProcessDetailsRepository;
import com.cts.employee.repository.ProcessOwnerDetailsRepository;
import com.cts.employee.repository.ProjectDetailsRepository;
import com.cts.employee.repository.ProjectManagersDetailsRepository;
import com.cts.employee.repository.RegionDetailsRepository;
import com.cts.employee.repository.RolesRepository;
import com.cts.employee.repository.SeatDetailsRepository;
import com.cts.employee.repository.SectorDetailsRepository;
import com.cts.employee.repository.SegmentDetailsRepository;
import com.cts.employee.repository.ServiceLineDeatailsRepository;
import com.cts.employee.repository.ShiftTimingsRepository;
import com.cts.employee.repository.SubProcessDetailsRepository;
import com.cts.employee.repository.SubSectorDetailsRepository;
import com.cts.employee.repository.TOSummaryRepository;
import com.cts.employee.repository.TaskOrderAllocationDetailsRepository;
import com.cts.employee.repository.TeamDetailsRepository;
import com.cts.employee.repository.UsersRepository;

@SuppressWarnings("unused")
@Controller
public class AssociateController {
	
	@Autowired
	private AssociateSummaryRepository associateSummaryRepository;
	
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
	@Autowired
	private AccountManagerDetailsRepository accountManagerDetailsRepository;
	
	@Autowired
	private ProcessDetailsRepository processDetailsRepository;
	
	@Autowired
	private SubProcessDetailsRepository subProcessDetailsRepository;
	
	@Autowired
	private TeamDetailsRepository teamDetailsRepository;
	
	@Autowired
	private RegionDetailsRepository regionDetailsRepository;
	
	@Autowired
	private DeliveryLeadDetailsRepository deliveryLeadDetailsRepository;
	
	@Autowired
	private ProjectManagersDetailsRepository projectManagersDetailsRepository;
	
	@Autowired
	private ProcessOwnerDetailsRepository processOwnerDetailsRepository;
	
	@Autowired
	private AssociateSeatChangeDetailsRepository associateSeatChangeDetailsRepository;
	
	@Autowired
	private ShiftTimingsRepository shiftTimingsRepository;
	
	@Autowired
	private CtsGradeRepository ctsGradeRepository;
	
	@Autowired
	private RolesRepository rolesRepository;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private SeatDetailsRepository seatDetailsRepository;
	
	@Autowired
	private SectorDetailsRepository sectorDetailsRepository;
	
	@Autowired
	private SubSectorDetailsRepository subSectorDetailsRepository;
	
	@Autowired
	private AssociateAllocationDetailsRepository associateAllocationDetailsRepository;

	@Autowired
	private AssociateAttritionDetailsRepository associateAttritionDetailsRepository;
	
	@Autowired
	private AssociateInternalMovementsRepository associateInternalMovementsRepository;
	
	@Autowired
	private TOSummaryRepository toSummaryRepository;
	
	@Autowired
	private BCSummaryRepository bcSummaryRepository;
	
	@Autowired
	private TaskOrderAllocationDetailsRepository taskOrderAllocationDetailsRepository;
	
	@Autowired
	private InvoiceSummaryRepository invoiceSummaryRepository;
	
	@Autowired
    private ServiceLineDeatailsRepository serviceLineDeatailsRepository;
    
    @Autowired
    private SegmentDetailsRepository segmentDetailsRepository;

	
	
	
//	@Autowired
//	private ResourceUtil util;

//	@Autowired
	private User user;
	
	@RequestMapping(value="/login")
	public String login(){
		return "associate/login";
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home(Model model,HttpServletRequest request) throws IOException{
	try{
		String userName = request.getParameter("uname");
		Users users = usersRepository.findByCtsIdAndStatus(Integer.parseInt(userName),"Active");
		if(null != users){
		user = new User();
		if(!StringUtils.isEmpty(userName)){
			user.setCtsId(Integer.parseInt(userName));
			user.setFullName(associateSummaryRepository.findByAssociateCTSId(user.getCtsId()).getFull_Name());
		}
		System.out.println("Username:"+userName);
		
		if(users.getRole().equalsIgnoreCase("SPOC")){
			model.addAttribute("username", "SPOC");
		} else if(users.getRole().equalsIgnoreCase("PM")){
			model.addAttribute("username", "PM");
		}  else if(users.getRole().equalsIgnoreCase("DL")){
			model.addAttribute("username", "DL");
		}  else if(users.getRole().equalsIgnoreCase("COO")){
			model.addAttribute("username", "COO");
		}
		model.addAttribute("ctsId", userName);
				
		} else {
			model.addAttribute("errorMsg", "Invalid Username!!");
			return "associate/login";
		}
		
		model.addAttribute("user", user);
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
		return "associate/home";
	}
	
	@RequestMapping(value="/homeLogin", method = RequestMethod.GET)
	public String homeLogin(Model model,HttpServletRequest request) throws IOException{
	try{
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		String role = usersRepository.findByCtsIdAndStatusAndPwd(Integer.parseInt(userName),password,"Active");
		if(null != role){
			if(password.equals("password-123")){
				model.addAttribute("userName", userName);
				return "associate/changePassword";
			}else{
				user = new User();
				if(!StringUtils.isEmpty(userName)){
					user.setCtsId(Integer.parseInt(userName));
					user.setFullName(associateSummaryRepository.findByAssociateCTSId(user.getCtsId()).getFull_Name());
				}
				System.out.println("Username:"+userName);
				
				if(role.equalsIgnoreCase("SPOC")){
					model.addAttribute("username", "SPOC");
				} else if(role.equalsIgnoreCase("PM")){
					model.addAttribute("username", "PM");
				}  else if(role.equalsIgnoreCase("DL")){
					model.addAttribute("username", "DL");
				}  else if(role.equalsIgnoreCase("COO")){
					model.addAttribute("username", "COO");
				}
				model.addAttribute("ctsId", userName);
			}	
		} else {
			model.addAttribute("errorMsg", "Invalid Username & Password combination");
			return "associate/login";
		}
		HttpSession session = request.getSession();
		session.setAttribute("ctsId", userName);
		model.addAttribute("user", user);
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
		return "associate/home";
	}
	
	@RequestMapping(value="/getAssociate")
	public String getAssociate(Model model, @RequestParam(required = false) String ctsId, 
			@RequestParam(required = false) String projectId) throws IOException{
		try {
			AssociateSummary as =  new AssociateSummary();
			if( !StringUtils.isEmpty(ctsId) ){
				as = associateSummaryRepository.findByAssociateCTSId(Integer.parseInt(ctsId));
				as.setUpdated_By(user.getCtsId());
				
			}
			model.addAttribute("associate", loadForm(as));
			model.addAttribute("projectId", projectId);
			model.addAttribute("addMode", "false");
		}catch (Exception e){
			System.out.println("error in getAssociate " + e);
			model.addAttribute("user", user);
			return "associate/error";
		}
		return "associate/editAssociate";
	}
	
	@RequestMapping(value="/checkCtsId")
	public @ResponseBody String checkCtsId(String associateCTSId){
		AssociateSummary as = associateSummaryRepository.findByAssociateCTSId(Integer.parseInt(associateCTSId));
		if(null != as){
			return "incorrect";
		}else{
			return "correct";
		}
	}
	
	@RequestMapping(value="/getProjectDetails")
	public @ResponseBody String getProjectDetails(String projectId){
		ProjectDetails p = projectDetailsRepository.findOne(Integer.parseInt(projectId));
		ProjectManagersDetails pm = projectManagersDetailsRepository.findOne(p.getProject_Manager_Code());
		String response = "";
		List<SubProcessDetails> subProcesses = subProcessDetailsRepository.findByProcessCode(p.getProcessCode());
		if(null != pm)
			response = p.getProject_Name() + "," + p.getProcessCode() + ","
						+ processDetailsRepository.findOne(p.getProcessCode()).getProcessName() + ","
						+ subProcesses.get(0).getSubProcessCode() + ","+ subProcesses.get(0).getSubProcessName() + ","
						+ pm.getProjectManagerCTSId() + "," + pm.getProject_Manager_GPIN() + "," + pm.getProject_Manager_Name();
		return response;
	}
	
	@RequestMapping(value="/getSupervisorDetails")
	public @ResponseBody String getSupervisorDetails(String supervisorId){
		AssociateSummary pm = associateSummaryRepository.findByAssociateCTSId(Integer.parseInt(supervisorId));
		String response = "";
		if(null != pm)
			response = pm.getGPIN() + "," + pm.getFull_Name();
		return response;
	}
	
	@RequestMapping(value="/getSubProcessDetails")
	public @ResponseBody String getSubProcessDetails(String processCode){
		List<SubProcessDetails> subProcesses = subProcessDetailsRepository.findByProcessCode(processCode);
		Map<String, String> map = new HashMap<String, String>();
		String[] sps;
		for(SubProcessDetails sp : subProcesses){
			map.put(sp.getSubProcessCode(), sp.getSubProcessName());
			
		}
		return map.toString();
	}
	
	@RequestMapping(value="/getProcessOwnerDetails")
	public @ResponseBody String getProcessOwnerDetails(String process_Owner_CTS_Id){
		ProcessOwnerDetails po = processOwnerDetailsRepository.findByProcessOwnerCTSId(Integer.parseInt(process_Owner_CTS_Id));
		return po.getProcess_Owner_Name();
	}
	
	@RequestMapping(value="/getDeliveryLeadDetails")
	public @ResponseBody String getDeliveryLeadDetails(String delivery_Lead_CTS_Id){
		DeliveryLeadDetails dl = deliveryLeadDetailsRepository.findByDeliveryLeadCTSId(Integer.parseInt(delivery_Lead_CTS_Id));
		return dl.getDelivery_Lead_Name();
	}
	
	@RequestMapping(value="/getAccountDetails")
	public @ResponseBody String getAccountDetails(String account_Id){
		AccountDetails acc = accountDetailsRepository.findOne(Integer.parseInt(account_Id));
		return acc.getAccountName();
	}
	
	@RequestMapping(value="/getAccountManagerDetails")
	public @ResponseBody String getAccountManagerDetails(String account_Manager_CTS_Id){
		AccountManagerDetails am = accountManagerDetailsRepository.findByAccountManagerCTSId(Integer.parseInt(account_Manager_CTS_Id));
		return am.getAccount_Manager_Name();
	}
	
	@RequestMapping(value="/getProjectManagerDetails")
	public @ResponseBody String getProjectManagerDetails(String pmCtsId, @RequestParam(required = false) String name){
		if(!StringUtils.isEmpty(name))
			return projectManagersDetailsRepository.findDistinctByProjectManagerCTSId(
					Integer.parseInt(pmCtsId)).get(0).getProject_Manager_Name();
		else
			return String.valueOf(projectManagersDetailsRepository.findDistinctByProjectManagerCTSId(
					Integer.parseInt(pmCtsId)).get(0).getProject_Manager_GPIN());
	}
	@RequestMapping(value="/getAssociates")
	public String getAssociates(@RequestParam(required = false) String projectId, Model model) throws IOException{
	try{
		List<ProjectDetails> projects = new ArrayList<ProjectDetails>();
		List<ProjectDetails> projects1 = new ArrayList<ProjectDetails>();
		if(!StringUtils.isEmpty(user.getCtsId())){
			//List<AssociateAllocationDetails> associate = associateAllocationDetailsRepository.findByAssociateCTSId(user.getCtsId());
			List<String> associate =  associateAllocationDetailsRepository.findByAssociateCTSIdNoDuplicates(user.getCtsId());
			for(String as: associate){
				projects = null;
			projects = projectDetailsRepository.findAllByProcessCode(as);
			projects1.addAll(projects);
			}
		}
		if(!StringUtils.isEmpty(projectId)){
			List<AssociateSummary> associates = associateSummaryRepository.findAllByProjectId(Integer.parseInt(projectId));
			for(AssociateSummary as: associates){
				as.setProcess(processDetailsRepository.findOne(as.getProcess_Code()).getProcessName());
				as.setSub_Process(subProcessDetailsRepository.findOne(as.getSub_Process_Code()).getSubProcessName());
				/*as.setTeam(teamDetailsRepository.findOne(as.getTeam_Code()).getTeamName());
				as.setCTS_Grade(ctsGradeRepository.findOne(as.getCTS_Grade_Code()).getcTSGrade());
				as.setRegion(regionDetailsRepository.findOne(as.getRegion_Code()).getRegionName());*/
			}
			model.addAttribute("associates", associates);
			model.addAttribute("project_Name", projectDetailsRepository.findOne(Integer.parseInt(projectId)).getProject_Name());
		}
		model.addAttribute("user", user);
		model.addAttribute("projDetails", projects1);
		model.addAttribute("projectId", projectId);
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
	
	return "associate/associates";
	}
	
	@RequestMapping(value="/getProjects")
	public String getProjects(Model model) throws IOException{
	try{
		if(!StringUtils.isEmpty(user.getCtsId())){
			AssociateSummary associate = associateSummaryRepository.findByAssociateCTSId((user.getCtsId()));
			List<ProjectDetails> projects = projectDetailsRepository.findAll();
			//List<ProjectDetails> projects = projectDetailsRepository.findAllByProcessCode(associate.getProcess_Code());
//			ProcessDetails process = processDetailsRepository.findOne(associate.getProcess_Code());
			
			for(ProjectDetails project : projects){
//				project.setProcessName(process.getProcessName());
//				project.setSector(processDetailsRepository.findOne(project.getProcessCode()).getSector_Code());
//				project.setSubSector(processDetailsRepository.findOne(project.getProcessCode()).getSub_Sector_Code());
				project.setProjectManagerCTSId(projectManagersDetailsRepository.findOne(
						project.getProject_Manager_Code()).getProjectManagerCTSId());
				project.setProject_Manager_Name(projectManagersDetailsRepository.findOne(
						project.getProject_Manager_Code()).getProject_Manager_Name());
				project.setDelivery_Lead_CTS_Id(deliveryLeadDetailsRepository.findOne(
						project.getDelivery_Lead_Code()).getDeliveryLeadCTSId());
				project.setDelivery_Lead_Name(deliveryLeadDetailsRepository.findOne(
						project.getDelivery_Lead_Code()).getDelivery_Lead_Name());
				project.setAccount_Name(accountDetailsRepository.findOne(
						project.getAccount_Id()).getAccountName());
				AccountManagerDetails am= accountManagerDetailsRepository.findByAccountId(project.getAccount_Id()); 
				if(null != am){
					project.setAccount_Manager_CTS_Id(am.getAccountManagerCTSId());
					project.setAccount_Manager_Name(am.getAccount_Manager_Name());
				}
				project.setProcessName(processDetailsRepository.findOne(project.getProcessCode()).getProcessName());
//				project.setSub_Process(subProcessDetailsRepository.findOne(project.getSub_Process_Code()).getSubProcessName());
//				project.setTeam(teamDetailsRepository.findOne(as.getTeam_Code()).getTeamName());
//				project.setCTS_Grade(ctsGradeRepository.findOne(as.getCTS_Grade_Code()).getcTSGrade());
//				project.setRegion(regionDetailsRepository.findOne(as.getRegion_Code()).getRegionName());
				
			}
			model.addAttribute("projects", projects);
			model.addAttribute("user", user);
		}
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
	return "associate/projects";
	}
	
	@RequestMapping(value="/getProject")
	public String getProject(Model model, @RequestParam(required = false) String projectId) throws IOException{
	try{
		ProjectDetails project =  new ProjectDetails();
		if( !StringUtils.isEmpty(projectId) ){
			project = projectDetailsRepository.findOne(Integer.parseInt(projectId));
			project.setProcessName(processDetailsRepository.findOne(project.getProcessCode()).getProcessName());
//			project.setSector(processDetailsRepository.findOne(project.getProcessCode()).getSector_Code());
//			project.setSubSector(processDetailsRepository.findOne(project.getProcessCode()).getSub_Sector_Code());
//			project.setCtsId(user.getCtsId());
			project.setUpdated_By(user.getCtsId());
		}
		model.addAttribute("project", loadForm(project));
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
		return "associate/editProject";
	}
	
	@RequestMapping(value="/updateProject", method = RequestMethod.POST)
	public String updateProject(HttpServletRequest req, @ModelAttribute ProjectDetails project, Model model) throws IOException{
			System.out.println("inside updateProject");
			int projectId=0;
		try {
			projectId = project.getProjectId();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
			System.out.println("date-----"+sdf.format(new Date()));
			project.setUpdated_Date(sdf.format(new Date()));
			projectDetailsRepository.save(project);
			
		} catch (Exception e){
			System.out.println("error in saving associate:" + e);
			model.addAttribute("user", user);
			return "associate/error";
		}
//		model.addAttribute("ctsId", project.getCtsId());
		model.addAttribute("user", user);
//		return "Successfully Saved!!!";
		model.addAttribute("projectId",projectId);
		return "associate/success";
	}
	
	@RequestMapping(value="/addNewProject", method = RequestMethod.POST)
	public @ResponseBody String addNewProject(@ModelAttribute ProjectDetails project, Model model) throws IOException{
		System.out.println("inside add project");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.SSS");
			project.setUpdated_Date(sdf.format(new Date()));
			projectDetailsRepository.save(project);
		} catch (Exception e){
			System.out.println("error in saving project:" + e);
			return "Error adding Project!!!";
		}
		return "Successfully Added!!!";
	}
	
	@RequestMapping(value="/addProject", method = RequestMethod.GET)
	public String addProject(Model model) throws IOException{
	try{
		ProjectDetails projectDetails =  new ProjectDetails();
		projectDetails.setUpdated_By(user.getCtsId());
		model.addAttribute("project", loadForm(projectDetails));
	} catch (Exception e){
		System.out.println("error in addProject:" + e);
		model.addAttribute("user", user);
		return "associate/error";
	}
		return "associate/addProject";
	}
	
	@RequestMapping(value="/updateAssociate", method = RequestMethod.POST)
	public @ResponseBody String updateAssociate(@ModelAttribute AssociateSummary associateForm, Model model,HttpSession session) throws IOException{
		System.out.println("inside update associate");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
			String[] projects = (String[]) session.getAttribute("projects");
			String associateCTSId = (String) session.getAttribute("associateCTSId");
			if(associateCTSId ==null || associateCTSId ==""){
				associateCTSId = Integer.toString(associateForm.getAssociateCTSId());
			}
			System.out.println("date-----"+sdf.format(new Date()));
			associateForm.setUpdated_Date(sdf.format(new Date()));
			
			List<AssociateAllocationDetails> allAssocProjList =  associateAllocationDetailsRepository
					.findByAssociateCTSId(Integer.parseInt(associateCTSId));
			associateAllocationDetailsRepository.deleteInBatch(allAssocProjList);
			for(String project : projects){
				System.out.println(project);
				String[] p = project.split(":");
				System.out.println(p[0]+" -- "+p[1]);
				AssociateAllocationDetails allocation = new AssociateAllocationDetails();
				allocation.setAssociateCTSId(Integer.parseInt(associateCTSId));
				ProjectDetails proj = projectDetailsRepository.findOne(Integer.parseInt(p[0]));
				//AssociateSummary as = associateSummaryRepository.findByAssociateCTSId(Integer.parseInt(associateCTSId));
				
				allocation.setProject_Name(proj.getProject_Name());
				allocation.setProcess(proj.getProcessCode());
				allocation.setProjectId(Integer.parseInt(p[0]));
				allocation.setAllocation_Status("Active");
				allocation.setUpdated_By(user.getCtsId());
				allocation.setGpin(associateForm.getGPIN());
				allocation.setFullName(associateForm.getFull_Name());
				allocation.setAllocation_Percentage(Float.valueOf(p[1]));
				allocation.setUpdated_Date(sdf.format(new Date()));
				associateAllocationDetailsRepository.save(allocation);
			}
			associateSummaryRepository.save(associateForm);
			
		} catch (Exception e){
			System.out.println("error in saving associate:" + e);
		}
		return "Successfully Saved!!!";
	}
	
		
	@RequestMapping(value="/addNewAssociate", method = RequestMethod.GET)
	public @ResponseBody String addNewAssociate(@ModelAttribute AssociateSummary associateForm, Model model) throws IOException{
		System.out.println("inside add associate");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.SSS");
			associateForm.setUpdated_Date(sdf.format(new Date()));
			associateSummaryRepository.save(associateForm);
		} catch (Exception e){
			System.out.println("error in saving associate:" + e.getMessage());
			return "Error adding Associate!!!";
		}
		return "Successfully Added!!!";
	}
	
	@RequestMapping(value="/addAssociate", method = RequestMethod.GET)
	public String addAssociate(Model model) throws IOException{
		try{
		AssociateSummary associateSummary =  new AssociateSummary();
		associateSummary.setUpdated_By(user.getCtsId());
		model.addAttribute("associate", loadForm(associateSummary));
		model.addAttribute("addMode", "true");
	} catch (Exception e){
		System.out.println("error in addProject:" + e.getMessage());
		model.addAttribute("user", user);
		return "associate/error";
	}
		return "associate/editAssociate";
	}
	
	@RequestMapping(value="/allocateProjects", method = RequestMethod.GET)
	public String allocateProjects(String associateCTSId, Model model) throws IOException{
	try{
		List<ProjectDetails> projects = projectDetailsRepository.findAll();
		List<Integer> allAssocProjList =  associateAllocationDetailsRepository
				.findAllByAssociateCTSId(Integer.parseInt(associateCTSId));
		List<Allocation> allocations = new ArrayList<Allocation>();
		for(ProjectDetails p : projects){
			Allocation a = new Allocation();
			a.setChecked(allAssocProjList.contains(p.getProjectId()));
			AssociateAllocationDetails aad = associateAllocationDetailsRepository
					.findByAssociateCTSIdAndProjectId(Integer.parseInt(associateCTSId), p.getProjectId());
			if(aad != null){
				a.setAllocation_Percentage(aad.getAllocation_Percentage());
				a.setAllocation_Status(aad.getAllocation_Status());
			}
			
			//as.setProcess(processDetailsRepository.findOne(as.getProcess_Code()).getProcessName());
			//AssociateAllocationDetails aad1 = associateAllocationDetailsRepository.findProcessByProjectId(p.getProcessCode());
			
			a.setProjectId(p.getProjectId());
			a.setProjectName(p.getProject_Name());
			a.setProcessId(p.getProcessCode());
			a.setProcessName(processDetailsRepository.findOne(p.getProcessCode()).getProcessName());
			allocations.add(a);
		}
		
		model.addAttribute("associateCTSId", associateCTSId);
		model.addAttribute("allocations", allocations);
	}catch (Exception e){
		System.out.println("error: "+ e);
		model.addAttribute("user", user);
		return "associate/error";
		}
		return "associate/addProjects";
	}

	@RequestMapping(value="/saveAllocatedProjects", method = RequestMethod.POST)
	public @ResponseBody String saveAllocatedProjects(String associateCTSId, String[] projects,HttpSession session) throws IOException{
	try{
		
		//SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		session.setAttribute("associateCTSId", associateCTSId);
		session.setAttribute("projects", projects);

//		for(String project : projects){
//			System.out.println(project);
//			String[] p = project.split(":");
//			System.out.println(p[0]+" -- "+p[1]);
//			AssociateAllocationDetails allocation = new AssociateAllocationDetails();
//			allocation.setAssociateCTSId(Integer.parseInt(associateCTSId));
//			ProjectDetails proj = projectDetailsRepository.findOne(Integer.parseInt(p[0]));
//			AssociateSummary as = associateSummaryRepository.findByAssociateCTSId(Integer.parseInt(associateCTSId));
//			
//			allocation.setProject_Name(proj.getProject_Name());
//			allocation.setProcess(as.getProcess());
//			allocation.setProjectId(Integer.parseInt(p[0]));
//			allocation.setAllocation_Status("Active");
//			allocation.setUpdated_By(user.getCtsId());
//			allocation.setAllocation_Percentage(Float.valueOf(p[1]));
//			allocation.setUpdated_Date(sdf.format(new Date()));
//			associateAllocationDetailsRepository.save(allocation);
//		}
	}catch (Exception e){
		System.out.println("error: "+ e);
		return "associate/error";
		}
		return "Saved Successfully";
	}
	
	
	public static void main(String[] args){
		System.out.println("date----"+new Date());
	}
	
	@RequestMapping(value="/checkSeatNumber")
	public @ResponseBody String checkSeatNumber(String seatNumber, String shiftTimings) throws IOException{
		try {
			SeatDetails seat = seatDetailsRepository.findOne(seatNumber);
			if (null == seat) {
				return "incorrect";
			}
			if(null != seat){
				List<AssociateSummary> asList = associateSummaryRepository.findBySeatNumber(seatNumber);
				if(null != asList && asList.size() == 1){
					String seatExistsTimeOriginal = associateSummaryRepository.findAvailSeatNumberWithTime(seatNumber);
					
					String checkTime = associateSummaryRepository.checkShiftTime(seatExistsTimeOriginal,shiftTimings);
					if(null == checkTime )
						return "conflict";
					else
						return "correct";
				}else if(null != asList && asList.size() > 2){
					return "exists";
				}
			}
		} catch (Exception e) {
			System.out.println("Error checking seat number: "+e.getMessage());
		}
    		return "correct";
	}
	
	@RequestMapping(value="/checkDateFormat")
	public @ResponseBody String checkDateFormat(@RequestParam(value="doj") String doj) throws IOException{
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		try {
			Date date = sdf.parse(doj);
			if (doj.matches("\\d{4}-\\d{1,2}-\\d{1,2}")) {
				return "correct";
			}
		} catch (ParseException e) {
			System.out.println("Error parsing date: "+e.getMessage());
		}
    		return "incorrect";
	}
	
public AssociateSummary loadForm(AssociateSummary as){
		
		as.setProjectIds(projectDetailsRepository.findAllProjectIds());
		
		List<String> associateStatus = new ArrayList<String>();
		associateStatus.add("Active");
		associateStatus.add("In_Active");
		as.setAssociateStatus(associateStatus);
		
		List<String> associateBillabilityStatus = new ArrayList<String>();
		associateBillabilityStatus.add("Billable");
		associateBillabilityStatus.add("Non-billable");
		as.setAssociateBillabilityStatus(associateBillabilityStatus);
		
		List<String> associateBillabilityGrade = new ArrayList<String>();
		associateBillabilityGrade.add("L1");
		associateBillabilityGrade.add("L2");
		associateBillabilityGrade.add("L3");
		as.setAssociateBillabilityGrade(associateBillabilityGrade);
		
		List<String> associateAllocToMultProjects = new ArrayList<String>();
		associateAllocToMultProjects.add("Yes");
		associateAllocToMultProjects.add("No");
		
		List<String> bCP_Critical_Statuses = new ArrayList<String>();
		bCP_Critical_Statuses.add("Critical");
		bCP_Critical_Statuses.add("Non-Critical");
		as.setBCP_Critical_Statuses(bCP_Critical_Statuses);
		
		as.setShiftTimings(shiftTimingsRepository.findAllShiftTimings());
		as.setcTSGrades(ctsGradeRepository.findAllCtsGrades());
		
		List<String> attritionType = new ArrayList<String>();
		attritionType.add("Voluntary");
		attritionType.add("Involuntary");
		as.setAttritionType(attritionType);
		
		List<String> associateMovemntType = new ArrayList<String>();
		associateMovemntType.add("Internal Movement with in UBS");
		associateMovemntType.add("Attrition");
		associateMovemntType.add("Moved to CTS");
		as.setAssociateMovemntType(associateMovemntType);
		
		List<String> blockLeaveStatus = new ArrayList<String>();
		blockLeaveStatus.add("Availed");
		blockLeaveStatus.add("Planned");
		blockLeaveStatus.add("Not Applicable");
		as.setBlockLeaveStatus(blockLeaveStatus);
		
		List<String> hRiUpdateStatus = new ArrayList<String>();
		hRiUpdateStatus.add("Yes");
		hRiUpdateStatus.add("No");
		as.sethRiUpdateStatus(hRiUpdateStatus);
		
		List<String> regions = new ArrayList<String>();
		regions.add("Global");
		regions.add("US");
		regions.add("UK");
		regions.add("APAC");
		regions.add("CH");
		as.setRegions(regions);

		
		if(!StringUtils.isEmpty(as.getAssociateCTSId())){
			as.setProcess(processDetailsRepository.findOne(as.getProcess_Code()).getProcessName());
			as.setSub_Process(subProcessDetailsRepository.findOne(as.getSub_Process_Code()).getSubProcessName());
			//as.setTeam(teamDetailsRepository.findOne(as.getTeam_Code()).getTeamName());
			//as.setRegion(regionDetailsRepository.findOne(as.getRegion_Code()).getRegionName());
			//as.setCTS_Grade(ctsGradeRepository.findOne(as.getCTS_Grade_Code()).getcTSGrade());
		}
//		as.setAssociate_Project_Manager_CTS_Ids(projectManagersDetailsRepository.findAllProjectManagerCtsIds());
		

		return as;
	}
	
	public ProjectDetails loadForm(ProjectDetails pd){
		
		//pd.setProjectIds(projectDetailsRepository.findAllProjectIds());
		
		List<String> projectBillableStatus = new ArrayList<String>();
		projectBillableStatus.add("BTM"); 
		projectBillableStatus.add("BFD");
		projectBillableStatus.add("BTB");
		projectBillableStatus.add("NBL");
		pd.setProjectBillableStatus(projectBillableStatus);
		
		List<String> activeStatus = new ArrayList<String>();
		activeStatus.add("Active");
		activeStatus.add("In_Active");
		pd.setActiveStatus(activeStatus);
		
		pd.setProjectManagers(projectManagersDetailsRepository.findAll());
		pd.setProcessOwners(processOwnerDetailsRepository.findAll());
		pd.setDeliveryLeads(deliveryLeadDetailsRepository.findAll());
		pd.setAccountManagers(accountManagerDetailsRepository.findAll());
		pd.setAccountIds(accountDetailsRepository.findAll());
		pd.setProcessNames(processDetailsRepository.findAll());
		pd.setSectorNames(sectorDetailsRepository.findAll());
		pd.setSubSectorNames(subSectorDetailsRepository.findAll());
		pd.setServiceLineNames(serviceLineDeatailsRepository.findAll());
        pd.setSegmentNames(segmentDetailsRepository.findAll());

		return pd;
	}
	
	@RequestMapping(value="/getAssociateReports")
	public String getAssociateReports(Model model){
		List<AssociateSummary> associates = associateSummaryRepository.findAll();
		model.addAttribute("associates", associates);	
		model.addAttribute("user", user);
		return "associate/associateReport";
	}
	
	@RequestMapping(value="/getProjectReports")
	public String getProjectReports(Model model){
		try{
		List<ProjectDetails> projects = projectDetailsRepository.findAll();
		
		for(ProjectDetails project : projects){
//			project.setProcessName(process.getProcessName());
			project.setProjectManagerCTSId(projectManagersDetailsRepository.findOne(
					project.getProject_Manager_Code()).getProjectManagerCTSId());
			project.setProject_Manager_Name(projectManagersDetailsRepository.findOne(
					project.getProject_Manager_Code()).getProject_Manager_Name());
			project.setDelivery_Lead_CTS_Id(deliveryLeadDetailsRepository.findOne(
					project.getDelivery_Lead_Code()).getDeliveryLeadCTSId());
			project.setDelivery_Lead_Name(deliveryLeadDetailsRepository.findOne(
					project.getDelivery_Lead_Code()).getDelivery_Lead_Name());
			project.setAccount_Name(accountDetailsRepository.findOne(
					project.getAccount_Id()).getAccountName());
//			project.setSector(processDetailsRepository.findOne(project.getProcessCode()).getSector_Code());
//			project.setSubSector(processDetailsRepository.findOne(project.getProcessCode()).getSub_Sector_Code());
			AccountManagerDetails am= accountManagerDetailsRepository.findByAccountId(project.getAccount_Id()); 
			if(null != am){
				project.setAccount_Manager_CTS_Id(am.getAccountManagerCTSId());
				project.setAccount_Manager_Name(am.getAccount_Manager_Name());
			}
			project.setProcessName(processDetailsRepository.findOne(project.getProcessCode()).getProcessName());
		}
		model.addAttribute("projects", projects);
		model.addAttribute("user", user);		
		} catch (Exception e){
			System.out.println("error in getProjectReports:" + e.getMessage());
			model.addAttribute("user", user);
			return "associate/error";
		}
		return "associate/projectsReport";
	}
	
	@RequestMapping(value="/getSeatingReports")
	public String getSeatingReports(Model model){
		try{
		List<SeatDetails> seats = seatDetailsRepository.findAll();
		for(SeatDetails seat : seats){
			List<AssociateSummary> associates = associateSummaryRepository.findBySeatNumber(seat.getSeatNumber());
			if (null != associates  && associates.size() != 0) {
				for(int i=0;i<associates.size();i++)
					seat.setAssociate(associates.get(i));
			}
		}
		model.addAttribute("seats", seats);	
		model.addAttribute("user", user);
	} catch (Exception e){
		System.out.println("error in getSeatingReports:" + e.getMessage());
		model.addAttribute("user", user);
		return "associate/error";
	}
		return "associate/seatingReport";
	}
	
	@RequestMapping(value="/getAttritionReport")
	public String getAttritionReports(Model model){
		List<AssociateAttritionDetails> attrition = associateAttritionDetailsRepository.findAll();
		/*for(AssociateAttritionDetails attrition : attritions){
			List<AssociateSummary> associates = associateSummaryRepository.findBySeatNumber(seat.getSeatNumber());
			if (null != associates  && associates.size() != 0) {
				attrition.setAssociate(associates.get(0));
			}
		}*/
		model.addAttribute("attrition", attrition);	
		model.addAttribute("user", user);
		return "associate/attritionReport";
	}
	
	@RequestMapping(value="/getInternalMovementsReport")
	public String getInternalMovementsReports(Model model){
		List<AssociateInternalMovements> internalmovement = associateInternalMovementsRepository.findAll();
		/*for(SeatDetails seat : seats){
			List<AssociateSummary> associates = associateSummaryRepository.findBySeatNumber(seat.getSeatNumber());
			if (null != associates  && associates.size() != 0) {
				seat.setAssociate(associates.get(0));
			}
		}*/
		model.addAttribute("internalmovement", internalmovement);	
		model.addAttribute("user", user);
		return "associate/internalMovementsReport";
	}
	
	@RequestMapping(value="/getAllocationReport")
	public String getAllocationReport(Model model){
		List<AssociateAllocationDetails> allocateprojects = associateAllocationDetailsRepository.findAll();
		/*for(SeatDetails seat : seats){
			List<AssociateSummary> associates = associateSummaryRepository.findBySeatNumber(seat.getSeatNumber());
			if (null != associates  && associates.size() != 0) {
				seat.setAssociate(associates.get(0));
			}
		}*/
		model.addAttribute("allocateprojects", allocateprojects);	
		model.addAttribute("user", user);
		return "associate/allocationReport";
	}
	
	@ModelAttribute
	public void setVaryResponseHeader(HttpServletResponse response) {
		System.out.println("post handle called");
		response.addHeader("X-Frame-Options", "SAMEORIGIN");
		response.addHeader("X-Content-Type-Options", "nosniff");
		response.addHeader("X-XSS-Protection", "1; mode=block");
		response.addHeader("Cache-Control","no-cache, no-store, must-revalidate"); 
		response.addHeader("Pragma","no-cache");
		response.setHeader("Server", "");
		response.addHeader("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE");
	}
	
	@RequestMapping(value="/updatePassword", method = RequestMethod.POST)
	public @ResponseBody String updatePassword(String userId, String oldPwd, String newPwd, HttpSession session) throws IOException{
		try {
			System.out.println("inside updatePassword");
			
			int role = usersRepository.updatePwd(newPwd,Integer.parseInt(userId));
		} catch (Exception e){
			System.out.println("error in saving associate:" + e);
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping(value="/getTOTracker")
	public String getTOTracker(Model model) throws IOException{
		List<TOSummary> taskOrder = toSummaryRepository.findAll();
		model.addAttribute("taskOrder", taskOrder);	
		model.addAttribute("user", user);
		return "associate/TOSummary";
	}
	
	@RequestMapping(value="/updateTaskOrder", method = RequestMethod.POST)
	public @ResponseBody String updateTaskOrder(@ModelAttribute TOSummary taskOrderForm, Model model,HttpSession session) throws IOException{
		try {
			
			
			String projects = (String) session.getAttribute("projects");
			String s2cNumber = (String) session.getAttribute("s2cNumber");
			if(s2cNumber ==null || s2cNumber ==""){
				s2cNumber = taskOrderForm.getS2cNumber();
			}
			
			List<TaskOrderAllocationDetails> allAssocProjList =  taskOrderAllocationDetailsRepository
					.findBys2cNumber(s2cNumber);
			taskOrderAllocationDetailsRepository.deleteInBatch(allAssocProjList);
			
			String[] result = projects.split(":");
			
			for(String project : result){
				System.out.println(project);
				
				TaskOrderAllocationDetails allocation = new TaskOrderAllocationDetails();
				allocation.setS2cNumber(s2cNumber);
				ProjectDetails proj = projectDetailsRepository.findOne(Integer.parseInt(project));
				
				allocation.setProject_Name(proj.getProject_Name());
				allocation.setProcess(proj.getProcessCode());
				allocation.setProjectId(Integer.parseInt(project));
				taskOrderAllocationDetailsRepository.save(allocation);
			}
			
			System.out.println("In TaskOrder Start");
			toSummaryRepository.save(taskOrderForm);
			System.out.println("In TaskOrder End");
			
		} catch (Exception e){
			System.out.println("error in saving associate:" + e);
		}
		return "Successfully Saved!!!";
	}
	
	@RequestMapping(value="/addTaskOrder", method = RequestMethod.GET)
	public String addTaskOrder(Model model) throws IOException{
		try{
		TOSummary toSummary =  new TOSummary();
		//toSummary.setUpdated_by(user.getCtsId());
		model.addAttribute("TOSummary", loadTOForm(toSummary));
		model.addAttribute("addMode", "true");
	} catch (Exception e){
		System.out.println("error in addProject:" + e.getMessage());
		model.addAttribute("user", user);
		return "associate/error";
	}
		return "associate/addTaskOrder";
	}
	
	@RequestMapping(value="/getTaskOrder")
	public String getTaskOrder(Model model, @RequestParam(required = false) String s2c_Number) throws IOException{
		try {
				TOSummary as = toSummaryRepository.findBys2cNumber(s2c_Number);
			model.addAttribute("TOSummary", loadTOForm(as));
			model.addAttribute("addMode", "false");
		}catch (Exception e){
			System.out.println("error in getTaskOrder " + e);
			model.addAttribute("user", user);
			return "associate/error";
		}
		return "associate/addTaskOrder";
	}
	
	@RequestMapping(value="/checkTaskOrderId")
	public @ResponseBody String checkTaskOrderId(String s2cNumber){
		TOSummary as = toSummaryRepository.findBys2cNumber(s2cNumber);
		if(null != as){
			return "incorrect";
		}else{
			String as1 = toSummaryRepository.finds2cNumber_CCN(s2cNumber);
			if(as1.equalsIgnoreCase("CCN")){
				return "CCN";
			}else{
			return "correct";
			}
		}
	}
	@RequestMapping(value="/getBCDataCCN")
	public @ResponseBody BCSummary getBCDataCCN(String s2cNumber){
		String to_num = toSummaryRepository.finds2cNumber_TO(s2cNumber);
		int to_num_int = Integer.parseInt(to_num);
		BCSummary as = bcSummaryRepository.findBybCId(to_num_int);
		return as;
	}
	
public TOSummary loadTOForm(TOSummary as){
		return as;
	}
@RequestMapping(value="/addProjectsInTO", method = RequestMethod.GET)
public String addProjectsInTO(String s2cNumber, Model model) throws IOException{
try{
	List<ProjectDetails> projects = projectDetailsRepository.findAll();
	List<Integer> allAssocProjList =  taskOrderAllocationDetailsRepository
			.findAllBys2cNumber(s2cNumber);
	
	List<Allocation> allocations = new ArrayList<Allocation>();
	for(ProjectDetails p : projects){
		Allocation a = new Allocation();
		a.setChecked(allAssocProjList.contains(p.getProjectId()));
		a.setProjectId(p.getProjectId());
		a.setProjectName(p.getProject_Name());
		a.setProcessId(p.getProcessCode());
		a.setProcessName(processDetailsRepository.findOne(p.getProcessCode()).getProcessName());
		allocations.add(a);
	}
	
	model.addAttribute("s2cNumber", s2cNumber);
	model.addAttribute("allocations", allocations);
}catch (Exception e){
	System.out.println("error: "+ e);
	model.addAttribute("user", user);
	return "associate/error";
	}
	return "associate/addTaskOrderProjects";
}	

@RequestMapping(value="/saveAllocatedProjectsTo", method = RequestMethod.POST)
public @ResponseBody String saveAllocatedProjectsTo(String s2cNumber, String projects,HttpSession session) throws IOException{
try{
	
	session.setAttribute("s2cNumber", s2cNumber);
	session.setAttribute("projects", projects);

}catch (Exception e){
	System.out.println("error: "+ e);
	return "associate/error";
	}
	return "Saved Successfully";
}

@RequestMapping(value="/getBCTracker")
public String getBCTracker(Model model) throws IOException{
	List<BCSummary> businessCase = bcSummaryRepository.findAll();
	model.addAttribute("businessCase", businessCase);	
	model.addAttribute("user", user);
	return "associate/BCSummary";
}

@RequestMapping(value="/addBusinessCase", method = RequestMethod.GET)
public String addBusinessCase(Model model) throws IOException{
	try{
	BCSummary bcSummary =  new BCSummary();
	//toSummary.setUpdated_by(user.getCtsId());
	model.addAttribute("BCSummary", loadBCForm(bcSummary));
	model.addAttribute("addMode", "true");
} catch (Exception e){
	System.out.println("error in addBusinessCase:" + e.getMessage());
	model.addAttribute("user", user);
	return "associate/error";
}
	return "associate/addBusinessCase";
}

public BCSummary loadBCForm(BCSummary as){
	return as;
}
@RequestMapping(value="/checkParentTO")
public @ResponseBody String checkParentTO(String S2C_Number, String Parent_TO) throws IOException{
	try {
			String checkTime = bcSummaryRepository.checkParentTO(S2C_Number,Parent_TO);
			if(null == checkTime )
				return "error";
			else
				return "correct";
	} catch (Exception e) {
		System.out.println("Error checking checkParentTO: "+e.getMessage());
	}
		return "error";
}
@RequestMapping(value="/checkProjectTO")
public @ResponseBody String checkProjectTO(String S2C_Number, Integer ProjectId) throws IOException{
	try {
		//ProjectDetails p = projectDetailsRepository.findOne(ProjectId);
		//String response = "";
			
			String checkProj = bcSummaryRepository.checkProjectTO(S2C_Number,ProjectId);
		
			if(null == checkProj )
				return "error";
			else{
				String[] words=checkProj.split("\\*");
			String pname = processDetailsRepository.findOne(words[1]).getProcessName();
				checkProj = checkProj+"*"+pname;
				return checkProj;
			}
	} catch (Exception e) {
		System.out.println("Error checking checkProjectTO: "+e.getMessage());
	}
		return "error";
}
@RequestMapping(value="/addBusinessCase", method = RequestMethod.POST)
public @ResponseBody String addBusinessCase(@ModelAttribute BCSummary businessCaseForm, Model model,HttpSession session) throws IOException{

		boolean isbcAvaiiable=validateBusinessCase(businessCaseForm.getS2C_Number(),businessCaseForm.getBC_Year(),businessCaseForm.getBC_Month(),businessCaseForm.getProjectId(),businessCaseForm.getParent_TO());
		
		if(isbcAvaiiable){
			return saveBusinessCase( businessCaseForm);
		}else{
			return "false";
		}
		
}

public String saveBusinessCase(BCSummary businessCaseForm){
	try{
		
	int delId = businessCaseForm.getbCId();
	if(delId ==0){
		String bCId = bcSummaryRepository.getSeq();
		int seq = 0;
		if(bCId == null)
			businessCaseForm.setbCId(1);
		else{
			seq = Integer.parseInt(bCId) + 1;
			businessCaseForm.setbCId(seq);
		}
	}else{
		bcSummaryRepository.delBC(delId);
		businessCaseForm.setbCId(delId);
	}
	businessCaseForm.setUpdated_By(user.getCtsId().toString());
	System.out.println("In BusinessCase Start");
	bcSummaryRepository.save(businessCaseForm);
	System.out.println("In BusinessCase End");
	
} catch (Exception e){
	System.out.println("error in saving Businesss Case:" + e);
}
return "true";
	
}

public Boolean validateBusinessCase(String sToNumber,int year,int month,int projectid,String parentTo){
	System.out.println("===in validation");
	Boolean val=null;
	String type=toSummaryRepository.finds2cNumber_CCN(sToNumber);
	System.out.println("type================="+type);
	String validatioonres=null;
	 if("CCN".equals(type)){
		System.out.println("-------------"+year+","+month+","+projectid+","+parentTo);
		BCSummary bcSummery=bcSummaryRepository.findInvoiceSummarybyDateProjectIdS2C_Number(year,month,projectid,parentTo);
		System.out.println("bc details==========================="+bcSummery);
		if(bcSummery==null){
			val = true;
		}else{
			val = false;
		}
	}else{
		val=true;
	} 
	 System.out.println("==="+val);
	return val;
	
	
}

@RequestMapping(value="/getBusinessCase")
public String getBusinessCase(Model model, @RequestParam(required = false) Integer bCId) throws IOException{
	try {
			BCSummary as = bcSummaryRepository.findBybCId(bCId);
		model.addAttribute("BCSummary", loadBCForm(as));
		model.addAttribute("addMode", "false");
	}catch (Exception e){
		System.out.println("error in getBusinessCase " + e);
		model.addAttribute("user", user);
		return "associate/error";
	}
	return "associate/addBusinessCase";
}
@RequestMapping(value="/getInvoiceTracker")
public String getInvoiceTracker(Model model) throws IOException{
	List<InvoiceSummary> invoiceTracker = invoiceSummaryRepository.findAll();
	model.addAttribute("invoiceTracker", invoiceTracker);	
	model.addAttribute("user", user);
	return "associate/InvoiceSummary";
}
@RequestMapping(value="/addInvoiceTracker", method = RequestMethod.GET)
public String addInvoiceTracker(Model model) throws IOException{
	try{
	InvoiceSummary invoiceSummary =  new InvoiceSummary();
	//toSummary.setUpdated_by(user.getCtsId());
	model.addAttribute("InvoiceSummary", loadInvoiceForm(invoiceSummary));
	model.addAttribute("addMode", "true");
} catch (Exception e){
	System.out.println("error in addInvoiceTracker:" + e.getMessage());
	model.addAttribute("user", user);
	return "associate/error";
}
	return "associate/addInvoiceTracker";
}
public InvoiceSummary loadInvoiceForm(InvoiceSummary as){
	return as;
}
@RequestMapping(value="/checkProjectIT")
public @ResponseBody String checkProjectIT(Integer Project_Id) throws IOException{
	try {
		//ProjectDetails p = projectDetailsRepository.findOne(ProjectId);
		//String response = "";
			String checkProj = invoiceSummaryRepository.checkProjectIT(Project_Id);
			if(null == checkProj )
				return "error";
			else{
				/*checkProj = p.getProject_Name() + "," + p.getProcessCode() + ","
						+ processDetailsRepository.findOne(p.getProcessCode()).getProcessName();*/
				String[] words=checkProj.split("\\*");
				int pmId =  projectManagersDetailsRepository.findOne(words[2]).getProjectManagerCTSId();
				String pmName =  projectManagersDetailsRepository.findOne(words[2]).getProject_Manager_Name();
				String process = processDetailsRepository.findOne(words[1]).getProcessName();
				String amName = accountManagerDetailsRepository.findOne(words[3]).getAccount_Manager_Name();
				int amId = accountManagerDetailsRepository.findOne(words[3]).getAccountManagerCTSId();
				int accId = invoiceSummaryRepository.checkAccIT(Project_Id);
				String accName = accountDetailsRepository.findOne(accId).getAccountName();
				checkProj = checkProj+"*"+pmId+"*"+pmName+"*"+process+"*"+amId+"*"+amName+"*"+accId+"*"+accName;
				return checkProj;
			}
	} catch (Exception e) {
		System.out.println("Error checking checkProjectTO: "+e.getMessage());
	}
		return "error";
}

@RequestMapping(value="/addInvoiceTracker", method = RequestMethod.POST)
public @ResponseBody String addInvoiceTracker(@ModelAttribute InvoiceSummary invoiceCaseForm, Model model,HttpSession session) throws IOException{
	try {
		
		invoiceCaseForm.setUpdated_By(user.getCtsId().toString());
		System.out.println("In Invoice Tracker Start");
		invoiceSummaryRepository.save(invoiceCaseForm);
		System.out.println("In Invoice Tracker End");
		
	} catch (Exception e){
		System.out.println("error in saving Businesss Case:" + e);
	}
	return "Successfully Saved!!!";
}
@RequestMapping(value="/getInvoice")
public String getInvoice(Model model, @RequestParam(required = false) String Invoice_Id) throws IOException{
	try {
			InvoiceSummary as = invoiceSummaryRepository.findByinvoiceId(Invoice_Id);
		model.addAttribute("InvoiceSummary", loadInvoiceForm(as));
		model.addAttribute("addMode", "false");
	}catch (Exception e){
		System.out.println("error in getInvoice " + e);
		model.addAttribute("user", user);
		return "associate/error";
	}
	return "associate/addInvoiceTracker";
}

@ModelAttribute("s2cNumberlist")
public Map<String, String>  getSectorList(){
	Map<String,String> s2cNumberlist=new LinkedHashMap<String, String>();
	List<TOSummary> TOSummaryList = toSummaryRepository.findAllTOSummaryDetails();	
	for(TOSummary subSectorDetailsobj : TOSummaryList){		
		s2cNumberlist.put(subSectorDetailsobj.getS2cNumber(), subSectorDetailsobj.getS2cNumber());
	}
	return s2cNumberlist;
	
}


@RequestMapping(value="/getProjectByStocnNumber", method = RequestMethod.GET)
public @ResponseBody List<Integer> getProjectByStocnNumber(@RequestParam("id") String s2cnumber){
	List<Integer> ProjectIdList = taskOrderAllocationDetailsRepository.findAllBys2cNumber(s2cnumber);
	return ProjectIdList;
}

}
