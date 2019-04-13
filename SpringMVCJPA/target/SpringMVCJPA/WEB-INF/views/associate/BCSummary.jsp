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
<title>Business Case</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#businessCaseTable").dataTable({  		
   		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		 "pageLength": 50,
		"oLanguage": { "sSearch": "Filter results: "}
	});	

	  	$( "#businessCaseTable tbody tr" ).click( function() {
	      var bCId = $(this).data( "profileKey" );
			 document.location.href = "getBusinessCase.html?bCId=" + bCId;
	    });
	$("#addBCBtn").click(function(){
		/* document.location.href = "addAssociate.html?ctsId="+$("#ctsId").val(); */
		document.location.href = "addBusinessCase.html";
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
	<h1>Business Case</h1><br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<br>
	<div style="float: right;" id="addBCBtn"><input type="button" value="Add Business Case"/></div>
	<br>
	<table id="businessCaseTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>BC Id</th>
				<th>Year</th>
				<th>Month</th>
				<th>ProjectId</th>
				<th>Project Name</th>
				<th>Process</th>
				<th>S2C Number</th>
				<th>Currency</th>
				<th>UOM</th>
				<th>UOM value</th>
				<th>Total FTE#</th>
				<th>Total value</th>
				<th>USD Equ value</th>
				<th>Updated By</th>
				
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="businessCase" items="${businessCase}" varStatus="idx">
				<tr data-profile-key="${businessCase.bCId}" style="cursor: pointer;color: blue;">
					<td>${businessCase.bCId}</td>
					<td style="text-transform: capitalize;">${businessCase.BC_Year}</td>
					<td style="text-transform: capitalize;">${businessCase.BC_Month}</td>
					<td style="text-transform: capitalize;">${businessCase.projectId}</td>
					<td style="text-transform: capitalize;">${businessCase.project_Name}</td>
					<td style="text-transform: capitalize;">${businessCase.process}</td>
					<td style="text-transform: capitalize;">${businessCase.s2C_Number}</td>
					<td style="text-transform: capitalize;">${businessCase.currency}</td>
					<td style="text-transform: capitalize;">${businessCase.UOM}</td>
					<td style="text-transform: capitalize;">${businessCase.UOM_Value}</td>
					<td style="text-transform: capitalize;">${businessCase.grand_Total_FTE}</td>
					<td style="text-transform: capitalize;">${businessCase.grand_Total_FTE_Val}</td>
					<td style="text-transform: capitalize;">${businessCase.USD_Eq_Val}</td>
					<td style="text-transform: capitalize;">${businessCase.updated_By}</td>
										
				</tr>
			</c:forEach>
		</tbody>
	</table>


</div>
</body>
</html>