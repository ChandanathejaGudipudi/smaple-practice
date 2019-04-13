<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
<html>
<head>
<title>invoice  validation</title>
</head>
<script type="text/javascript">
$(document).ready(function(){
    $("p").click(function(){
    	 var monthval = $("#monthId").find(":selected").val(); 
    	 var yearval = $("#yearId").find(":selected").val(); 
    
        gestInvalidInvoice(monthval,yearval)
    });
});

function gestInvalidInvoice(monthval,yearval) {
	$.ajax({        	
	     type: "GET",
	     url: "http://localhost:8080/SpringMVCJPA/spring/revenue/invoiceValidation?month="+monthval+"&year="+yearval, 
	     dataType: "text",
	     success : function(data){      	 
	    		  
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
	
	var html = '<table border=1 align=top><thead><tr><td>processId</td><td>processName</td><td>projectId<td>projectname</td><td>invoiceMonth</td><td>invoiceYear</td><td>costCenter</td><td>invoiceAmount</td><td>status</td></tr></thead><tbody>';
		for (var i = 0, len = projectionArray.length; i < len; ++i) {
			
			html += '<tr><td>'+ projectionArray[i].processId + '</td>'
						+'<td>'+ projectionArray[i].processName + '</td>'
						+'<td>'+ projectionArray[i].projectId + '</td>'
						+'<td>'+ projectionArray[i].projectname +'</td>'
						+'<td>'+ projectionArray[i].invoiceMonth +'</td>'
						+'<td>'+ projectionArray[i].invoiceYear + '</td>'
						+'<td>'+ projectionArray[i].costCenter + '</td>'
						+'<td>'+ projectionArray[i].invoiceAmount + '</td>'
						+'<td>'+ projectionArray[i].status +'</td></tr>';
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
<div style="float: right;" ><a href="../home.html?uname=${userid}">Home</a></div><br>
<form:form method="post" name="revenuevalidation" commandName="RevenuePojo">
<div id="leftpanel">
<table>
<tr><td>select invoice for month</td>
	<td>
	<form:select id="monthId" path="invoiceMonth" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />	
	<form:options items="${monthList}" />				
	</form:select>
	</td>
	<td>year</td>
	<td>
	<form:select id="yearId" path="invoiceYear" style="width: 200px;">
	<form:option value="NONE" label="--- Select ---" />	
	<form:options items="${yearList}" />					  
	</form:select>
	</td>
	<td><td><p>click hear</p></td></tr>	
</table>
</div>
<div id="revenueDiv">

</div>
</form:form>
 	

</body>
</html>