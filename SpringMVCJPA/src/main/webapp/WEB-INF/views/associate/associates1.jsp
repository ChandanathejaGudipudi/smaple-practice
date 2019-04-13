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

<!-- <script type="text/javascript"  src="/js/jquery-ui.js"></script> -->
<!-- <script type="text/javascript" src="/js/jquery.dataTables.min.js"></script> -->
<script type="text/javascript" src="/js/fnGetColumnData.js"></script>
<title>Associates</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#associatesTable").dataTable({  		
   		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		"oLanguage": { "sSearch": "Filter results: "}
	});	

	  	$( "#associatesTable tbody tr" ).click( function() {
	      var profileKey = $(this).data( "profileKey" );
			 document.location.href = "getAssociate.html?ctsId=" + profileKey;
	    });
	$("div#editAssociateDialog").on('dialogclose', function(event) {
    	$('#iconLoading').hide();
 	});		   
	
	$("#addAssociateBtn").click(function(){
		document.location.href = "addAssociate.html";
	});
  });
</script>
</head>
<body>
<div>	
	<h1>Associates</h1>	<br>
	<form action="getAssociates">
	Project Id:
<%-- 	<form:select path="country">
		<form:option value="NONE" label="--- Select ---"/>
    	<form:options items="${pro}" />
	</form:select>
 --%>	<select  name="projectId">
 		<option value="${projectId}">${projectId} - ${project_Name}</option>
	<c:forEach var="project" items="${projDetails}" varStatus="idx">
	   <option value="${project.projectId}">${project.projectId} - ${project.project_Name}</option>
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
				<th>GPN</th>
				<th>Associate Full Name</th>
				<th>Gender</th>
				<th>Marital Status</th>
				<!-- <th>DOJ</th> -->
				<!-- <th>UBS Latest Hire Date</th> -->
				<th>Project Id</th>
				<th>Project Name</th>
				<th>Associate Status</th>
				<!-- <th>Sub Process Code</th> -->
				<th>Sub Process</th>
				<!-- <th>Process Code</th> -->
				<th>Process</th>
				<!-- <th>Region Code</th> -->
				<th>Region</th>
				<th>BCP Critical Status</th>
				<th>Seat Number</th>
				<th>Shift Timings</th>
				<!-- <th>Shared Seat</th> -->
				<th>CTS Grade</th>
				<!-- <th>CTS Grade Effective Date</th> -->
				<th>Associate Billability Status</th>
				<th>Associate Billability Grade</th>
				<!-- <th>Associate Billability Rate</th> -->
				<!-- <th>Associate Billability Effective Date</th> -->
				<th>Block Leave Status</th>
				<!-- <th>Block Leave From</th>
				<th>Block Leave To</th> -->
				<th>HRI Update Status</th>
				<th>Associate User Name</th>
				<th>VDI Number</th>
				<th>Attrition Type</th>
				<th>Reason</th>
				<th>Date of Relieving</th>
				<th>Line Manager Id</th>
				<th>Line Manager Name</th>
				<th>Associate Supervisor CTS Id</th>
				<th>Associate Supervisor GPN</th>
				<th>Associate Supervisor Name</th>
				<th>Associate Project Manager CTS Id</th>
				<th>Associate Project Manager GPN</th>
				<th>Associate Project Manager Name</th>
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
					<td>${associate.GPN}</td>
					<td style="text-transform: capitalize;">${associate.associate_Full_Name}</td>
					<td style="text-transform: capitalize;">${associate.gender}</td>
					<td style="text-transform: capitalize;">${associate.marital_Status}</td>
					<%-- <td style="text-transform: capitalize;">${associate.CTS_DOJ}</td>
					<td style="text-transform: capitalize;">${associate.UBS_Latest_Hire_Date}</td> --%>
					<td>${associate.projectId}</td>
					<td style="text-transform: capitalize;">${associate.project_Name}</td>
					<td>${associate.associate_Status}</td>
					<%-- <td>${associate.sub_Process_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.sub_Process}</td>
					<%-- <td>${associate.process_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.process}</td>
					<%-- <td>${associate.region_Code}</td> --%>
					<td style="text-transform: capitalize;">${associate.region}</td>
					<td style="text-transform: capitalize;">${associate.BCP_Critical_Status}</td>
					<td>${associate.seat_Number}</td>
					<td style="text-transform: capitalize;">${associate.shift_Timings}</td>
					<%-- <td style="text-transform: capitalize;">${associate.is_It_Shared_Seat}</td> --%>
					<td style="text-transform: capitalize;">${associate.CTS_Grade}</td>
					<%-- <td style="text-transform: capitalize;">${associate.CTS_Grade_Effective_Date}</td> --%>
					<td style="text-transform: capitalize;">${associate.associate_Billability_Status}</td>
					<td>${associate.associate_Billability_Grade}</td>
					<%-- <td>${associate.associate_Billability_Rate}</td> --%>
					<%-- <td>${associate.associate_Billability_Effective_Date}</td> --%>
					<td style="text-transform: capitalize;">${associate.block_Leave_Status}</td>
					<%-- <td>${associate.block_Leave_From}</td>
					<td>${associate.block_Leave_To}</td> --%>
					<td style="text-transform: capitalize;">${associate.hRi_Update_Status}</td>
					<td style="text-transform: capitalize;">${associate.associate_User_Name}</td>
					<td>${associate.VDI_Number}</td>
					<td style="text-transform: capitalize;">${associate.attrition_Type}</td>
					<td style="text-transform: capitalize;">${associate.reason}</td>
					<td>${associate.date_of_Relieving}</td>
					<td>${associate.line_Manager_Id}</td>
					<td style="text-transform: capitalize;">${associate.line_Manager_Name}</td>
					<td>${associate.associate_Supervisor_CTS_Id}</td>
					<td>${associate.associate_Supervisor_GPN}</td>
					<td style="text-transform: capitalize;">${associate.associate_Supervisor_Name}</td>
					<td>${associate.associate_Project_Manager_CTS_Id}</td>
					<td>${associate.associate_Project_Manager_GPN}</td>
					<td style="text-transform: capitalize;">${associate.associate_Project_Manager_Name}</td>
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