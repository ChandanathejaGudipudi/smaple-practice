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
	  	$("#taskOrderTable").dataTable({  		
   		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		 "pageLength": 50,
		"oLanguage": { "sSearch": "Filter results: "}
	});	

	  	$( "#taskOrderTable tbody tr" ).click( function() {
	      var s2c_Number = $(this).data( "profileKey" );
			 document.location.href = "getTaskOrder.html?s2c_Number=" + s2c_Number;
	    });
	$("#addTOBtn").click(function(){
		/* document.location.href = "addAssociate.html?ctsId="+$("#ctsId").val(); */
		document.location.href = "addTaskOrder.html";
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
	<h1>Task Order</h1><br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<br>
	<div style="float: right;" id="addTOBtn"><input type="button" value="Add Task Order"/></div>
	<br>
	<table id="taskOrderTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>S2C Number</th>
				<th>Parent TO Number</th>
				<th>Type of Task Order</th>
				<th>ODP Number</th>
				<th>CTS Legal Entity</th>
				<th>UBS Legal entity</th>
				<th>CTS Business manager</th>
				<th>UBS Business manager</th>
				<th>Start date</th>
				<th>End date</th>
				<th>Currency</th>
				<th>Expense Amount</th>
				<th>Total Contract Value</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="taskOrder" items="${taskOrder}" varStatus="idx">
				<tr data-profile-key="${taskOrder.s2cNumber}" style="cursor: pointer;color: blue;">
					<td>${taskOrder.s2cNumber}</td>
					<td>${taskOrder.parent_TO}</td>
					<td style="text-transform: capitalize;">${taskOrder.task_Type}</td>
					<td style="text-transform: capitalize;">${taskOrder.ODP_Number}</td>
					<td style="text-transform: capitalize;">${taskOrder.CTS_Legal_Entity}</td>
					<td style="text-transform: capitalize;">${taskOrder.UBS_Legal_Entity}</td>
					<td style="text-transform: capitalize;">${taskOrder.CTS_Business_Manager}</td>
					<td style="text-transform: capitalize;">${taskOrder.UBS_Business_Manager}</td>
					<td style="text-transform: capitalize;">${taskOrder.eff_Date}</td>
					<td style="text-transform: capitalize;">${taskOrder.exp_Date}</td>
					<td style="text-transform: capitalize;">${taskOrder.currency}</td>
					<td style="text-transform: capitalize;">${taskOrder.expense_Amount}</td>
					<td style="text-transform: capitalize;">${taskOrder.contract_Value}</td>
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</div>
</body>
</html>