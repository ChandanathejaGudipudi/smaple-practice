<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
<html>
	<script>  
	/* $(document).ready(function() {
		$("#Cts_id").click(function(){
			alert("Cts_id----" +$("#ctsId").val());
			
			$.ajax({
	            type: "GET",
	            url: "getAssociate.html?ctsId=" +$("#ctsId").val(),
	            success: function(data){
					alert("in success---" + data);            
	            }
	        });
		});
	}); */
	</script>  
	<body>  
	<!-- <form:form id="roadsideForm"> -->
	
		<form name="myform" method="post" action="getAssociate">
		<table>
		<tbody>
			<tr>
				<td>Associate CTS ID</td> <td><input type="text" name="ctsId" value="${associate.associateCTSId}" id="ctsId"/></td>
				<td><input type="submit" id="Cts_id" value="Enter"/></td>
			</tr>
		</tbody>
	</table>
		
		</form>
		<fieldset>
    <legend>Project Details:</legend>  
	<table>
		<tbody>
			<!-- <tr>
				<td>Ass Id</td>
				<td><input type="text" id="ctsId"/></td>
				<td><input type="submit" value="Enter"></td>
				<td><a href="getAssociate.html?ctsId=202300" style="text-align: center;position: relative;text-shadow: blue;">Get Associate Details</a></td>
			</tr> -->
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">Associate Name</td> <td style="text-align: center;">${associate.associate_Full_Name}</td>
			</tr>
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">GPN</td><td style="text-align: center;">${associate.GPN}</td>
						</tr>
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">Project ID</td> <td style="text-align: center;">${associate.projectId}</td>
						</tr>
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">Project Name</td> <td style="text-align: center;">${associate.project_Name}</td>
						</tr>
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">Project Manager CTS ID</td><td style="text-align: center;">${associate.associate_Project_Manager_CTS_Id}</td>
						</tr>
			<tr style="background-color:lightgreen;">
						<td style="width: 50%;">Project Manager Name</td> <td style="text-align: center;">${associate.associate_Project_Manager_Name}</td>
			</tr>
			<%-- <tr>
				<td style="text-align: center;">Present Seat Number</td>
				<td style="text-align: center;">${seatChangeDetails.present_Seat_Number}</td>
			</tr>
			<tr>
				<td style="text-align: center;">Present Shift Timings</td>
				<td style="text-align: center;">${seatChangeDetails.present_Shift_Timings}</td>
			 </tr>
			<tr>
				<td style="text-align: center;">Is it shared Seat</td>
				<td style="text-align: center;">${associate.is_It_Shared_Seat}</td>
			</tr> --%>
		</tbody>
	</table>
	</fieldset>
	<!-- </form:form> -->
			<!-- Name: <input type="text" name="name"><br/>  
			Password: <input type="password" name="password"><br/>  
			<input type="submit" value="register">   -->
		<!-- </form> -->  
		<br><br><br><br>
	<%-- 	
		<form:form id="associateForm" commandName="associate" action="addAssociate.html">
	
	<table>
		<tbody>
			<tr>
				<td>Associate CTS ID</td> <td id="ctsId"><form:input path="associateCTSId"/></td>
				<td><form:button id="Cts_id">Enter</form:button></td>
			</tr>
		</tbody>
	</table>
	<fieldset>
    <legend>Project Details:</legend>
	<table style="width: 50%;">
		<tbody>
			<tr>
				<td style="width: 50%;">Associate Name</td> <td><form:label path="associate_Full_Name"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">GPN</td> <td><form:input path="GPN"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">Project ID</td> <td><form:label path="project_Id"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">Project Name</td> <td><form:label path="project_Name"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">Project Manager CTS ID</td> <td><form:label path="associate_Project_Manager_CTS_Id"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">Project Manager Name</td> <td><form:label path="associate_Project_Manager_Name"/></td>
			</tr>
		</tbody>
	</table>
	</fieldset>
	</form:form>
	 --%><br>
	<fieldset>
    <legend>Existing Seat Details:</legend>
    <table>
		<tbody>
			<tr>
				<td style="text-align: center;">Present Seat Number</td>
				<td>${associate.seat_Number}</td>
			</tr>
			<tr>
				<td style="width: 50%;">Present Shift Timings</td>
				<td>${associate.shift_Timings}</td>
			</tr>
			<tr>
				<td style="width: 50%;">Is it Shared seat</td>
				<td>${associate.is_It_Shared_Seat}</td>
			</tr>
		</tbody>
	</table>
    <%-- <form:form id="seatForm" commandName="seatChangeDetails">
	<table style="width: 50%;">
		<tbody>
			<tr>
				<td style="text-align: center;">Present Seat Number</td><td><form:label path="present_Seat_Number"/></td>
			</tr>
			<tr>
				<td style="width: 50%;">Present Shift Timings</td> <td><form:label path="present_Shift_Timings"/></td>
			</tr>	
			<tr>
			<td style="text-align: center;">Present Seat Number</td>
			<td>
				<form:select path="is_It_Shared_Seat">
					<form:option value="">Select</form:option>
					<form:option value="Yes">Yes</form:option>
					<form:option value="No">No</form:option>
				</form:select>
				</td>
			</tr>
		</tbody>
	</table>
	</form:form>
 --%>	</fieldset>
	
	</body>
</html>
