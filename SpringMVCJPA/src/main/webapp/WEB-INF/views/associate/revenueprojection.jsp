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
        getProjectionReport(selectedOption,"process");
    }); 
    
  
    $("#projectID").change(function(){
        var selectedOption = $(this).find(":selected").val();  
        getProjectionReport(selectedOption,"project");
    }); 
    
});

function searchProcessBysectorId(selectedOption) {
	
	$.ajax({        	
        type: "GET",
        url: "http://localhost:8080/SpringMVCJPA/spring/revenue/getProcess?id="+selectedOption, 
        dataType: "text",
        success : function(data){  
        	alert(data)
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


function getProjectionReport(selectedOption,flag) {
	 alert("--- value selected = " + selectedOption+"--- SearchBy ----"+flag);
	$.ajax({        	
     type: "GET",
     url: "http://localhost:8080/SpringMVCJPA/spring/revenue/getRevenueProjection?searchby="+flag+"&value="+selectedOption, 
     dataType: "text",
     success : function(data){      	 
    	 //alert("---"+data)    	  
    	 var projectionArray = JSON.parse(data);     
    		$('#revenueDiv').html('');
    	 createResultTeable(projectionArray);
	        },
		error : function(e) {
		alert("error " + e);
		},
	   	}); 
}

function createResultTeable(projectionArray){

	var html = '<table border=1 align=top><thead><tr><td>Projectid</td><td>ProjectName</td><td>Project Month</td><td>Project Year<td>Project Value</td></tr></thead><tbody>';
		for (var i = 0, len = projectionArray.length; i < len; ++i) {

			html+= '<tr><td>'+ projectionArray[i].projectId +'</td>'
				+'<td>'+ projectionArray[i].projectName +'</td>'
				+'<td>'+ projectionArray[i].invoiceMonth +'</td>'
				+'<td>'+ projectionArray[i].invoiceYear +'</td>'
				+'<td>'+ projectionArray[i].forcastedValue +'</td></tr>';
		}
		$(html).appendTo('#revenueDiv');
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
   font-size: 12px !important;
   font-family: Arial !important;
}
</style>

<body>
<form:form method="post" name="revenue" commandName="RevenuePojo">
<div style="float: right;" ><a href="../home.html?uname=${userid}">Home</a></div><br>
<table border="1">
<tr>
<td>
<div id="leftpanel" style="height: 400px;">
<table>
<tr><td>sector</td>
	<td>
	<form:select id="sectorid" path="sectorName" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />
	<form:options items="${sectorList}" />			
	</form:select>
	</td></tr>
	<tr><td>sub process</td>
	<td>
	<form:select id="subProcessid" path="subProcess" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />					  
	</form:select>
	</td></tr>	
	<tr><td>project name</td>
	<td>
	<form:select id="projectID" path="projectName" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />					  
	</form:select>
	</td></tr>
</table>
</div>
</td>
<td>
<div id="revenueDiv" style="height: 400px; width:600px;">

</div>
</td>
</tr>
	
	</table>
</form:form>
 	

</body>
</html>