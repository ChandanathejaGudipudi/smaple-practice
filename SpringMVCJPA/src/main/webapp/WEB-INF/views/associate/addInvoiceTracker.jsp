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
<head><title>Add Invoice Tracker</title></head>
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
	}
	

	$("#Project_Id").change(function () {
		  var Project_Id = $("#Project_Id").val();
		  
			var pageData = "Project_Id="+Project_Id;
			$.ajax({        	
		        type: "GET",
		        url: "checkProjectIT.html",
		        data: pageData,
		        success : function(data){
		        	if(data == "error"){
		        		alert("ProjectId doesn't exists");
		        		$("#ProjectId").val("");
		        		$("#ProjectId").focus();
		        		return false;
		        	}else{
		        		var res = data.split("*");
		        		$("#Project_Desc").val(res[0]);
		        		$("#Process").val(res[8]);
		        		$("#PM_Id").val(res[6]);
		        		$("#AM_Id").val(res[9]);
		        		$("#Sector").val(res[4]);
		        		$("#Sub_Sect").val(res[5]);
		        		$("#PM_Name").val(res[7]);
		        		$("#AM_Name").val(res[10]);
		        		$("#Cust_Id").val(res[11]);
		        		$("#Cust_Name").val(res[12]);
		        		return true;
		        	}
		        }
		   	}); 
		  });

$("#saveBtn").click(function(e){
	$("#addInvoiceTrackerForm").validate({
		rules: {
			Inv_Year: {required:true, number:true},
			invoiceId: {required:true},
			Project_Id:{required:true}
	      },    	 
	    errorElement: "div",
	    submitHandler: function(form) {
	    	$(this).submit();
	    	var form = $("#addInvoiceTrackerForm");			
		   	var data = $("#addInvoiceTrackerForm").serialize();			
	      	$.ajax({  
	      		type: form.attr('method'),
	            url: "addInvoiceTracker",//form.attr('action'),	            
	            data : data,
	            datatype : "application/json",
	            success : function(result){	            	
		          	alert(result); 
		          	window.location.href="getInvoiceTracker.html";
    			},
	            error : function(callback){
	            	alert("Error saving Invoice Tracker");	            	
	            }
	       	});
	    } 
	});	
});

});	
</script>
<body>
<div id="addMode"><h1>Add Invoice Tracker</h1></div>
<div id="editMode"><h1>Edit Invoice Tracker</h1></div>
<div style="float: right;" ><a href="getInvoiceTracker.html">Go back</a></div>
<form:form commandName="InvoiceSummary" id="addInvoiceTrackerForm" name="addInvoiceTrackerForm" method="post">
		<form:errors path="*"/>
		<table style="width: 30%;">
		<tbody>
			<tr>
				<td>Invoice Id</td>
				<td><form:input path="invoiceId" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Year</td>
				<td><form:input path="Inv_Year" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Month</td>
				<td>
				<form:select path="Inv_Month" style="width: 200px;">
					<form:option value="01">January</form:option>
					<form:option value="02">February</form:option>
					<form:option value="03">March</form:option>
					<form:option value="04">April</form:option>
					<form:option value="05">May</form:option>
					<form:option value="06">June</form:option>
					<form:option value="07">July</form:option>
					<form:option value="08">August</form:option>
					<form:option value="09">September</form:option>
					<form:option value="10">October</form:option>
					<form:option value="11">November</form:option>
					<form:option value="12">December</form:option>

				</form:select>
				</td>
			</tr>
			<tr>
				<td>Invoice Sent On</td>
				<td><form:input path="Invoice_Sent_Date" style="width: 200px;" /></td>
			</tr>
			
			<tr>
				<td>Invoice Date</td>
				<td><form:input path="Invoice_Date" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Transaction Type</td>
				<td>
				<form:select path="Trn_Type" style="width: 200px;">
					<form:option value="Invoice">Invoice</form:option>
					<form:option value="ConsolidatedInvoice">Consolidate Invoice</form:option>
					<form:option value="CreditNote">Credit Note</form:option>
					<form:option value="OnAccount">On Account</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Currency</td>
				<td>
				<form:select path="Currency" style="width: 200px;">
					<form:option value="USD">USD</form:option>
					<form:option value="GBP">GBP</form:option>
					<form:option value="CHF">CHF</form:option>
					<form:option value="INR">INR</form:option>
					<form:option value="HKD">HKD</form:option>
					<form:option value="EUR">EUR</form:option>
					<form:option value="AUD">AUD</form:option>
					<form:option value="SGD">SGD</form:option>
					<form:option value="MIR">MIR</form:option>
					<form:option value="THB">THB</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Amount Due(Pre Tax)</td>
				<td><form:input path="Inv_Amt_Pre_Tax" style="width: 200px;" /></td>
			</tr>
			
			<tr>
				<td>USD Equivalent (Pre Tax)</td>
				<td><form:input path="USD_Equ_Pre_Tax" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Amount Due(After Tax)</td>
				<td><form:input path="Amt_Due_Post_Tax" style="width: 200px;" /></td>
			</tr>
			
			<tr>
				<td>USD Equivalent (After Tax)</td>
				<td><form:input path="USD_Equ_Post_Tax" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>S2C ID</td>
				<td><form:input path="S2C_Id" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Cost Center</td>
				<td><form:input path="Cost_Centre" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Project Id</td>
				<td><form:input path="Project_Id" style="width: 200px;" /></td>
			</tr>
			
			<tr>
				<td>Project Description</td>
				<td><form:input path="Project_Desc" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Process</td>
				<td><form:input path="Process" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>PM Id</td>
				<td><form:input path="PM_Id" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>PM Name</td>
				<td><form:input path="PM_Name" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Customer Id</td>
				<td><form:input path="Cust_Id" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><form:input path="Cust_Name" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>AM Id</td>
				<td><form:input path="AM_Id" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>AM Name</td>
				<td><form:input path="AM_Name" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Sector</td>
				<td><form:input path="Sector" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Sub Sector</td>
				<td><form:input path="Sub_Sect" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Region</td>
				<td><form:input path="Region" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td>
				<form:select path="Inv_Status" style="width: 200px;">
					<form:option value="AP">AP</form:option>
					<form:option value="Coding">Coding</form:option>
					<form:option value="Parked">Parked</form:option>
					<form:option value="Processed">Processed</form:option>
					<form:option value="Comments">Comments</form:option>
					<form:option value="OnHold">On Hold</form:option>
					<form:option value="GenAuth">General Authorization</form:option>
					<form:option value="FinAuth">Financial Authorization</form:option>
					<form:option value="PostedSAP">Posted to SAP</form:option>
					<form:option value="Paid">Paid</form:option>
					<form:option value="Aborted">Aborted</form:option>
					<form:option value="InvSentRecently">Invoice sent recently</form:option>
					<form:option value="NotSent">Not sent</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Remarks</td>
				<td><form:input path="Remarks" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Invoice aging as of today </td>
				<td><form:input path="Inv_Aging_As_Today" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>AR Interest as of today </td>
				<td><form:input path="AR_Interest" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Invoice aging on ME</td>
				<td><form:input path="Inv_Aging_Me" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Projected AR Interest(ME)</td>
				<td><form:input path="Proj_AR_Interest" style="width: 200px;" /></td>
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