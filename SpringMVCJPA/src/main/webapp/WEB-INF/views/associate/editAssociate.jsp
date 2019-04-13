<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">

<style>

body {
    background-color: powderblue;
  }
table {
    width: auto;
    margin-left: auto;
    margin-right: auto;
}
h1 {
	text-align: center;
  	font-family: Helvetica, Geneva, Arial,
        SunSans-Regular, sans-serif
     }

  div.error { color:red; font-weight: bold; font-size: 14px; }
  .input-disabled{background-color:#EBEBE4;border:1px solid #ABADB3;padding:2px 1px;}
</style>
<html>
<head><title>Add / Edit Associate</title></head>
<script type="text/javascript">
$(document).ready(function () {
	$.ajaxSetup({ cache: false });
	var mode = '${addMode}';
	if(mode=='true'){
		$("#addMode").show();
		$("#editMode").hide();
		/* $('#associate_Movement_Type').attr('readonly', true);$('#associate_Movement_Type').addClass('input-disabled');
		$('#reason').attr('readonly', true);$('#reason').addClass('input-disabled');
		$('#movement_Effective_Date').attr('readonly', true);$('#movement_Effective_Date').addClass('input-disabled'); */
		$('#empMovemnt').hide();
		$('#empreason').hide();
		$('#empMovemntDate').hide();
		$('#gpnDeactRaised').hide();
		$('#gpnDeacttkt').hide();
		
	}
	else{
		$("#editMode").show();
		$("#addMode").hide();
		$('#associateCTSId').attr('readonly', true);$('#associateCTSId').addClass('input-disabled');
		$('#GPIN').attr('readonly', true);$('#GPIN').addClass('input-disabled');
		$('#first_Name').attr('readonly', true);$('#first_Name').addClass('input-disabled');
		$('#middle_Name').attr('readonly', true);$('#middle_Name').addClass('input-disabled');
		$('#last_Name').attr('readonly', true);$('#last_Name').addClass('input-disabled');
		$('#full_Name').attr('readonly', true);$('#full_Name').addClass('input-disabled');
		$('#gender').attr('readonly', true);$('#gender').addClass('input-disabled');
		$('#previous_Employer').attr('readonly', true);$('#previous_Employer').addClass('input-disabled');
		$('#previous_Experience').attr('readonly', true);$('#previous_Experience').addClass('input-disabled');
		$('#Cts_DOJ').attr('readonly', true);$('#Cts_DOJ').addClass('input-disabled');
	}
	$('#project_Name').attr('readonly', true);$('#project_Name').addClass('input-disabled');
	$('#process').attr('readonly', true);$('#process').addClass('input-disabled');
	$('#sub_Process').attr('readonly', true);$('#sub_Process').addClass('input-disabled');
	$('#supervisor_GPIN').attr('readonly', true);$('#supervisor_GPIN').addClass('input-disabled');
	$('#supervisor_Name').attr('readonly', true);$('#supervisor_Name').addClass('input-disabled');
	$('#project_Manager_CTS_Id').attr('readonly', true);$('#project_Manager_CTS_Id').addClass('input-disabled');
	$('#project_Manager_GPIN').attr('readonly', true);$('#project_Manager_GPIN').addClass('input-disabled');
	$('#project_Manager_Name').attr('readonly', true);$('#project_Manager_Name').addClass('input-disabled');
	$('#mode').val(mode);
	
$("#projectId").change(function () {
    var projectId = this.value;
    $.ajax({        	
        type: "GET",
        url: "getProjectDetails.html?projectId="+projectId,
        success : function(data){
        	var values=data.split(',');
        	$("#project_Name").val(values[0]);
        	$("#process_Code").val(values[1]);
        	$("#process").val(values[2]);
        	$("#sub_Process_Code").val(values[3]);
        	$("#sub_Process").val(values[4]);
        	$("#project_Manager_CTS_Id").val(values[5]);
        	$("#project_Manager_GPIN").val(values[6]);
        	$("#project_Manager_Name").val(values[7] + "," + values[8]);
        }
   	}); 
  });
  $("#associate_Movement_Type").change(function () {
	    var movType = this.value;
	  if(movType != 'Attrition'){
		  $("#attType").hide();
		  $("#gpnDeactRaised").hide();
		  $("#gpnDeacttkt").hide();
	  } else {
		  $("#attType").show();
		  $("#gpnDeactRaised").show();
		  $("#gpnDeacttkt").show();
	  }
	  });
  
  $("#associate_Status").change(function () {
	    var empStatus = this.value;
	  if(empStatus != 'In_Active'){
		  $("#project").show();
		  $("#projName").show();
		  $("#proc").show();
		  $("#subProc").show();
		  $("#tm").show();
		  $("#rg").show();
		  $("#BillEffDt").show();
		  $("#desig").show();
		  $("#desigEffective").show();
		  $("#billGrade").show();
		  $("#billStatus").show();
		  $("#bcpStatus").show();
		  $("#seatNum").show();
		  $("#shiftTiming").show();
		  $("#blStatus").show();
		  $("#blFrom").show();
		  $("#blTo").show();
		  $("#hriUpdate").show();
		  $("#empUN").show();
		  $("#empVdi").show();
		  $("#empMailId").show();
		  $("#empClientMail").show();
		  $("#empContactNum").show();
		  $("#empAddress").show();
		  $("#supCtsId").show();
		  $("#supGPN").show();
		  $("#supName").show();
		  $("#pmCtsId").show();
		  $("#pmGPN").show();
		  $("#pmName").show();
		  $("#allbuton").show();
		/*  $("#gpnDeactRaised").hide();
		  $("#gpnDeacttkt").hide(); */
		 
	  } else {
		  $("#project").hide();
		  $("#projName").hide();
		  $("#proc").hide();
		  $("#subProc").hide();
		  $("#tm").hide();
		  $("#rg").hide();
		  $("#BillEffDt").hide();
		  $("#desig").hide();
		  $("#desigEffective").hide();
		  $("#billGrade").hide();
		  $("#billStatus").hide();
		  $("#bcpStatus").hide();
		  $("#seatNum").hide();
		  $("#shiftTiming").hide();
		  $("#blStatus").hide();
		  $("#blFrom").hide();
		  $("#blTo").hide();
		  $("#hriUpdate").hide();
		  $("#empUN").hide();
		  $("#empVdi").hide();
		  $("#empMailId").hide();
		  $("#empClientMail").hide();
		  $("#empContactNum").hide();
		  $("#empAddress").hide();
		  $("#supCtsId").hide();
		  $("#supGPN").hide();
		  $("#supName").hide();
		  $("#pmCtsId").hide();
		  $("#pmGPN").hide();
		  $("#pmName").hide();
		  $("#allbuton").hide();
		 /*  $("#gpnDeactRaised").hide();
		  $("#gpnDeacttkt").hide(); */
		 		 
	  }
	  });
  
  $("#Cts_DOJ").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
	  
  
  $("#shift_Timing").change(function () {
	    var shiftTimings = this.value;
	    var seatNumber = $("#seatNumber").val();
	    var pageData = "seatNumber="+seatNumber +"&shiftTimings=" + shiftTimings;
	    if(seatNumber ==""){
	    	alert("Please enter Seat Number");
	    	$("#shift_Timing").val("");
	    }else{
	    $.ajax({        	
	        type: "GET",
	        url: "checkSeatNumber.html",
	        data: pageData,
	        success : function(data){
	        	if(data == "exists")
	        		alert("Seat number already allocated!");
	        	if(data == "incorrect")
	        		alert("Please enter correct seat number!");
	        	if(data == "conflict")
	        		alert("Shift Timing Conflict!");
	        }
	   	}); 
}
	  });
  
	 
	  
  $("#UBS_Latest_Hire_Date").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
  $("#CTS_Grade_Effective_Date").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
  $("#billability_Effective_Date").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
  $("#block_Leave_From").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
  $("#block_Leave_To").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
  $("#movement_Effective_Date").change(function () {
	    var doj = this.value;
	    if(doj != ""){
	    $.ajax({        	
	        type: "GET",
	        url: "checkDateFormat.html?doj="+ doj,
	        success : function(data){
	        	if(data != "correct")
	        		alert("Please enter date in 'YYYY-MM-DD' format");
	        }
	   	}); 
	    }
	  });
$("#saveBtn").click(function(e){
	//e.preventDefault();
	//$("#editAssociateForm").submit();
	$("#editAssociateForm").validate({
	    rules: {
	    	associateCTSId: {required:true, minlength:6, maxlength:6, number:true},
	    	full_Name: {required:true},
	    	//gender: {required:true},
	    	//marital_Status: {required:true},
	    	associate_Status: {required:true},
	    	projectId: {required:true},
	    	project_Name: {required:true, maxlength: 100},
	    	process: {required:true, maxlength: 100},
	    	billability_Status: {required:true},
	    	billability_Grade: {required:true},
	    	supervisor_CTS_Id:{number: true},
	    	supervisor_GPIN:{number: true},
	    	project_Manager_GPIN:{number: true},
	    	BCP_Critical_Status: {required:true},
	    	seatNumber: {required:true, minlength:16, maxlength:16},
	    	shift_Timing: {required:true}
	      },    	      
	    errorElement: "div",
	    submitHandler: function(form) {
	    	$(this).submit();
	    	var form = $("#editAssociateForm");			
		   	var data = $("#editAssociateForm").serialize();			
	      	$.ajax({  
	      		type: form.attr('method'),
	            url: "updateAssociate",//form.attr('action'),	            
	            data : data,
	            datatype : "application/json",
	            success : function(result){	            	
		          	alert(result); 
		          	window.location.href="getAssociates.html?projectId=" + $("#projectId").val();
    			},
	            error : function(callback){
	            	alert("Error saving associate");	            	
	            }
	       	});
	    } 
	});	
});

$("#allocationBtn").click(function(){
	var associateCTSId = $("#associateCTSId").val();
	if(associateCTSId==""){
		alert("Please Enter Associate CTS ID");
		$("#associateCTSId").focus();
		return false;
	}
	$.ajax({        	
	        type: "GET",
	        url: "allocateProjects.html?associateCTSId="+$("#associateCTSId").val(),
	        success : function(data){
	        	$("#allocateProjects").html("");
				$("#allocateProjects").html(data).dialog({
					title: "Allocate Projects",
					autoOpen:false,
					modal:true,
					width: 900,
					height: 600,
					position: { my: 'top', at: 'top+80' },
					resizeable: true
				}).dialog("open");
	        }
	   	}); 
});

$("#supervisor_CTS_Id").change(function () {
	 var supervisorId = this.value;
	    $.ajax({        	
	        type: "GET",
	        url: "getSupervisorDetails.html?supervisorId="+supervisorId,
	        error: function(){
	        	alert("Supervisor CTS Id is Invalid");
	        },
	        success : function(data){
	        	var values=data.split(',');
	        	$("#supervisor_GPIN").val(values[0]);
	        	$("#supervisor_Name").val(values[1]);
	        }
	   	}); 
 }); 
 
$("#associateCTSId").change(function () {
   	$.ajax({        	
        type: "GET",
        url: "checkCtsId.html?associateCTSId="+ $("#associateCTSId").val(),
        success : function(data){
        	if(data != "correct"){
        		alert("CTS Id already exists!");
        		$("#associateCTSId").val("");
        		return false;
        	}
	        }
	   	}); 
  }); 

});	
</script>
<body>
<div id="addMode"><h1>Add Associate</h1></div>
<div id="editMode"><h1>Edit Associate</h1></div>
<div style="float: right;" ><a href="getAssociates.html?projectId=${projectId}">Go back</a></div>
<%-- <div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div> --%>
<form:form commandName="associate" id="editAssociateForm" name="editAssociateForm" method="post">
		<form:errors path="*"/>
		<form:hidden path="process_Code"/>
		<form:hidden path="sub_Process_Code"/>
		<div id="allocateProjects"></div>
		<table style="width: 50%;">
		<tbody>
			<tr>
				<td>Associate CTS ID</td> 
				<td ><form:input path="associateCTSId" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>GPIN</td>
				<td><form:input path="GPIN" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="first_Name" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><form:input path="middle_Name" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="last_Name" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td><form:input path="full_Name" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
				<form:select path="gender" style="width: 300px;">
					<form:option value="">Select</form:option>
					<form:option value="Male">Male</form:option>
					<form:option value="Female">Female</form:option>
				</form:select>
				<%-- <form:input path="gender" style="width: 300px;" /> --%>
				</td>
			</tr>
			<tr>
				<td>Marital Status</td>
				<td>
				<form:select path="marital_Status" style="width: 300px;">
					<form:option value="">Select</form:option>
					<form:option value="Married">Married</form:option>
					<form:option value="Single">Single</form:option>
				</form:select>
				<%-- <form:input path="marital_Status" style="width: 300px;" /> --%>
				</td>
			</tr>
			<tr>
				<td>Previous Employer</td>
				<td><form:input path="previous_Employer" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>Previous Experience</td>
				<td><form:input path="previous_Experience" style="width: 300px;"/></td>
			</tr>
			<tr>
				<td>CTS DOJ</td>
				<td><form:input path="Cts_DOJ" style="width: 300px;"/></td>
				<td> <font color="red">yyyy-mm-dd</font></td>
			</tr>
			<tr>
				<td>UBS Latest Hire Date</td>
				<td><form:input path="UBS_Latest_Hire_Date" style="width: 300px;"/></td>
				
			</tr>
			<tr>
				<td>Associate Status</td><td><form:select path="associate_Status" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.associateStatus}"/>
					</form:select>
			</tr>
			
			<tr id="project" style="display: show;">
				<td>Parent Working PId</td>
				<td><form:select path="projectId" style="width: 300px;">
					 <form:option value="">Select</form:option>  
					<form:options items="${associate.projectIds}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.projectIds}" var="projId">
	                		<form:form:option value="${projId}">${projId}</form:form:option>                        
						</c:forEach> --%>
	                 </form:select>
			</td>
				<%-- <td><form:input path="projectId"></td> --%>
			</tr>
			<tr id="projName" style="display: show;">
				<td>Project Name</td><td><form:input path="project_Name" style="width: 300px;"/></td>
			</tr>
			<tr id="proc" style="display: show;">
				<td>Process</td><td><form:input path="process" style="width: 300px;"/></td>
			</tr>
			<tr id="subProc" style="display: show;">
				<td>Sub Process</td><td><form:input path="sub_Process" style="width: 300px;"/></td>
			</tr>
			<tr id="tm" style="display: show;">
				<td>Team</td><td><form:input path="team" style="width: 300px;"/></td>
			</tr>
			<tr id="rg" style="display: show;">
				<td>Region</td>
				<td><form:select path="region" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.regions}"/>
					</form:select>
	             </td>
			</tr>
			<tr id="allbuton" style="display: show;">
				<td>Allocation % of Project(s)</td>
	           <td><input type="button" id="allocationBtn" value="Allocation"/></td>
			</tr>
			<tr id="desig" style="display: show;">
				<td>CTS Grade</td>
				<td><form:select path="CTS_Grade" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.cTSGrades}"/>
							<%-- <c:forEach items="${associate.cTSGrades}" var="grade">
	                		<form:option value="${grade.cTSGradeCode}">${grade.cTSGrade}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
	             <%-- <td><form:select path="shift_Timing" style="width: 300px;">
					<form:option value="">Select</form:option> 
						<form:options items="${associate.shiftTimings}"/> --%>
				<%-- <td><form:input path="CTS_Grade"></td> --%>
			</tr>
			<tr id="desigEffective" style="display: show;">
				<td>CTS Grade Effective Date</td>
				<td><form:input path="CTS_Grade_Effective_Date" style="width: 300px;"/></td>
				
			</tr>
			<tr id="billStatus" style="display: show;">
				<td>Billability Status</td>
				<td><form:select path="billability_Status" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.associateBillabilityStatus}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.associateBillabilityStatus}" var="billability">
	                		<form:option value="${billability}">${billability}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
				<%-- <td><form:input path="associate_Billability_Status"></td> --%>
			</tr>
			<tr id="billGrade" style="display: show;">
				<td>Billability Grade</td>
				<td><form:select path="billability_Grade" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.associateBillabilityGrade}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.associateBillabilityGrade}" var="billability">
	                		<form:option value="${billability}">${billability}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
			</tr>
			<tr id="BillEffDt" style="display: show;">
				<td>Billability Effective Date</td>
				<td><form:input path="billability_Effective_Date" style="width: 300px;"/></td>
				
			</tr>
			
			<tr id="supCtsId" style="display: show;">
				<td>Supervisor CTS Id</td>
				<td><form:input path="supervisor_CTS_Id" style="width: 300px;"/></td>
			</tr>
			<tr id="supGPN" style="display: show;">
				<td>Supervisor GPIN</td>
				<td><form:input path="supervisor_GPIN" style="width: 300px;"/></td>
			</tr>
			<tr id="supName" style="display: show;">
				<td>Supervisor Name</td>
				<td><form:input path="supervisor_Name" style="width: 300px;"/></td>
			</tr>
			<tr id="pmCtsId" style="display: show;">
				<td>Project Manager CTS Id</td>
				<td><form:input path="project_Manager_CTS_Id" style="width: 300px;"/></td>
				<%-- <td><form:select path="project_Manager_CTS_Id" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.associate_Project_Manager_CTS_Ids}"/>
						<form:option value="">Select</form:option>   
						<c:forEach items="${associate.associate_Project_Manager_CTS_Ids}" var="pmCtsId">
	                		<form:option value="${pmCtsId}">${pmCtsId}</form:option>                        
						</c:forEach>
	                 </form:select>
	             </td> --%>
				<%-- <td><form:input path="associate_Project_Manager_CTS_Id"></td> --%>
			</tr>
			<tr id="pmGPN" style="display: show;">
				<td>Project Manager GPIN</td>
				<td><form:input path="project_Manager_GPIN" style="width: 300px;"/></td>
			</tr>
			<tr id="pmName" style="display: show;">
				<td>Project Manager Name</td>
				<td><form:input path="project_Manager_Name" style="width: 300px;"/></td>
			</tr>
			<tr id="bcpStatus" style="display: show;">
				<td>BCP Critical Status</td>
				<td><form:select path="BCP_Critical_Status" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.BCP_Critical_Statuses}"/>
						<%-- <form:form:option value="">Select</form:form:option>   
						<c:forEach items="${associate.BCP_Critical_Statuses}" var="bcpStatus">
	                		<form:form:option value="${bcpStatus}">${bcpStatus}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
				<%-- <form:input path="BCP_Critical_Status"></td> --%>
			</tr>
			<tr id="seatNum" style="display: show;">
				<td>Seat Number</td><td><form:input path="seatNumber" style="width: 300px;"/></td>
			</tr>
			<tr id="shiftTiming" style="display: show;">
				<td>Shift Timing</td>
				<td><form:select path="shift_Timing" style="width: 300px;">
					<form:option value="">Select</form:option> 
						<form:options items="${associate.shiftTimings}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.shiftTimings}" var="shift">
	                		<form:option value="${shift}">${shift}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
				<%-- <td><form:input value="shift_Timings"></td> --%>
			</tr>
				<form:input type="hidden" path="block_Leave_Status" style="width: 300px;"/>
				<form:input type="hidden" path="block_Leave_From" style="width: 300px;"/>
				<form:input type="hidden" path="block_Leave_To" style="width: 300px;"/>
				<form:input type="hidden" path="hRi_Update_Status" style="width: 300px;"/>
			<tr id="empUN" style="display: show;">
				<td>UBS Short Name</td><td><form:input path="associate_User_Name" style="width: 300px;"/></td>
			</tr>
			<tr id="empVdi" style="display: show;">
				<td>UBS VDI Number</td><td><form:input path="VDI_Number" style="width: 300px;"/></td>
			</tr>
			<tr id="empMailId" style="display: show;">
				<td>Associate CTS Email ID</td><td><form:input path="associate_CTS_Email" style="width: 300px;"/></td>
			</tr>
			<tr id="empClientMail" style="display: show;">
				<td>Associate UBS Email ID</td><td><form:input path="associate_UBS_Email" style="width: 300px;"/></td>
			</tr>
			<tr id="empContactNum" style="display: show;">
				<td>Associate Contact Number</td><td><form:input path="associate_Contact_Number" style="width: 300px;"/></td>
			</tr>
			<tr id="empAddress" style="display: show;">
				<td>Associate Address</td><td><form:input path="associate_Address" style="width: 300px;"/></td>
			</tr>
			
			<tr id="empMovemnt" style="display: show;">
				<td>Associate Movement Type</td>
				<td><form:select path="associate_Movement_Type" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.associateMovemntType}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.associateMovemntType}" var="attrition">
	                		<form:option value="${attrition}">${attrition}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
				<%-- <td><form:input path="attrition_Type"></td> --%>
			</tr>
			<tr id="attType" style="display: none;">
				<td>Attrition Type</td>
				<td><form:select path="attrition_Type" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${associate.attritionType}"/>
						<%-- <form:option value="">Select</form:option>   
						<c:forEach items="${associate.attritionType}" var="attrition">
	                		<form:option value="${attrition}">${attrition}</form:option>                        
						</c:forEach> --%>
	                 </form:select>
	             </td>
				<%-- <td><form:input path="attrition_Type"></td> --%>
			</tr>
			<tr id="empreason" style="display: show;">
				<td>Reason</td>
				<td><form:input path="reason" style="width: 300px;"/></td>
			</tr>
			<tr id="empMovemntDate" style="display: show;">
				<td>Movement Effective Date</td>
				<td><form:input path="movement_Effective_Date" style="width: 300px;"/></td>
			</tr>
			<tr id="gpnDeactRaised" style="display: none;">
				<td>GPN Deactivation Raised</td>
				<td><form:select path="gpn_Deactivation_raised" style="width: 300px;">
					<form:option value="">Select</form:option>
					<form:option value="Yes">Yes</form:option>
					<form:option value="No">No</form:option>
				</form:select><td>
				<%-- <td><form:input path="gpn_Deactivation_raised" style="width: 300px;"/></td> --%>
			</tr>
			<tr id="gpnDeacttkt" style="display: none;">
				<td>GPN Deactivation tkt#</td>
				<td><form:input path="gpn_Deatctivation_Tkt_Num" style="width: 300px;"/></td>
			</tr>
			
			<form:input type="hidden" path="updated_By" style="width: 300px;" readonly="true"/>
			<tr>
				
				<td style="float: right;">
				<input type="reset" id="clear"  value="Clear"/>
				<%-- <form:button id="clear" value="Clear">Clear</form:button> --%>
				</td>
				<td><form:button id="saveBtn" value="Save">Save</form:button></td>
			</tr>
		</tbody>
		<form:input type="hidden" id="mode" path="mode" style="width: 300px;"/>
	</table>
</form:form>
</body>
</html>