<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>      
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<title>Associates</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#associatesTable").dataTable({  		
   		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		 "pageLength": 50,
		"oLanguage": { "sSearch": "Filter results: "}
	});	

	  	$( "#associatesTable tbody tr" ).click( function() {
	      var ctsId = $(this).data( "profileKey" );
			 document.location.href = "getAssociate.html?ctsId=" + ctsId + "&projectId=" + $("#projectId").val();
	    });
	$("div#editAssociateDialog").on('dialogclose', function(event) {
    	$('#iconLoading').hide();
 	});		   
	
	$("#addAssociateBtn").click(function(){
		/* document.location.href = "addAssociate.html?ctsId="+$("#ctsId").val(); */
		document.location.href = "addAssociate.html";
	});
  });
</script>
</head>
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
</style>
<body>
<div>	
	<h1>Associates</h1><br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<form action="getAssociates">
	Project Id:

	<%-- <input type="hidden" value="${ctsId}" id="ctsId" name="ctsId">  --%>
 	<select  name="projectId" id="projectId">
 		
 			<option value="">Select</option>
 		
	<c:forEach var="project" items="${projDetails}" varStatus="idx">
		<c:if test="${project.projectId eq projectId}">
	   		<option value="${project.projectId}" selected>${project.projectId} - ${project.project_Name}</option>
	   </c:if>
	   <c:if test="${project.projectId != projectId}">
	   		<option value="${project.projectId}">${project.projectId} - ${project.project_Name}</option>
	   </c:if>
	</c:forEach>
	</select>
	<input type="submit" value="Get Associates">
	</form>
	<div style="float: right;" id="addAssociateBtn"><input type="button" value="Add Associate"/></div>
	<br>
	<table id="associatesTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>Associate CTS ID</th>
				<th>GPIN</th>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
				<th>Full Name</th>
				<th>Gender</th>
				<th>Marital Status</th>
				<th>Previous Employer</th>
				<th>Previous Experience</th>
				<th>CTS DOJ</th>
				<th>UBS Latest Hire Date</th>
				<th>Associate Status</th>
				<th>Project Id</th>
				<th>Project Name</th>
				<!-- <th>Process Code</th> -->
				<th>Process</th>
				<!-- <th>Sub Process Code</th> -->
				<th>Sub Process</th>
				<!-- <th>Team Code</th> -->
				<th>Team</th>
				<!-- <th>Region Code</th> -->
				<th>Region</th>
				<th>CTS Grade</th>
				<th>CTS Grade Effective Date</th>
				<th>Billability Status</th>
				<th>Billability Grade</th>
				<th>Billability Effective Date</th>
				<th>Supervisor CTS Id</th>
				<th>Supervisor GPN</th>
				<th>Supervisor Name</th>
				<th>Project Manager CTS Id</th>
				<th>Project Manager GPN</th>
				<th>Project Manager Name</th>
				<th>BCP Critical Status</th>
				<th>Seat Number</th>
				<th>Shift Timings</th>
				<th>Associate User Name</th>
				<th>VDI Number</th>
				<th>CTS Email ID</th>
				<th>UBS Email ID</th>
				<th>Contact Number</th>
				<th>Address</th>
				<th>associate_Movement_Type</th>
				<th>Attrition Type</th>
				<th>Reason</th>
				<th>movement_Effective_Date</th>
				<th>Updated By</th>
				<!-- <th>Updated Date</th> -->
			</tr>
		</thead>
		<tbody>
			<c:forEach var="associate" items="${associates}" varStatus="idx">
			<c:if test="${associate.associate_Status eq 'Active'}">
				<tr data-profile-key="${associate.associateCTSId}" style="cursor: pointer;color: blue;">
			</c:if>
			<c:if test="${associate.associate_Status != 'Active'}">
				<tr>
			</c:if>
					<td>${associate.associateCTSId}</td>
					<td>${associate.GPIN}</td>
					<td style="text-transform: capitalize;">${associate.first_Name}</td>
					<td style="text-transform: capitalize;">${associate.middle_Name}</td>
					<td style="text-transform: capitalize;">${associate.last_Name}</td>
					<td style="text-transform: capitalize;">${associate.full_Name}</td>
					<td style="text-transform: capitalize;">${associate.gender}</td>
					<td style="text-transform: capitalize;">${associate.marital_Status}</td>
					<td style="text-transform: capitalize;">${associate.previous_Employer}</td>
					<td style="text-transform: capitalize;">${associate.previous_Experience}</td>
					<td style="text-transform: capitalize;">${associate.cts_DOJ}</td>
					<td style="text-transform: capitalize;">${associate.UBS_Latest_Hire_Date}</td>
					<td>${associate.associate_Status}</td>
					<td>${associate.projectId}</td>
					<td style="text-transform: capitalize;">${associate.project_Name}</td>
					<%-- <td>${associate.process_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.process}</td>
					<%-- <td>${associate.sub_Process_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.sub_Process}</td>
					<%-- <td>${associate.team_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.team}</td>
					<%-- <td>${associate.region_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.region}</td>
					<td style="text-transform: capitalize;">${associate.CTS_Grade}</td>
					<td style="text-transform: capitalize;">${associate.CTS_Grade_Effective_Date}</td>
					<td style="text-transform: capitalize;">${associate.billability_Status}</td>
					<td>${associate.billability_Grade}</td>
					<td>${associate.billability_Effective_Date}</td>
					<td>${associate.supervisor_CTS_Id}</td>
					<td>${associate.supervisor_GPIN}</td>
					<td style="text-transform: capitalize;">${associate.supervisor_Name}</td>
					<td>${associate.project_Manager_CTS_Id}</td>
					<td>${associate.project_Manager_GPIN}</td>
					<td style="text-transform: capitalize;">${associate.project_Manager_Name}</td>
					<td style="text-transform: capitalize;">${associate.BCP_Critical_Status}</td>
					<td>${associate.seatNumber}</td>
					<td style="text-transform: capitalize;">${associate.shift_Timing}</td>
					<td style="text-transform: capitalize;">${associate.associate_User_Name}</td>
					<td>${associate.VDI_Number}</td>
					<td style="text-transform: capitalize;">${associate.associate_CTS_Email}</td>
					<td style="text-transform: capitalize;">${associate.associate_UBS_Email}</td>
					<td style="text-transform: capitalize;">${associate.associate_Contact_Number}</td>
					<td style="text-transform: capitalize;">${associate.associate_Address}</td>
					<td style="text-transform: capitalize;">${associate.associate_Movement_Type}</td>
					<td style="text-transform: capitalize;">${associate.attrition_Type}</td>
					<td style="text-transform: capitalize;">${associate.reason}</td>
					<td>${associate.movement_Effective_Date}</td>
					<td style="text-transform: capitalize;">${associate.updated_By}</td>
					<%-- <td style="text-transform: capitalize;">${associate.updated_Date}</td> --%>
					<%-- <td><fmt:formatDate value="${story.submitDate}" pattern="MM/dd/yyyy" /></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</div>
</body>
</html>