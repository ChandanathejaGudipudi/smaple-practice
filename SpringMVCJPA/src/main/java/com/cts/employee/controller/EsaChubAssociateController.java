package com.cts.employee.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.employee.domain.RevenuePojo;
import com.cts.employee.service.BcmChubCompareServoice;
import com.cts.employee.service.RevenueProjectionService;

@Controller
public class EsaChubAssociateController {
	
	@Autowired
	RevenueProjectionService revenueProjectionService;
	
	@Autowired
	BcmChubCompareServoice bcmChubCompareServoice;
	
	
	@RequestMapping(value="/esaassociatesummery")
	public String login(Model model,HttpServletRequest request){
		RevenuePojo revenuePojo =  new RevenuePojo();
		HttpSession session = request.getSession();
		model.addAttribute("userid", session.getAttribute("ctsId"));
		model.addAttribute("RevenuePojo", revenuePojo);			
		return "associate/esaassociatesummery";
	}
	
	@ModelAttribute("sectorList")
	public Map<String, String>  getSectorList(){
		Map<String,String> sectorList = revenueProjectionService.getSubsector();	
		return sectorList;		
	}
	
	@RequestMapping(value="/bcm/associatateSummary",method=RequestMethod.GET)
	@ResponseBody
	public String getAssociatateSummary(@RequestParam("projectId") String projectId){
		
		String result = bcmChubCompareServoice.getBcmChubAssociateSummery(projectId);
		
		return result;
		
	}
	

}
