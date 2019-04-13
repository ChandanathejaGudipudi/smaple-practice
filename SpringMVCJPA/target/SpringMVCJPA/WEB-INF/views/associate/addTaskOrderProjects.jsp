<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<%-- <script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script> --%>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">
<style>
  div.errorMsg { color:red; font-weight: bold; font-size: 14px; }
body {
   background-color: powderblue;
  }
table {
   width: auto;
   margin-left: auto;
   margin-right: auto;
}
</style>
<head>
<title>Add Projects</title>
<script type="text/javascript">
var projectIds = $("#projectId").val();
$(document).ready( function() {
	//alert($("#projectId").val());
	$.ajaxSetup({ cache: false });
	$('#hidProjectId').val($("#projectId").val());
	var dTable = $("#allocprojectsTable").dataTable({  		
	"aaSorting": [[ 2, "desc" ]], 		
	"iDisplayLength": 10,	
	"oLanguage": { "sSearch": "Filter results: "}
});	

$("#saveAllocProjBtn").click(function(e){
	
	$("#errorMsg").html("");
	$("saveAllocProjBtn").prop("disabled", true);
	var selectedProj = "";
	$("input:checked", dTable.fnGetNodes()).each(function(){
		if(selectedProj =="")
			selectedProj = $(this).val();
		else
			selectedProj = selectedProj +":"+ $(this).val();
		});
	 if(selectedProj == ""){
		 alert("Please select one Project");
		 return false;
	 }
	 else{
	var pageData = "s2cNumber="+$("#s2cNumber").val() +"&projects=" + selectedProj;
	//window.opener.setValue(pageData);
	$.ajax({        	
        type: "POST",
        url: "saveAllocatedProjectsTo.html",
        data: pageData,
        success : function(msg){
        	alert(msg);
        	$("#addProjectsInTO,.ui-dialog").html('');
        	$("#addProjectsInTO,.ui-dialog").hide();
        	$("#addProjectsInTO,.ui-dialog").css('display','none')
        	//$('.ui-widget-overlay').css('position','relative');
        	$('.ui-widget-overlay').css('display','none');
       }
   	}); 
}
});
});
</script>
</head>
<br>
<div>
	<input type="hidden" id="s2cNumber" value="${s2cNumber}"/>
	<input type="hidden" id="hidProjectId"/>
	<c:set var="hidProjectIds" value="${param.hidProjectId}"/>
	<table id="allocprojectsTable" style="width:100%; display: block;" class="display">
	<thead>
		<tr> 
			<th>Select</th>
			<th>Project Id</th>
			<th>Project Name</th>
			<th>Process Id</th>
			<th>Process Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${allocations}" var="project" varStatus="count">
			  <tr>
			  <c:choose>
			  	<c:when test="${project.checked eq true}">
					<td><input type="checkbox" data-counter="${count.index}" checked="checked" value="${project.projectId}"/></td>
			  	</c:when>
			  	<c:otherwise>
			  		<td><input type="checkbox" data-counter="${count.index}" value="${project.projectId}"/></td>
			  	</c:otherwise>
			  </c:choose>
              	<td>${project.projectId}</td>
              	<td>${project.projectName}</td>
              	<td>${project.processId}</td>
              	<td>${project.processName}</td>
              </tr>               
			</c:forEach> 
	</tbody>
	</table>
	<br/>
		<input type="button" id="saveAllocProjBtn" value="Save" style="float: right;">
		<div id="errorMsg">${errorMsg}</div>
</div>
