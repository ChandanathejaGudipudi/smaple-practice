<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.13/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.jqueryui.min.css">
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
        SunSans-Regular, sans-serif
     }

  div.error { color:red; font-weight: bold; font-size: 14px; }
  .input-disabled{background-color:#EBEBE4;border:1px solid #ABADB3;padding:2px 1px;}
  .input-enabled{background-color:#FFFFFF;border:1px solid #ABADB3;padding:2px 1px;}
</style>
<html>
<head><title>Add Task Order</title></head>
<script type="text/javascript">
$(document).ready(function () {
	$.ajaxSetup({ cache: false });
	var mode = '${addMode}';
	if(mode=='true'){
		$("#addMode").show();
		$("#editMode").hide();
	}else{
		$("#addMode").hide();
		$("#editMode").show();
		$('#Task_Type').attr('readonly', true);$('#Task_Type').addClass('input-disabled');
		$('#s2cNumber').attr('readonly', true);$('#s2cNumber').addClass('input-disabled');
	}
	
	  $("#Task_Type").change(function () {
		  var type = this.value;
		   	if(type=="SSTO"){
		   		$('#Reason_For_CCN').attr('readonly', true);$('#Reason_For_CCN').addClass('input-disabled');
		   		$('#Change_Contract_Value').attr('readonly', true);$('#Change_Contract_Value').addClass('input-disabled');
		   		$('#Discount_Amount').attr('readonly', false);$('#Discount_Amount').addClass('input-enabled');
		   	}
		   	if(type=="CCN"){
		   		$('#Reason_For_CCN').attr('readonly', false);$('#Reason_For_CCN').addClass('input-enabled');
		   		$('#Change_Contract_Value').attr('readonly', false);$('#Change_Contract_Value').addClass('input-enabled');
		   		$('#Discount_Amount').attr('readonly', false);$('#Discount_Amount').addClass('input-enabled');
		   		$('#Change_Contract_Value').attr('readonly', false);$('#Change_Contract_Value').addClass('input-enabled');
		   	}
		   	if(type=="Transition"){
		   		$('#Reason_For_CCN').attr('readonly', true);$('#Reason_For_CCN').addClass('input-disabled');
		   		$('#Discount_Amount').attr('readonly', true);$('#Discount_Amount').addClass('input-disabled');
		   		$('#Change_Contract_Value').attr('readonly', true);$('#Change_Contract_Value').addClass('input-disabled');
		   	}
		   	if(type=="STFAG"){
		   		$('#Parent_TO').attr('readonly', true);$('#Parent_TO').addClass('input-disabled');
		   		$('#Type_Of_Contract').attr('readonly', true);$('#Type_Of_Contract').addClass('input-disabled');
		   	}
		  }); 
	  
	  $("#s2cNumber").change(function () {
		   	$.ajax({        	
		        type: "GET",
		        url: "checkTaskOrderId.html?s2cNumber="+ $("#s2cNumber").val(),
		        success : function(data){
		        	if(data != "correct"){
		        		alert("S2C Number already exists!");
		        		$("#s2cNumber").val("");
		        		$("#s2cNumber").focus();
		        		return false;
		        	}
			        }
			   	}); 
		  });
	  
	  $("#Eff_Date").change(function () {
		    var doj = this.value;
		    if(doj != ""){
		    $.ajax({        	
		        type: "GET",
		        url: "checkDateFormat.html?doj="+ doj,
		        success : function(data){
		        	if(data != "correct")
		        		alert("Please enter date in 'YYYY-MM-DD' format");
		        	//$("#Eff_Date").val("");
	        		//$("#Eff_Date").focus();
		        }
		   	}); 
		    }
		  });
	  
	  $("#Exp_Date").change(function () {
		    var doj = this.value;
		    if(doj != ""){
		    $.ajax({        	
		        type: "GET",
		        url: "checkDateFormat.html?doj="+ doj,
		        success : function(data){
		        	if(data != "correct")
		        		alert("Please enter date in 'YYYY-MM-DD' format");
		        	//$("#Exp_Date").val("");
	        		//$("#Exp_Date").focus();
		        }
		   	}); 
		    }
		  });
	  
	  $("#Currency").change(function () {
		    var currency = this.value;
		    $("#Currency").val(currency.toUpperCase());
		  });

	  $("#Project_Id_Btn").click(function(){
			var s2cNumber = $("#s2cNumber").val();
			if(s2cNumber==""){
				alert("Please Enter S2C Number");
				$("#s2cNumber").focus();
				return false;
			}
			$.ajax({        	
			        type: "GET",
			        url: "addProjectsInTO.html?s2cNumber="+$("#s2cNumber").val(),
			        success : function(data){
			        	$("#addProjectsInTO").html("");
						$("#addProjectsInTO").html(data).dialog({
							title: "Add Projects",
							autoOpen:false,
							modal:true,
							width: 900,
							height: 600,
							position: { my: 'top', at: 'top+80' },
							resizeable: true
						}).dialog("open");
			        }
			   	}); 
		});
  
$("#saveBtn").click(function(e){
	$("#addTaskOrderForm").validate({
		rules: {
			Task_Type: {required:true},
			s2cNumber: {required:true},
			ODP_Number: {required:true},
			Parent_TO_Number: {required:true},
			CTS_Legal_Entity: {required:true},
			UBS_Legal_Entity: {required:true},
			UBS_Affiliates: {required:true},
			Services_Coverage_Region: {required:true},
			Project_Id: {required:true},
			//Process: {required:true},
			CTS_Business_Manager:{required:true},
			UBS_Business_Manager:{required:true},
			Eff_Date:{required:true},
			Exp_Date: {required:true},
			Currency: {required:true},
			Type_Of_Contract: {required:true},
			Task_Order_Status: {required:true}
	      },    	 
	    errorElement: "div",
	    submitHandler: function(form) {
	    	$(this).submit();
	    	var form = $("#addTaskOrderForm");			
		   	var data = $("#addTaskOrderForm").serialize();	
	      	$.ajax({  
	      		type: form.attr('method'),
	            url: "updateTaskOrder",//form.attr('action'),	            
	            data : data,
	            datatype : "application/json",
	            success : function(result){	            	
		          	alert(result); 
		          	window.location.href="getTOTracker.html";
    			},
	            error : function(callback){
	            	alert("Error saving Task Order");	            	
	            }
	       	});
	    } 
	});	
});

});	
</script>
<body>
<div id="addMode"><h1>Add Task Order</h1></div>
<div id="editMode"><h1>Edit Task Order</h1></div>
<div style="float: right;" ><a href="getTOTracker.html">Go back</a></div>
<form:form commandName="TOSummary" id="addTaskOrderForm" name="addTaskOrderForm" method="post">
		<form:errors path="*"/>
		<div id="addProjectsInTO"></div>
		<table style="width: 30%;">
		<tbody>
			<tr>
				<td>Type of Task Order</td>
				<td>
				<form:select path="Task_Type" style="width: 200px;">
					<form:option value="">Select</form:option>
					<form:option value="SSTO">SSTO</form:option>
					<form:option value="CCN">CCN</form:option>
					<form:option value="Transition">Transition</form:option>
					<form:option value="STFAG">Staff Aug TO</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>S2C Number</td> 
				<td ><form:input path="s2cNumber" style="width: 200px;"/></td>
			</tr>
			<tr>
				<td>ODP Number</td>
				<td><form:input path="ODP_Number" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Parent TO Number</td>
				<td><form:input path="Parent_TO" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>CTS Legal Entity</td>
				<td><form:input path="CTS_Legal_Entity" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>UBS Legal entity</td>
				<td><form:input path="UBS_Legal_Entity" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>UBS Affiliates</td>
				<td><form:input path="UBS_Affiliates" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Services Coverage Region</td>
				<td><form:input path="Services_Coverage_Region" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Project Id</td>
				<td><input type="button" id="Project_Id_Btn" value="Add Projects"/></td>
			</tr>
			
			<tr>
				<!-- <td>Process</td> -->
				<td><form:input type="hidden" path="Process" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>CTS Business manager</td>
				<td><form:input path="CTS_Business_Manager" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>UBS Business manager</td>
				<td><form:input path="UBS_Business_Manager" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Start date</td>
				<td><form:input path="Eff_Date" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>End date</td>
				<td><form:input path="Exp_Date" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Currency</td>
				<td><form:input path="Currency" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>FTE Effort Charges</td>
				<td><form:input path="FTE_Effort_Charges" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Discount Amount</td>
				<td><form:input path="Discount_Amount" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Expense Amount</td>
				<td><form:input path="Expense_Amount" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Total Contract Value</td>
				<td><form:input path="Contract_Value" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Type Of Contract</td>
				<td>
				<form:select path="Type_Of_Contract" style="width: 200px;">
					<form:option value="">Select</form:option>
					<form:option value="BTM">BTM</form:option>
					<form:option value="BTB">BTB</form:option>
					<form:option value="BFD">BFD</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Task Order Status</td>
				<td>
				<form:select path="Task_Order_Status" style="width: 200px;">
					<form:option value="">Select</form:option>
					
					<form:option value="Draft">Draft</form:option>
					<form:option value="Approvals">Approvals</form:option>
					<form:option value="Signed_by_UBS">Signed by UBS</form:option>
					<form:option value="Signed_by_CTS">Signed by CTS</form:option>
					<form:option value="Fully_Executed">Fully Executed</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Reason for CCN</td>
				<td><form:input path="Reason_For_CCN" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Change in contract Value</td>
				<td><form:input path="Change_Contract_Value" style="width: 200px;" /></td>
			</tr>
			
			
			<tr>
				<td style="float: right;">
				<input type="reset" id="clear"  value="Clear"/>
				<%-- <form:button id="clear" value="Clear">Clear</form:button> --%>
				</td>
				<td><form:button id="saveBtn" value="Save">Save</form:button></td>
			</tr>
	</tbody>
	</table>
</form:form>
</body>
</html>