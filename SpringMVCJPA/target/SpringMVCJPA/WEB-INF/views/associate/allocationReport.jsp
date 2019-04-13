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

<title>Allocation Report</title>
<script>
  $(document).ready( function() {
	  
	  $.ajaxSetup({ cache: false });
	  	$("#allocationTable").dataTable({  
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
	<h1>Allocation Report</h1>
	<br>
	<div style="float: right;" ><a href="home.html?uname=${user.ctsId}">Home</a></div><br>
	<div style="float: right;" ><a href="login.html">Logout</a></div>
	<br>
	<table id="allocationTable" style="width:100%; display: block;" class="display">
		<thead>
			<tr>
				<th>Associate CTS Id</th>
				<th>Project Id</th>
				<th>Project Name</th>
				<th>Process</th>
				<th>Allocation %</th>
				<th>Allocation Effective Data</th>
				<th>Allocation Status</th>
				<th>Updated By</th>
				<!-- <th>Updated Date</th> -->
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="allocate" items="${allocateprojects}" varStatus="idx">
				<tr>
					<td>${allocate.associateCTSId}</td>
					<td>${allocate.projectId}</td>
					<td style="text-transform: capitalize;">${allocate.project_Name}</td>
					<td style="text-transform: capitalize;">${allocate.process}</td>
					<td style="text-transform: capitalize;">${allocate.allocation_Percentage}</td>
					<td style="text-transform: capitalize;">${allocate.allocation_Effective_Date}</td>
					<td style="text-transform: capitalize;">${allocate.allocation_Status}</td>
					<%-- <td>${seat.associate.process}</td> --%>
					<td style="text-transform: capitalize;">${allocate.updated_By}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>