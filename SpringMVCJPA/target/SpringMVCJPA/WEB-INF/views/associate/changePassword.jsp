 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<script src="../resources/js/jquery.validate.js" type="text/javascript"></script>
   <%--  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  --%>
<style>
  div.errorMsg { color:red; font-weight: bold; font-size: 14px; }
</style>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password Page</title>
</head>
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
</style>
<script type="text/javascript">
$(document).ready(function () {
	//var userId = request.getAttribiute("uname");
	var userId = '${userName}';
	$("#uname").val(userId);
	$('#uname').attr('readonly', true);
	$("#changePwdBtn").click(function(e){
		var oldPwd = $("#oldPwd").val();
		var newPwd = $("#newPwd").val();
		var confPwd = $("#confPwd").val();
		if(oldPwd ==""){
			alert("Please enter Old Password");
			$("#oldPwd").focus();
			return false;
		}else if(newPwd ==""){
			alert("Please enter New Password");
			$("#newPwd").focus();
			return false;
		}else if(confPwd ==""){
			alert("Please enter Confirm Password");
			$("#confPwd").focus();
			return false;
		}else if(newPwd != confPwd){
			alert("Passwords do not match");
			$("#newPwd").val("");
			$("#confPwd").val("");
			$("#newPwd").focus();
			return false;
		}else if(newPwd=="password-123"){ 
			alert("Old Password is not allowed");
			$("#newPwd").val("");
			$("#confPwd").val("");
			$("#newPwd").focus();
		}else{
			var pageData = "userId="+userId +"&oldPwd=" + oldPwd +"&newPwd=" + newPwd ;
			$.ajax({  
				type: "POST",
	            url: "updatePassword",	            
	            data : pageData,
	            datatype : "application/json",
	            success : function(result){	            	
		          	if(result=="success"){
		          		alert("Password Updated Successfully !!"); 
		          	}else{
		          		alert("Error while updating Password !!");
		          	}
		          	window.location.href="login";
    			},
	            error : function(callback){
	            	alert("Error Updating Password");	            	
	            }
	       	});
		}
	});
});
</script>
<body>
<h1>Change Password</h1>
<br>
	<form method="GET">
	<table>
		<tr><td><b>UserID: </b></td><td><input type="text" id="uname" name="uname"/></td></tr>
		<tr><td><b>Old Password: </b></td><td><input type="password" id="oldPwd" name="oldPwd"/></td></tr>
		<tr><td><b>New Password: </b></td><td><input type="password" id="newPwd" name="newPwd"/></td></tr>
		<tr><td><b>Confirm Password: </b></td><td><input type="password" id="confPwd" name="confPwd"/></td></tr>
		<tr><td></td><td><input type="button" id="changePwdBtn" value="Save" ></td></tr>
		<tr><td><div class="errorMsg">${errorMsg}</div></td></tr>
	</table>
		</form>
		<br>
		
</body>

</html>