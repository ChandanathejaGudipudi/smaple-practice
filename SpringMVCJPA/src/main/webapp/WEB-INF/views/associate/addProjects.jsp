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
	var projects=[];
	var tempProjects=[];
	var counters=[];
	var totValue = 0;
	$("input:checked", dTable.fnGetNodes()).each(function(){
		console.log($(this).val());
		console.log("cb counter-" + $(this).data("counter"));
		var counter = $(this).data("counter");
		tempProjects.push({
            key: counter, 
            value:  $(this).val()
        });
		counters.push(counter);
		});
	 $("input:text", dTable.fnGetNodes()).each(function(){
		 var textVal = $(this).val();
		var counter = $(this).data("counter");
		$.each(tempProjects, function( key, projectId ) {
			   if(projectId.key == counter){
				console.log("text val---" + textVal);
			    console.log( projectId.key + ": " + projectId.value );
			  projects.push({
		            key: projectId.value, 
		            value:  textVal
		        });
			  }
			});
		});
	 $.each(projects, function( index, value ) {
		  console.log( "projects--" + value.key + ": " + value.value );
		  totValue = parseInt(totValue) + parseInt(value.value);
		});
	/* $('#allocprojectsTable tr').each(function() {
	    console.log($(this).find(".percentage").html());
	    var perc = $(this).find(".percentage").html();
	    console.log("perc-"+$(this).val());
	 });  */
	 var proj=[];
	 $.each(projects, function( index, value ) {
		 proj.push(value.key+":"+value.value);
		});
	 if(totValue == 0){
		 alert("Please select one Project and assign % Allocation ");
		 return false;
	 }
	 else if(totValue >100){
		 alert("% Allocation shouldn't be greater than 100");
		 return false;
	 }else{
	var pageData = "associateCTSId="+$("#associateCTSId").val() +"&projects=" + proj;
	//window.opener.setValue(pageData);
	$.ajax({        	
        type: "POST",
        url: "saveAllocatedProjects.html",
        data: pageData,
        success : function(msg){
        	alert(msg);
        	$("#allocateProjects,.ui-dialog").html('');
        	$("#allocateProjects,.ui-dialog").hide();
        	$("#allocateProjects,.ui-dialog").css('display','none')
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
	<input type="hidden" id="associateCTSId" value="${associateCTSId}"/>
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
			<th>% Allocation</th>
			<th>Allocation Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${allocations}" var="project" varStatus="count">
			  <tr>
			  <c:choose>
			  	<c:when test="${project.checked eq true}">
					<td><input type="checkbox" data-counter="${count.index}" checked="checked" value="${project.projectId}"/></td>
			  	</c:when>
			  	<c:when test="${project.projectId eq hidProjectIds}">
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
              	<%-- <td data-perc="${project.checked}"><input type="text" value="${project.allocation_Percentage}"/></td>
              	<td data-status="${project.checked}"><input type="text" value="${project.allocation_Status}"/></td> --%>
              	<td class="percentage"><input data-counter="${count.index}" type="text" value="${project.allocation_Percentage}"/></td>
              	<%-- <td class="status"><input data-counter="${count.index}" 	type="text" value="${project.allocation_Status}"/></td> --%>
              	<td>${project.allocation_Status}</td>
              </tr>               
			</c:forEach> 
	</tbody>
	</table>
	<br/>
		<input type="button" id="saveAllocProjBtn" value="Save" style="float: right;">
		<div id="errorMsg">${errorMsg}</div>
</div>
