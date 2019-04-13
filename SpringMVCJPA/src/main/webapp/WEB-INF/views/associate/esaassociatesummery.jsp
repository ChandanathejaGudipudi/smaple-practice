<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
<html>
<head>
<title>revenue projection</title>
</head>
<script type="text/javascript">
$(document).ready(function(){
    $("#sectorid").change(function(){
        var selectedOption = $(this).find(":selected").val();       
        searchProcessBysectorId(selectedOption)
        
    });
    
    $("#subProcessid").change(function(){
        var selectedOption = $(this).find(":selected").val();    
        searchProjectByprocessId(selectedOption)
      
    }); 
    
  
    $("#projectID").change(function(){
        var selectedOption = $(this).find(":selected").val();  
        getAssociatateSummaryReport(selectedOption,"project");
      
    }); 
});

function searchProcessBysectorId(selectedOption) {
	 
	$.ajax({        	
        type: "GET",
        url: "http://localhost:8080/SpringMVCJPA/spring/revenue/getProcess?id="+selectedOption, 
        dataType: "text",
        success : function(data){  
        	var processarray = JSON.parse(data);        	
        	$('#subProcessid').html('');
        	$('#subProcessid').append('<option value=NONE >--- Select ---</option>');
        	var option = '';
        	for (var i=0;i<processarray.length;i++){
        		   option += '<option value="'+ processarray[i].processid + '">' + processarray[i].processname + '</option>';
        		}
        	$('#subProcessid').append(option);
	        },
		error : function(e) {
		alert("error " + e);
		},
	   	}); 
} 

function searchProjectByprocessId(selectedOption) {
	
	$.ajax({        	
      type: "GET",
      url: "http://localhost:8080/SpringMVCJPA/spring/revenue/getProject?processId="+selectedOption, 
      dataType: "text",
      success : function(data){  
      	var projectArray = JSON.parse(data);        	
      	$('#projectID').html('');
      	$('#projectID').append('<option value=NONE >--- Select ---</option>');
      	var option = '';
      	for (var i=0;i<projectArray.length;i++){
      		   option += '<option value="'+ projectArray[i].projectId + '">' + projectArray[i].projectName + '</option>';
      		}
      	$('#projectID').append(option);
	        },
		error : function(e) {
		alert("error " + e);
		},
	   	}); 
}
function getAssociatateSummaryReport(selectedOption,flag) {
	 alert("--- value selected = " + selectedOption+"--- SearchBy ----"+flag);
	$('#resultdiv').html('');
	$.ajax({        	
    type: "GET",
    url: "bcm/associatateSummary?projectId="+selectedOption, 
    dataType: "text",
    success : function(data){      	    	 	  
   	$(data).appendTo('#resultdiv');      		
	        },
		error : function(e) {
		alert("error " + e);
		},
	   	}); 
}
</script>
<style>
body {
    background-color: powderblue;
  }
table {
    width: auto;
    margin-left: auto;
    margin-right: auto;
}
html *
{
   font-size: 15px !important;
   font-family: Arial !important;
}
</style>
<body>
<div style="float: right;" ><a href="../home.html?uname=${userid}">Home</a></div><br>
<form:form method="post" name="revenue" commandName="RevenuePojo">
<table >
<tr>
<td>
<div id="leftpanel" style="height: 100px;">
<table border="1">
<tr><td>sector</td>
	<td>
	<form:select id="sectorid" path="sectorName" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />
	<form:options items="${sectorList}" />			
	</form:select>
	</td>
	<td>sub process</td>
	<td>
	<form:select id="subProcessid" path="subProcess" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />					  
	</form:select>
	</td>
	<td>project name</td>
	<td>
	<form:select id="projectID" path="projectName" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />					  
	</form:select>
</td></tr>
</table>
</div>
<div id="resultdiv">
</div>
</td>
</tr>
</table>
</form:form>
 	

</body>
</html>