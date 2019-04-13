<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>   
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>

<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.4/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="//cdn.datatables.net/buttons/1.2.4/js/buttons.flash.min.js"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script type="text/javascript" src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/pdfmake.min.js"></script>
<script type="text/javascript" src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/vfs_fonts.js"></script>
<script type="text/javascript" src="//cdn.datatables.net/buttons/1.2.4/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="//cdn.datatables.net/buttons/1.2.4/js/buttons.print.min.js"></script>


<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.2.4/css/buttons.dataTables.min.css">

<title>Internal Movements</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#internalMovementsTable").dataTable({  
	  		"dom": 'Bfrtip',
	        "buttons": [
	            'excel'
	        ],
 		"aaSorting": [[ 1, "desc" ]], 		
		"iDisplayLength": 10,	
		"oLanguage": { "sSearch": "Filter results: "}
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

  div.error { color:red; font-weight: bold; font-size: 14px; }
</style>
<body>
<div>	
	<h1>Internal Movements</h1>
	<br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<br>
	<table id="internalMovementsTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>Associate CTS Id</th>
				<th>Old Project Id</th>
				<th>Old Project Name</th>
				<th>Old Process</th>
				<th>New Project Id</th>
				<th>New Project Name</th>
				<th>New Process</th>
				<th>Movement Type</th>
				<th>Movement Effective Date</th>
				<th>Reason</th>
				<th>Updated By</th>
				<!-- <th>Updated Date</th> -->
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="im" items="${internalmovement}" varStatus="idx">
				<tr>
					<td>${im.associate_CTS_Id}</td>
					<td>${im.old_Project_Id}</td>
					<td style="text-transform: capitalize;">${im.old_Project_Name}</td>
					<td style="text-transform: capitalize;">${im.old_Process}</td>
					<td style="text-transform: capitalize;">${im.new_Project_Id}</td>
					<td style="text-transform: capitalize;">${im.new_Project_Name}</td>
					<td style="text-transform: capitalize;">${im.new_Process}</td>
					<td style="text-transform: capitalize;">${im.associate_Movement_Type}</td>
					<td style="text-transform: capitalize;">${im.movement_Effective_Date}</td>
					<td style="text-transform: capitalize;">${im.reason}</td>
					<%-- <td>${seat.associate.process}</td> --%>
					<td style="text-transform: capitalize;">${im.associate.updated_By}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>