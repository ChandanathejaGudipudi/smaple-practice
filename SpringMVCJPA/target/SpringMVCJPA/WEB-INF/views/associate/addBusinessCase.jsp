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

  div.error { color:red; font-weight: bold; font-size: 12px; }
  .input-disabled{background-color:#EBEBE4;border:1px solid #ABADB3;padding:2px 1px;}
  .input-enabled{background-color:#FFFFFF;border:1px solid #ABADB3;padding:2px 1px;}
</style>
<html>
<head><title>Add Business Case</title></head>
<script type="text/javascript">
$(document).ready(function () {
	$.ajaxSetup({ cache: false });
	var mode = '${addMode}';
	if(mode=='true'){
		$("#addMode").show();
		$("#editMode").hide();
		$("#BC_Year").val("");
		$("#ProjectId").val("");
		$('#bCId').attr('readonly', true);$('#bCId').addClass('input-disabled');
		$('#Project_Name').attr('readonly', true);$('#Project_Name').addClass('input-disabled');
		$('#Process').attr('readonly', true);$('#Process').addClass('input-disabled');
		$('#Tot_L1_FTE').attr('readonly', true);$('#Tot_L1_FTE').addClass('input-disabled');
		$('#Tot_L1_FTE_Val').attr('readonly', true);$('#Tot_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_L2_FTE').attr('readonly', true);$('#Tot_L2_FTE').addClass('input-disabled');
		$('#Tot_L2_FTE_Val').attr('readonly', true);$('#Tot_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_L3_FTE').attr('readonly', true);$('#Tot_L3_FTE').addClass('input-disabled');
		$('#Tot_L3_FTE_Val').attr('readonly', true);$('#Tot_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L1_FTE_Val').attr('readonly', true);$('#Tot_BSS_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L2_FTE_Val').attr('readonly', true);$('#Tot_BSS_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L3_FTE_Val').attr('readonly', true);$('#Tot_BSS_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L1_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L2_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L3_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_Oth_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_Oth_FTE_Val').addClass('input-disabled');
		$('#Grand_Total_FTE').attr('readonly', true);$('#Grand_Total_FTE').addClass('input-disabled');
		$('#Grand_Total_FTE_Val').attr('readonly', true);$('#Grand_Total_FTE_Val').addClass('input-disabled');
		
	}else{
		$("#addMode").hide();
		$("#editMode").show();
		$('#bCId').attr('readonly', true);$('#bCId').addClass('input-disabled');
		$('#Project_Name').attr('readonly', true);$('#Project_Name').addClass('input-disabled');
		$('#Process').attr('readonly', true);$('#Process').addClass('input-disabled');
		$('#Tot_L1_FTE').attr('readonly', true);$('#Tot_L1_FTE').addClass('input-disabled');
		$('#Tot_L1_FTE_Val').attr('readonly', true);$('#Tot_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_L2_FTE').attr('readonly', true);$('#Tot_L2_FTE').addClass('input-disabled');
		$('#Tot_L2_FTE_Val').attr('readonly', true);$('#Tot_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_L3_FTE').attr('readonly', true);$('#Tot_L3_FTE').addClass('input-disabled');
		$('#Tot_L3_FTE_Val').attr('readonly', true);$('#Tot_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L1_FTE_Val').attr('readonly', true);$('#Tot_BSS_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L2_FTE_Val').attr('readonly', true);$('#Tot_BSS_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_BSS_L3_FTE_Val').attr('readonly', true);$('#Tot_BSS_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L1_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L1_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L2_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L2_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_L3_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_L3_FTE_Val').addClass('input-disabled');
		$('#Tot_STF_Aug_Oth_FTE_Val').attr('readonly', true);$('#Tot_STF_Aug_Oth_FTE_Val').addClass('input-disabled');
		$('#Grand_Total_FTE').attr('readonly', true);$('#Grand_Total_FTE').addClass('input-disabled');
		$('#Grand_Total_FTE_Val').attr('readonly', true);$('#Grand_Total_FTE_Val').addClass('input-disabled');
		
	}
	
	  
	  $("#Currency").change(function () {
		    var currency = this.value;
		    $("#Currency").val(currency.toUpperCase());
		  });
	  $("#S2C_Number").change(function () {
		  var selectedOption = $(this).find(":selected").val(); 
		  searchProjectByStoCnumber(selectedOption)
		  	$.ajax({        	
		        type: "GET",
		        url: "checkTaskOrderId.html?s2cNumber="+ selectedOption,
		        success : function(data){
		        	
		        	if(data == "correct"){
		        		alert("S2C Number doesn't exists!");
		        		$("#S2C_Number").val("");
		        		$("#S2C_Number").focus();
		        		return false;
		        	}else if(data=="CCN"){
		        		alert("S2C Number is of Type CCN. No addition is allowed.");
		        		$("#S2C_Number").val("");
		        		$("#S2C_Number").focus();
		        		return false;
		        	}
			        }
			   	}); 
		  });
	  
	  function searchProjectByStoCnumber(selectedOption) {
			alert(selectedOption);
			$.ajax({        	
		        type: "GET",
		        url: "getProjectByStocnNumber?id="+selectedOption, 
		        success : function(data){  		        	
		        	var arr = data;
		        	alert(arr);		        	
		        	$('#ProjectId').html('');
		          	$('#ProjectId').append('<option value=NONE >--- Select ---</option>');
		          	var option = '';
		          	for (var i=0;i<arr.length;i++){
		          	option += '<option value="'+ arr[i] + '">' + arr[i]+ '</option>';
		         	 }
		          	$('#ProjectId').append(option);
			        },
				error : function(e) {
					alert("error " + e);
					},
			   	}); 
		} 
	  
// 		  $("#Parent_TO").change(function () {
// 			  var Parent_TO = $("#Parent_TO").val();
// 			  var S2C_Number = $("#S2C_Number").val();
// 				if(S2C_Number==""){
// 					alert("Please Enter S2C Number");
// 					$("#Parent_TO").val("");
// 					$("#S2C_Number").focus();
// 					return false;
// 				}
// 				var pageData = "S2C_Number="+S2C_Number +"&Parent_TO=" + Parent_TO;
// 				$.ajax({        	
// 			        type: "GET",
// 			        url: "checkParentTO.html",
// 			        data: pageData,
// 			        success : function(data){
// 			        	if(data == "error"){
// 			        		alert("S2C Number and Parent TO combination doesn't exists");
// 			        		$("#Parent_TO").val("");
// 			        		$("#Parent_TO").focus();
// 			        		return false;
// 			        	}
// 			        }
// 			   	}); 
// 			  });
	  $("#ProjectId").change(function () {
		  var ProjectId = $("#ProjectId").val();
		  var S2C_Number = $("#S2C_Number").val();
			if(S2C_Number==""){
				alert("Please Enter S2C Number");
				$("#Parent_TO").val("");
				$("#S2C_Number").focus();
				return false;
			}
			var pageData = "S2C_Number="+S2C_Number +"&ProjectId=" + ProjectId;
			$.ajax({        	
		        type: "GET",
		        url: "checkProjectTO.html",
		        data: pageData,
		        success : function(data){
		        	if(data == "error"){
		        		alert("S2C Number and ProjectId combination doesn't exists");
		        		$("#ProjectId").val("");
		        		$("#ProjectId").focus();
		        		return false;
		        	}else{
		        		var res = data.split("*");
		        		$("#Project_Name").val(res[0]);
		        		/* $("#process_Code").val(values[1]); */
		        		$("#Process").val(res[2]);
		        		return true;
		        	}
		        }
		   	}); 
		  });
  
$("#saveBtn").click(function(e){
	validateform();

});
$("#calculateBtn").click(function(){
	calculate();
});

function validateform(){
	$("#addBusinessCaseForm").validate({
		rules: {
			BC_Year: {required:true, number:true},
			S2C_Number: {required:true},
			Parent_TO: {required:true},
			ProjectId: {required:true},
			Currency: {required:true},
			L1_Rate: {number:true},
			L2_Rate: {number:true},
			L3_Rate: {number:true},
			L1_FTE: {number:true},
			L2_FTE: {number:true},
			L3_FTE: {number:true},
			BSS_L1_Rate: {number:true},
			BSS_L2_Rate: {number:true},
			BSS_L3_Rate: {number:true},
			BSS_L1_FTE: {number:true},
			BSS_L2_FTE: {number:true},
			BSS_L3_FTE: {number:true},
			STF_Aug_L1_Rate: {number:true},
			STF_Aug_L2_Rate: {number:true},
			STF_Aug_L3_Rate: {number:true},
			STF_Aug_L1_FTE: {number:true},
			STF_Aug_L2_FTE: {number:true},
			STF_Aug_L3_FTE: {number:true},
			STF_Aug_Oth_Rate: {number:true},
			STF_Aug_Oth_FTE: {number:true},
			Pex_Bnf_L1_FTE: {number:true},
			Pex_Bnf_L2_FTE: {number:true},
			Pex_Bnf_L3_FTE: {number:true},
			Robo_Bnf_L1_FTE: {number:true},
			Robo_Bnf_L2_FTE: {number:true},
			Robo_Bnf_L3_FTE: {number:true},
			L1_Dis_Rate: {number:true},
			L2_Dis_Rate: {number:true},
			L3_Dis_Rate: {number:true},
			L1_Dis_FTE: {number:true},
			L2_Dis_FTE: {number:true},
			L3_Dis_FTE: {number:true}
	      },    	 
	    errorElement: "div",
	    submitHandler: function(form) {
	    	calculate();
	    	$(this).submit();
	    	var form = $("#addBusinessCaseForm");			
		   	var data = $("#addBusinessCaseForm").serialize();			
	      	$.ajax({  
	      		type: form.attr('method'),
	            url: "addBusinessCase",//form.attr('action'),	            
	            data : data,
	            datatype : "application/json",
	            success : function(result){	            	
		          	
		          	if(result=="false"){
		          		alert("For entered CCN parent TO has BC for particular project and  month Please edit that BC record New BC insertion is not permitted");
		          	}else{
		          		alert("Business case saved"); 
		          		window.location.href="getBCTracker.html";	
		          	}
		          	
    			},
	            error : function(callback){
	            	alert("Error saving Business Case");	            	
	            }
	       	});
	    } 
	});	
}
function calculate(){
	var Tot_L1_FTE = ((Number($("#L1_FTE").val()) + Number($("#L1_Dis_FTE").val()))-(Number($("#Pex_Bnf_L1_FTE").val()) + Number($("#Robo_Bnf_L1_FTE").val())));
	$("#Tot_L1_FTE").val(Tot_L1_FTE);
	
	var Tot_L1_FTE_Val = (((Number($("#L1_FTE").val())*Number($("#L1_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#L1_Dis_FTE").val())*Number($("#L1_Dis_Rate").val()))*Number($("#UOM_Value").val()))-((Number($("#Pex_Bnf_L1_FTE").val())*Number($("#L1_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#Robo_Bnf_L1_FTE").val())*Number($("#L1_Rate").val()))*Number($("#UOM_Value").val())));;
	$("#Tot_L1_FTE_Val").val(Tot_L1_FTE_Val); 
	
	
	var Tot_L2_FTE = ((Number($("#L2_FTE").val()) + Number($("#L2_Dis_FTE").val()))-(Number($("#Pex_Bnf_L2_FTE").val()) + Number($("#Robo_Bnf_L2_FTE").val())));
	$("#Tot_L2_FTE").val(Tot_L2_FTE);
	
	var Tot_L2_FTE_Val = (((Number($("#L2_FTE").val())*Number($("#L2_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#L2_Dis_FTE").val())*Number($("#L2_Dis_Rate").val()))*Number($("#UOM_Value").val()))-((Number($("#Pex_Bnf_L2_FTE").val())*Number($("#L2_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#Robo_Bnf_L2_FTE").val())*Number($("#L2_Rate").val()))*Number($("#UOM_Value").val())));;
	$("#Tot_L2_FTE_Val").val(Tot_L2_FTE_Val);
	
	var Tot_L3_FTE = ((Number($("#L3_FTE").val()) + Number($("#L3_Dis_FTE").val()))-(Number($("#Pex_Bnf_L3_FTE").val()) + Number($("#Robo_Bnf_L3_FTE").val())));
	$("#Tot_L3_FTE").val(Tot_L3_FTE);
	
	var Tot_L3_FTE_Val = (((Number($("#L3_FTE").val())*Number($("#L3_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#L3_Dis_FTE").val())*Number($("#L3_Dis_Rate").val()))*Number($("#UOM_Value").val()))-((Number($("#Pex_Bnf_L3_FTE").val())*Number($("#L3_Rate").val())*Number($("#UOM_Value").val())) + (Number($("#Robo_Bnf_L3_FTE").val())*Number($("#L3_Rate").val()))*Number($("#UOM_Value").val())));;
	$("#Tot_L3_FTE_Val").val(Tot_L3_FTE_Val);
	
	var Tot_BSS_L1_FTE_Val = Number($("#BSS_L1_Rate").val()) * Number($("#BSS_L1_FTE").val())*Number($("#UOM_Value").val());
	$("#Tot_BSS_L1_FTE_Val").val(Tot_BSS_L1_FTE_Val);
	
	var Tot_BSS_L2_FTE_Val = Number($("#BSS_L2_Rate").val()) * Number($("#BSS_L2_FTE").val())*Number($("#UOM_Value").val());
	$("#Tot_BSS_L2_FTE_Val").val(Tot_BSS_L2_FTE_Val);
	
	var Tot_BSS_L3_FTE_Val = Number($("#BSS_L3_Rate").val()) * Number($("#BSS_L3_FTE").val())*Number($("#UOM_Value").val());
	$("#Tot_BSS_L3_FTE_Val").val(Tot_BSS_L3_FTE_Val);
	
	var Tot_STF_Aug_L1_FTE_Val = Number($("#STF_Aug_L1_Rate").val()) * Number($("#STF_Aug_L1_FTE").val()) * Number($("#SAL1_Working_Days").val());
	$("#Tot_STF_Aug_L1_FTE_Val").val(Tot_STF_Aug_L1_FTE_Val);
	
	var Tot_STF_Aug_L2_FTE_Val = Number($("#STF_Aug_L2_Rate").val()) * Number($("#STF_Aug_L2_FTE").val()) * Number($("#SAL2_Working_Days").val());
	$("#Tot_STF_Aug_L2_FTE_Val").val(Tot_STF_Aug_L2_FTE_Val);
	
	var Tot_STF_Aug_L3_FTE_Val = Number($("#STF_Aug_L3_Rate").val()) * Number($("#STF_Aug_L3_FTE").val()) * Number($("#SAL3_Working_Days").val());
	$("#Tot_STF_Aug_L3_FTE_Val").val(Tot_STF_Aug_L3_FTE_Val);
	
	var Tot_STF_Aug_Oth_FTE_Val = Number($("#STF_Aug_Oth_Rate").val()) * Number($("#STF_Aug_Oth_FTE").val()) * Number($("#SA_Working_Days").val());
	$("#Tot_STF_Aug_Oth_FTE_Val").val(Tot_STF_Aug_Oth_FTE_Val);
	
	var Grand_Total_FTE = Number(Tot_L1_FTE) + Number(Tot_L2_FTE) + Number(Tot_L3_FTE) + Number($("#BSS_L1_FTE").val()) + Number($("#BSS_L2_FTE").val()) + Number($("#BSS_L3_FTE").val())+ Number($("#STF_Aug_L1_FTE").val())+ Number($("#STF_Aug_L2_FTE").val())+ Number($("#STF_Aug_L3_FTE").val())+ Number($("#STF_Aug_Oth_FTE").val());
	$("#Grand_Total_FTE").val(Grand_Total_FTE);
	
	var Grand_Total_FTE_Val = Number(Tot_L1_FTE_Val) + Number(Tot_L2_FTE_Val) + Number(Tot_L3_FTE_Val) + Number(Tot_BSS_L1_FTE_Val) + Number(Tot_BSS_L2_FTE_Val) + Number(Tot_BSS_L3_FTE_Val) + Number(Tot_STF_Aug_L1_FTE_Val) + Number(Tot_STF_Aug_L2_FTE_Val) + Number(Tot_STF_Aug_L3_FTE_Val) + Number(Tot_STF_Aug_Oth_FTE_Val) ;
	$("#Grand_Total_FTE_Val").val(Grand_Total_FTE_Val);
	
}
});	
</script>
<body>
<div id="addMode"><h1>Add Business Case</h1></div>
<div id="editMode"><h1>Edit Business Case</h1></div>
<div style="float: right;" ><a href="getBCTracker.html">Go back</a></div>
<form:form commandName="BCSummary" id="addBusinessCaseForm" name="addBusinessCaseForm" method="post">
		<form:errors path="*"/>
		<div id="addProjectsInBC"></div>
		<table style="width: 80%;border: 1px solid black;">
		<tbody>
		
			<tr>
				<td>BC Id</td>
				<td><form:input path="bCId" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>BC Year</td>
				<td><form:input path="BC_Year" style="width: 200px;" /></td>
				<td>BC Month</td>
				<td>
					<form:select path="BC_Month" style="width: 200px;">
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
				<td>S2C Number</td>
				<td>
				<!--<form:input path="S2C_Number" style="width: 200px;" />-->
				<form:select id="S2C_Number" path="S2C_Number" style="width: 200px;">
				<form:option value="NONE" label="--- Select S2Cnumber ---" />
				<form:options items="${s2cNumberlist}" />			
				</form:select>
				</td>
				<td>Parent TO</td>
				<td><form:input path="Parent_TO" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Project Id</td>
				<td>
				<!--<form:input path="ProjectId" style="width: 200px;" /> -->
				<form:select id="ProjectId" path="ProjectId" style="width: 200px;">
				<form:option value="0" label="--- Select S2Cnumber ---" />			  
				</form:select>
				</td>
				<td>Project Name</td>
				<td><form:input path="Project_Name" style="width: 200px;" /></td>
				<td>Process</td>
				<td><form:input path="Process" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Cost Center</td>
				<td><form:input path="Cost_center" style="width: 200px;" /></td>
				<td>Location of FTE</td>
				<td><form:input path="Loc_FTE" style="width: 200px;" /></td>
			</tr>
			<tr>
				<td>Currency</td>
				<td><form:input path="Currency" style="width: 200px;" /></td>
				<td>UOM</td>
				<td>
					<form:select path="UOM" style="width: 200px;">
					<form:option value="Monthly">Monthly Rate</form:option>
					<form:option value="Daily">Daily Rate</form:option>
					<form:option value="Fixed">Fixed Rate</form:option>
					<form:option value="RPT">Rate Per Transaction</form:option>
				</form:select>
				</td>
				<td>UOM Value</td>
				<td><form:input path="UOM_Value" style="width: 200px;" /></td>
			</tr>
			</tbody>
			</table>
			
			<table style="width: 80%;align:center;" >
			<tbody>
			<tr>
				<td>L1 Role</td>
				<td><form:input path="L1_Role" style="width: 150px;" /></td>
				<td>L1 Rate</td>
				<td><form:input path="L1_Rate" style="width: 100px;" /></td>
				<td>L1 FTE</td>
				<td><form:input path="L1_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>L2 Role</td>
				<td><form:input path="L2_Role" style="width: 150px;" /></td>
				<td>L2 Rate</td>
				<td><form:input path="L2_Rate" style="width: 100px;" /></td>
				<td>L2 FTE</td>
				<td><form:input path="L2_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>L3 Role</td>
				<td><form:input path="L3_Role" style="width: 150px;" /></td>
				<td>L3 Rate</td>
				<td><form:input path="L3_Rate" style="width: 100px;" /></td>
				<td>L3 FTE</td>
				<td><form:input path="L3_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>BSS L1 Role</td>
				<td><form:input path="BSS_L1_Role" style="width: 150px;" /></td>
				<td>BSS L1 Rate</td>
				<td><form:input path="BSS_L1_Rate" style="width: 100px;" /></td>
				<td>BSS L1 FTE</td>
				<td><form:input path="BSS_L1_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>BSS L2 Role</td>
				<td><form:input path="BSS_L2_Role" style="width: 150px;" /></td>
				<td>BSS L2 Rate</td>
				<td><form:input path="BSS_L2_Rate" style="width: 100px;" /></td>
				<td>BSS L2 FTE</td>
				<td><form:input path="BSS_L2_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>BSS L3 Role</td>
				<td><form:input path="BSS_L3_Role" style="width: 150px;" /></td>
				<td>BSS L3 Rate</td>
				<td><form:input path="BSS_L3_Rate" style="width: 100px;" /></td>
				<td>BSS L3 FTE</td>
				<td><form:input path="BSS_L3_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Staff Aug L1 Role</td>
				<td><form:input path="STF_Aug_L1_Role" style="width: 150px;" /></td>
				<td>Staff Aug L1 Rate</td>
				<td><form:input path="STF_Aug_L1_Rate" style="width: 100px;" /></td>
				<td>Staff Aug L1 FTE</td>
				<td><form:input path="STF_Aug_L1_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Staff Aug L2 Role</td>
				<td><form:input path="STF_Aug_L2_Role" style="width: 150px;" /></td>
				<td>Staff Aug L2 Rate</td>
				<td><form:input path="STF_Aug_L2_Rate" style="width: 100px;" /></td>
				<td>Staff Aug L2 FTE</td>
				<td><form:input path="STF_Aug_L2_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Staff Aug L3 Role</td>
				<td><form:input path="STF_Aug_L3_Role" style="width: 150px;" /></td>
				<td>Staff Aug L3 Rate</td>
				<td><form:input path="STF_Aug_L3_Rate" style="width: 100px;" /></td>
				<td>Staff Aug L3 FTE</td>
				<td><form:input path="STF_Aug_L3_FTE" style="width: 100px;" /></td>
			</tr>	
			<tr>
				<td>Staff Aug Other Role</td>
				<td><form:input path="STF_Aug_Oth_Role" style="width: 150px;" /></td>
				<td>Staff Aug Other Rate</td>
				<td><form:input path="STF_Aug_Oth_Rate" style="width: 100px;" /></td>
				<td>Staff Aug Other FTE</td>
				<td><form:input path="STF_Aug_Oth_FTE" style="width: 100px;" /></td>
			</tr>	
			<tr>
				<td>SAL1 WDs/Months</td>
				<td><form:input path="SAL1_Working_Days" style="width: 100px;" /></td>
				<td>SAL2 WDs/Months</td>
				<td><form:input path="SAL2_Working_Days" style="width: 100px;" /></td>
				<td>SAL3 WDs/Months</td>
				<td><form:input path="SAL3_Working_Days" style="width: 100px;" /></td>
				<td>SA Other WDs/Months</td>
				<td><form:input path="SA_Working_Days" style="width: 100px;" /></td>
			</tr>	
			<tr>
				<td>Pex Benifit L1 FTE</td>
				<td><form:input path="Pex_Bnf_L1_FTE" style="width: 100px;" /></td>
				<td>Pex Benifit L2 FTE</td>
				<td><form:input path="Pex_Bnf_L2_FTE" style="width: 100px;" /></td>
				<td>Pex Benifit L3 FTE</td>
				<td><form:input path="Pex_Bnf_L3_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Robotics Benefit L1 FTE#</td>
				<td><form:input path="Robo_Bnf_L1_FTE" style="width: 100px;" /></td>
				<td>Robotics Benefit L2 FTE#</td>
				<td><form:input path="Robo_Bnf_L2_FTE" style="width: 100px;" /></td>
				<td>Robotics Benefit L3 FTE#</td>
				<td><form:input path="Robo_Bnf_L3_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>L1 Discounted Rate</td>
				<td><form:input path="L1_Dis_Rate" style="width: 100px;" /></td>
				<td>L2 Discounted Rate</td>
				<td><form:input path="L2_Dis_Rate" style="width: 100px;" /></td>
				<td>L3 Discounted Rate</td>
				<td><form:input path="L3_Dis_Rate" style="width: 100px;" /></td>
				
			</tr>
			<tr>
				<td>L1 Discounted FTE#</td>
				<td><form:input path="L1_Dis_FTE" style="width: 100px;" /></td>
				<td>L2 Discounted FTE#</td>
				<td><form:input path="L2_Dis_FTE" style="width: 100px;" /></td>
				<td>L3 Discounted FTE#</td>
				<td><form:input path="L3_Dis_FTE" style="width: 100px;" /></td>
				<td><input type="button" id="calculateBtn" value="Calculate"/></td>
			</tr>
					
			<tr>
				<td>Total L1 FTE#</td>
				<td><form:input path="Tot_L1_FTE" style="width: 100px;" /></td>
				<td>Total L2 FTE#</td>
				<td><form:input path="Tot_L2_FTE" style="width: 100px;" /></td>
				<td>Total L3 FTE#</td>
				<td><form:input path="Tot_L3_FTE" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Total L1 FTE Value</td>
				<td><form:input path="Tot_L1_FTE_Val" style="width: 100px;" /></td>
				<td>Total L2 FTE Value</td>
				<td><form:input path="Tot_L2_FTE_Val" style="width: 100px;" /></td>
				<td>Total L3 FTE Value</td>
				<td><form:input path="Tot_L3_FTE_Val" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Total BSS L1 FTE Value</td>
				<td><form:input path="Tot_BSS_L1_FTE_Val" style="width: 100px;" /></td>
				<td>Total BSS L2 FTE Value</td>
				<td><form:input path="Tot_BSS_L2_FTE_Val" style="width: 100px;" /></td>
				<td>Total BSS L3 FTE Value</td>
				<td><form:input path="Tot_BSS_L3_FTE_Val" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Total Staff Aug L1 FTE Value</td>
				<td><form:input path="Tot_STF_Aug_L1_FTE_Val" style="width: 100px;" /></td>
				<td>Total Staff Aug L2 FTE Value</td>
				<td><form:input path="Tot_STF_Aug_L2_FTE_Val" style="width: 100px;" /></td>
				<td>Total Staff Aug L3 FTE Value</td>
				<td><form:input path="Tot_STF_Aug_L3_FTE_Val" style="width: 100px;" /></td>
			</tr>
			<tr>
				<td>Total Staff Aug other FTE Value</td>
				<td><form:input path="Tot_STF_Aug_Oth_FTE_Val" style="width: 100px;" /></td>
				<td>Grand Total FTE#</td>
				<td><form:input path="Grand_Total_FTE" style="width: 100px;" /></td>
				<td>Grand Total FTE Value</td>
				<td><form:input path="Grand_Total_FTE_Val" style="width: 100px;" /></td>
			</tr>
			<tr>
			<td>Total value in USD</td>
				<td><form:input path="USD_Eq_Val" style="width: 100px;" /></td>
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