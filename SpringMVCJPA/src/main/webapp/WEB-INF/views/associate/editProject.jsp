<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
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
        SunSans-Regular, sans-serif }

  div.error { color:red; font-weight: bold; font-size: 14px; }
</style>
<html>
<title>Edit Project</title>
<script>
  $(document).ready( function() {
	  
	  $("#projectForm").validate({
		    errorElement: "div",
		    submitHandler: function(form) {
		    	alert("1234");
			   	var formData = $("#projectForm").serialize();			
			   	$.ajax({  
		      		type: "POST",
		      		//type: form.attr('method'),
		            url: "updateProject",//form.attr('action'),	            
		            data : formData,
		           // datatype : "application/json",
		            success : function(result){	            	
			          	alert(result); 
			          	window.location.href="getProjects.html";
	  			},
		            error : function(callback){
		            	alert("Error saving project");	            	
		            }
		       	});
		    } 
		});	

	  /* $("#projectManagerCTSId").change(function () {
		    var projectManagerCTSId = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "getProjectManagerDetails.html?pmCtsId="+projectManagerCTSId+"&name=yes",
		        success : function(data){
		        	$("#project_Manager_Name").val(data);
		        }
		   	}); 
		  });
	  
	  $("#process_Owner_CTS_Id").change(function () {
		    var process_Owner_CTS_Id = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "getProcessOwnerDetails.html?process_Owner_CTS_Id="+process_Owner_CTS_Id,
		        success : function(data){
		        	$("#process_Owner_Name").val(data);
		        }
		   	}); 
		  });
	  
	  $("#delivery_Lead_CTS_Id").change(function () {
		    var delivery_Lead_CTS_Id = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "getDeliveryLeadDetails.html?delivery_Lead_CTS_Id="+delivery_Lead_CTS_Id,
		        success : function(data){
		        	$("#delivery_Lead_Name").val(data);
		        }
		   	}); 
		  });
	  
	  $("#account_Id").change(function () {
		    var account_Id = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "getAccountDetails.html?account_Id="+account_Id,
		        success : function(data){
		        	$("#account_Name").val(data);
		        }
		   	}); 
		  });
	  $("#account_Manager_CTS_Id").change(function () {
		    var account_Manager_CTS_Id = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "getAccountManagerDetails.html?account_Manager_CTS_Id="+account_Manager_CTS_Id,
		        success : function(data){
		        	$("#account_Manager_Name").val(data);
		        }
		   	}); 
		  });
	 */  
	 
	 $("#effective_Date").change(function () {
		    var doj = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "checkDateFormat.html?doj="+ doj,
		        success : function(data){
		        	if(data != "correct")
		        		alert("Please enter date in 'yyyy-mm-dd' format");
		        }
		   	}); 
		  });
	 
	 $("#expiry_Date").change(function () {
		    var doj = this.value;
		    $.ajax({        	
		        type: "GET",
		        url: "checkDateFormat.html?doj="+ doj,
		        success : function(data){
		        	if(data != "correct")
		        		alert("Please enter date in 'yyyy-mm-dd' format");
		        }
		   	}); 
		  });
	 
	  $("#saveBtn").click(function(e){alert("131");
		  e.preventDefault();
		  $("#projectForm").submit();
		}); 
  });
</script>
<body>
<div>	
	<h1>Edit Project</h1>
	<div style="float: right;" ><a href="getProjects.html">Go back</a></div>
	<br>
	<form:form commandName="project" id="projectForm" name="projectForm" modelAttribute="project" action="updateProject" method="post">
	<form:hidden path="processCode"/>
