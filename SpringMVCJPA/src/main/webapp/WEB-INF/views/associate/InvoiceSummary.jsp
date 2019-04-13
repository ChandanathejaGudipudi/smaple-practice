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
<title>Task Order</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#invoiceTrackerTable").dataTable({  		
   		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		 "pageLength": 50,
		"oLanguage": { "sSearch": "Filter results: "}
	});	

	  	$( "#invoiceTrackerTable tbody tr" ).click( function() {
	      var Invoice_Id = $(this).data( "profileKey" );
			 document.location.href = "getInvoice.html?Invoice_Id=" + Invoice_Id;
	    });
	$("#addITBtn").click(function(){
		/* document.location.href = "addAssociate.html?ctsId="+$("#ctsId").val(); */
		document.location.href = "addInvoiceTracker.html";
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
	<h1>Invoice Summary</h1><br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<br>
	<div style="float: right;" id="addITBtn"><input type="button" value="Add Invoice Tracker"/></div>
	<br>
	<table id="invoiceTrackerTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>Invoice Id</th>
				<th>Year</th>
				<th>Month</th>
				<th>Transaction Type</th>
				<th>Project</th>
				<th>Process</th>
				<th>Region</th>
				<th>Customer ID</th>
				<th>PM Name</th>
				<th>Invoiced Amount</th>
				<th>Amt Due(Post tax)</th>
				<th>USD Equ Amt</th>
				<th>Status</th>
				<th>Updated By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="invoiceTracker" items="${invoiceTracker}" varStatus="idx">
				<tr data-profile-key="${invoiceTracker.invoiceId}" style="cursor: pointer;color: blue;">
					<td>${invoiceTracker.invoiceId}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.inv_Year}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.inv_Month}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.trn_Type}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.project_Desc}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.process}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.region}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.cust_Id}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.PM_Name}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.inv_Amt_Pre_Tax}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.amt_Due_Post_Tax}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.USD_Equ_Post_Tax}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.inv_Status}</td>
					<td style="text-transform: capitalize;">${invoiceTracker.updated_By}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</div>
</body>
</html>