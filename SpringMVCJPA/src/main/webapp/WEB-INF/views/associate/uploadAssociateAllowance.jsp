<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.cts.employee.domain.AllowanceViewModel" %>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
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
<title>Night Allowance</title>
<script type="text/javascript">
	
	function submit(){
	alert('aa');
	}

  $(document).ready( function() {

	 
	  $("#saveBtn").click(function(e){
		  e.preventDefault();
		  $("#allowanceForm").submit();
		}); 
  });
  
</script>
<body>
<div>	

	<h1>
	<c:if test = "${allowance eq 'shift'}">
         Upload Night Allowance
      </c:if>
      <c:if test = "${allowance eq 'optout'}">
         Upload Transport Allowance
      </c:if>	
	</h1> <!-- dynamic label -->
	<div style="float: right;" ><a href="home.html?uname=${userid}">Home</a></div>
	<br>
	
	<%
		//String operationVal = request.getParameter("operation");
		//String allowanceVal = request.getParameter("allowance");
		
		String operationVal = "";
		String allowanceVal = "";
		String duplicateRecordsError = "";
		String mismatchRecordsError = "";
		String invalidRecordsError = "";
		String uploadError = "";
		String message = "";
		
		/**String duplicateRecordsError = request.getAttribute("allowanceRecordsDuplicate") != null ? 
		(String)request.getAttribute("allowanceRecordsDuplicate") : "";
		String mismatchRecordsError = request.getAttribute("not_matched") != null ? 
		(String)request.getAttribute("not_matched") : "";
		String invalidRecordsError = request.getAttribute("invalid_records") != null ? 
		(String)request.getAttribute("invalid_records") : "";
		*/
		
		/* AllowanceViewModel viewModel = session.getAttribute("processAllowanceView") != null 
				? (AllowanceViewModel)session.getAttribute("processAllowanceView") : null; */
				
				AllowanceViewModel viewModel = session.getAttribute("processAllowanceView") != null 
				? (AllowanceViewModel)session.getAttribute("processAllowanceView") : null;
				
				if(viewModel != null){
					operationVal = viewModel.getOperation();
					allowanceVal = viewModel.getAllowance();
					duplicateRecordsError = viewModel.getDuplicateMessage();
					mismatchRecordsError = viewModel.getMismatchMessage();
					invalidRecordsError = viewModel.getInvalidMessage();
					message = viewModel.getMessage();
					uploadError = viewModel.getUploadFailed();
				}
		
	 %>
	<form method="POST" name="allowanceForm" action="${pageContext.request.contextPath}/spring/processShiftAllowance" enctype="multipart/form-data">
	
	<table style="width: 50%;">
	<!-- <table id="projectsTable" style="width:100%; display: block;" class="display"> -->
		<tbody>
		
		<%--<%=allowanceVal --%>
			<tr>
				<td><h4>Allowance Type</h4></td> 
				<td><select name="allowance"  style="width: 300px;">
				<option value="" <%= "".equals(allowanceVal)?"selected":"" %>>Select</option>
				<option value="shift" <%= "shift".equals(allowanceVal)?"selected":"" %> >Shift</option>
				<option value="optout" <%= "optout".equals(allowanceVal)?"selected":"" %> >Opt-out</option>
				</select></td>
				<td>${allowanceError}</td>
				
			</tr>
			
			<tr>
				<td><h4>Operation </h4></td> 
				<td><select name="operation"  style="width: 300px;">
				<option value="" <%= "".equals(operationVal)?"selected":"" %>>Select</option>
				<option value="add" <%= "add".equals(operationVal)?"selected":"" %>>Bulk Upload</option>
				<option value="update" <%= "update".equals(operationVal)?"selected":"" %>>Update Status</option>
				</select></td>
				<td>${operationError}</td>
			</tr>
	
	
			
			<tr>
				<td><h4>Allowance</h4></td> 
				<td ><input type="file" name="file" style="width: 300px;" /></td>
				<td>${fileError}</td>
			</tr>
	
			<tr>
				
				<td style="float: right;">
				<input type="reset" id="clear"  value="Clear"/>
				<%-- <form:button id="clear" value="Clear">Clear</form:button> --%>
				</td>
				<td>    <input type="button" name="saveBtn" value="Submit" onclick="submit()"/></td>
			</tr>
		</tbody>
	</table>
	<!-- <input type="hidden" name="allowance" value="${allowance}">
	<input type="hidden" name="operation" value="${operation}"> -->
	</form>
	 <h5>Message : <%=message != null ? message : ""%></h5> 
	 <h5>Errors : <%=uploadError != null ? uploadError : "" %></h5> 
	 
	 <hr/>
	 <%if(duplicateRecordsError != null && !duplicateRecordsError.equals("")){
	 	out.println("Duplicate Records :: "); 
	 	out.print(duplicateRecordsError);
	 } %>
	 <hr/>
	  <%if(mismatchRecordsError != null && !mismatchRecordsError.equals("")){
	 	out.println("Mismatch Records :: "); 
	 	out.print(mismatchRecordsError);
	 } %>
	 </hr/>
	  <%if(invalidRecordsError != null && !invalidRecordsError.equals("")){
	 	out.println("Invalid Records :: "); 
	 	out.print(invalidRecordsError);
	 } %>
	<!-- <h2>allowance : ${allowance}</h2>  -->
	
	<%-- <c:forEach items="${records}" var="item">
    ${item.associateId} ${item.associateName}<br>
</c:forEach> --%>

	
	</div>
</body>
</html>