<%-- 	<form:hidden path="ctsId"/> --%>
	<%-- <form:hidden path="updated_Date"/> --%>
	<table style="width: 50%;">
	<!-- <table id="projectsTable" style="width:100%; display: block;" class="display"> -->
		<tbody>
			<tr>
				<td>Project Id</td> 
				<td ><form:input path="projectId" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>Project Name</td> 
				<td ><form:input path="project_Name" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>Process</td> 
				<td ><form:input path="processName" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>Sector</td> 
				<td ><form:input path="sector_Name" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>Sub Sector</td> 
				<td ><form:input path="sub_Sector_Name" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>UBS Service Line</td> 
				<td ><form:input path="ubs_Service_Line_Name" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>UBS Segment</td> 
				<td ><form:input path="ubs_Segment_Name" style="width: 300px;" readonly="true"/></td>
			</tr>
			<tr>
				<td>Project Manager Name</td> 
				<td><form:select path="project_Manager_Code" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<c:forEach items="${project.projectManagers}" var="project">
						<form:option value="${project.projectManagerCode}">${project.project_Manager_Name}</form:option>
					</c:forEach>
				</form:select>
	             </td>	
			</tr>
			<%-- <tr>
				<td>Project Manager Name</td> 
				<td ><form:input path="project_Manager_Name" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				<td>Process Owner Name</td> 
				<td><form:select path="process_Owner_Code" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<c:forEach items="${project.processOwners}" var="project">
						<form:option value="${project.processOwnerCode}">${project.process_Owner_Name}</form:option>
					</c:forEach>
				</form:select>
	             </td>	
			</tr>
			<%-- <tr>
				<td>Process Owner Name</td> 
				<td ><form:input path="process_Owner_Name" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				<td>Delivery Lead Name</td> 
				<td><form:select path="delivery_Lead_Code" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<c:forEach items="${project.deliveryLeads}" var="project">
						<form:option value="${project.deliveryLeadCode}">${project.delivery_Lead_Name}</form:option>
					</c:forEach>
				</form:select>
	             </td>	
			</tr>
			<%-- <tr>
				<td>Delivery Lead Name</td> 
				<td ><form:input path="delivery_Lead_Name" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				<td>Account Name</td> 
				<td><form:select path="account_Id" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<c:forEach items="${project.accountIds}" var="project">
						<form:option value="${project.accountId}">${project.accountId}-${project.accountName}</form:option>
					</c:forEach>
				</form:select>
	             </td>	
			</tr>
			<%-- <tr>
				<td>Account Name</td> 
				<td ><form:input path="account_Name" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				<td>Account Manager Name</td> 
				<td><form:select path="account_Manager_Code" style="width: 300px;">
					<form:option value="">Select</form:option> 
						<c:forEach items="${project.accountManagers}" var="project">
						<form:option value="${project.accountManagerCode}">${project.account_Manager_Name}</form:option>
					</c:forEach>
				</form:select>
	             </td>	
			</tr>
			<%-- <tr>
				<td>Account Manager Name</td> 
				<td ><form:input path="account_Manager_Name" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				<td>Project Billable Status</td> 
				<td><form:select path="project_Billable_Status" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${project.projectBillableStatus}"/>
				</form:select>
	             </td>	
			</tr>
			<tr>
				<td>Active Status</td> 
				<td><form:select path="active_Status" style="width: 300px;">
					<form:option value="">Select</form:option> 
					<form:options items="${project.activeStatus}"/>
				</form:select>
	             </td>
			</tr>
			<tr>
				<td>Effective Date</td> 
				<td ><form:input path="effective_Date" style="width: 300px;" /></td>
			</tr>
			<tr>
				<td>Expiry date</td> 
				<td ><form:input path="expiry_Date" style="width: 300px;" /></td>
			</tr>
			<tr>
				<td>Updated By</td> 
				<td ><form:input path="updated_By" style="width: 300px;" readonly="true"/></td>
			</tr>
			<%-- <tr>
				<td>Updated Date</td> 
				<td ><form:input path="updated_Date" style="width: 300px;" readonly="true"/></td>
			</tr> --%>
			<tr>
				
				<td style="float: right;">
				<input type="reset" id="clear"  value="Clear"/>
				<%-- <form:button id="clear" value="Clear">Clear</form:button> --%>
				</td>
				<td><form:button id="saveBtn" value="Save">Save</form:button></td>
			</tr>
		</tbody>
	</table>
	</form:form>
</div>
</body>
</html>