<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submission success</title>
</head>
<body>
<p>
<h1>${message}</h1>

<h3>Congratualations!! The form details has been successfully processed </h3>

<h2>Details submitted by you :</h2>

<table>
<tr>
  <td>Student's name :</td>
  <td>${student1.getStudentName()}</td>
</tr>
<tr>
 <td>Student's Id :</td>
 <td>${student1.getStudentID()}</td>
</tr>
<tr>
 <td>Student's Mobile Number :</td>
 <td>${student1.getStudentMobile()}</td>
</tr>
<tr>
 <td>Student's DOB :</td>
 <td>${student1.getDOB()}</td>
</tr>
<tr>
 <td>Student's Skill :</td>
 <td>${student1.getStudentSkills()}</td>
</tr>
<tr>
<td>Student's Address :</td>
<td>Country:	${student1.getAddress().getCountry()}
	Street:		${student1.getAddress().getStreet()}
	City:		${student1.getAddress().getCity()}
	PinCode:	${student1.getAddress().getPincode()}</td>
</tr>
</table>
</p>
</body>
</html>