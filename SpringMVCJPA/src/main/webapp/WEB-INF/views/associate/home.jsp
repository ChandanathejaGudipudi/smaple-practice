<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resource Management</title>
         <!-- <link rel="stylesheet" href="mystyle.css"> -->
    </head>
    <style>
    body {
  padding-left: 20em;
  font-family: Georgia, "Times New Roman",
        Times, serif;
  color: purple;
  background-color: powderblue; }
ul.navbar {
  list-style-type: none;
  padding: 0;
  margin: 0;
  position: absolute;
  top: 2em;
  left: 1em;
  width: 15em }
h1 {
  font-family: Helvetica, Geneva, Arial,
        SunSans-Regular, sans-serif }
ul.navbar li {
  background: white;
  margin: 0.5em 0;
  padding: 0.3em;
  border-right: 1em solid black }
ul.navbar a {
  text-decoration: none }
a:link {
  color: blue }
a:visited {
  color: purple }
address {
  margin-top: 1em;
  padding-top: 1em;
  border-top: thin dotted }
    </style>
    
    <body>
     <h3><a href="login.html" style="float: right;" >Logout</a></h3>
        <h1>Hello ${user.fullName}!</h1>
       <p> HUB is a centralized data warehouse solution to cater to wide variety to teams and user bases. 
        This becomes a real-time tool for the operations and helps for a quick and correct reports 
        and other customer satisfaction criterion. </p>
 <br>
       
        <!-- Site navigation menu -->
		<!-- <ul class="navbar">
 		 <li><a href="index.html">Home page</a>
 		 <li><a href="musings.html">Musings</a>
 		 <li><a href="town.html">My town</a>
  		 <li><a href="links.html">Links</a>
		</ul> -->
         <c:if test="${username eq 'SPOC'}">
         <ul class="navbar">
         <li><a href="getAssociates.html">Employee Details</a>
 		 </ul>
         	<!-- <h3><a href="getAssociates.html" style="text-align: center;position: relative;text-shadow: blue;">
        	Get Details of Associates</a></h3> -->
         </c:if>
         
         <c:if test="${username eq 'PM'}">
         <ul class="navbar">
         <li><a href="getAssociates.html">Employee Details</a>
 		 <li><a href="getProjects.html">Project Details</a>
 		 <li><a href="getTOTracker.html">TO Tracker</a>
 		 </ul>
         	<!-- <h3><a href="getAssociates" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Associates</a></h3>
	        
	        <h3><a href="getProjects.html" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Projects</a></h3> -->
         </c:if>
         
         <c:if test="${username eq 'DL'}">
         <ul class="navbar">
         <li><a href="getAssociates.html">Employee Details</a>
 		 <li><a href="getProjects.html">Project Details</a>
 		 <li><a href="getTOTracker.html">TO Tracker</a>
 		 <li><a href="getBCTracker.html">Business Case Tracker</a>
 		 <li><a href="getInvoiceTracker.html">Invoice Tracker</a>
 		 <li><a href="getAssociateReports">Employee summary Report</a>
 		 <li><a href="getProjectReports">Project Details Report</a>
 		 <li><a href="getSeatingReports">Seat Details Report</a>
 		 <li><a href="getAttritionReport">Attrition Details Report</a>
 		 <li><a href="getInternalMovementsReport">Internal Movements Report</a>
 		 <li><a href="getAllocationReport">Associate Allocation Report</a>
 		  <li><a href="revenue/variance">Revenue Variance Report</a>
 		   <li><a href="revenue/valiadation">Revenue Validation Report</a>
 		    <li><a href="revenue/projection">Revenue Projection Report</a>
 		    <li><a href="processShiftAllowance">upload Associate Allowance</a>
         </ul>
         	<!-- <h3><a href="getAssociates.html" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Associates</a></h3>
	        
	        <h3><a href="getProjects.html" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Projects</a></h3>
	        
	        <h3><a href="getAssociateReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Associate Reports</a></h3>
	        
	        <h3><a href="getProjectReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Project Reports</a></h3>
	        
	        <h3><a href="getSeatingReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Seating Details</a></h3> -->
         </c:if>
         
         <c:if test="${username eq 'COO'}">
         
         <ul class="navbar">
         <li><a href="getAssociates.html">Employee Details</a>
 		 <li><a href="getProjects.html">Project Details</a>
 		 <li><a href="getTOTracker.html">TO Tracker</a>
 		 <li><a href="getAssociateReports">Employee summary Report</a>
 		 <li><a href="getProjectReports">Project Details Report</a>
 		 <li><a href="getSeatingReports">Seat Details Report</a>
 		  <li><a href="getAttritionReport">Attrition Details Report</a>
 		 <li><a href="getInternalMovementsReport">Internal Movements Report</a>
 		 <li><a href="getAllocationReport">Associate Allocation Report</a>
         </ul>
         
         	<!-- <h3><a href="getAssociates.html" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Associates</a></h3>
	        
	        <h3><a href="getProjects.html" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Details of Projects</a></h3>
	        
	        <h3><a href="getAssociateReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Associate Reports</a></h3>
	        
	        <h3><a href="getProjectReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Project Reports</a></h3>
	        
	        <h3><a href="getSeatingReports" style="text-align: center;position: relative;text-shadow: blue;">
	        Get Seating Details</a></h3> -->
         </c:if>
         
        <!-- <p>Reports:</p>
        <p>Seat Summary</p> -->
    </body>
</html>
