<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdmissionForm</title>
</head>
<body>
<h1>${message}</h1>
<h1>STUDENT DETAILS FORM FOR COURSE</h1>
<font color="red"></h2><form:errors path="student1.*"/></font>
<form action="submission.html" method="POST">
<table>
<tr>
<td>Student name : </td> <td> <input name="StudentName" type="text"></td>
</tr>
<tr>
<td>Student Id : </td> <td> <input name="StudentID" type="text"> </td>
</tr>
<tr>
<td>Student's Mobile Number : </td> <td> <input name="StudentMobile" type="text"> </td>
</tr>
<tr>
<td>Student's DOB :  </td> <td><input name="DOB" type="text"></td>
</tr>
<tr>
<td> Student's skill : </td> <td> <select name="StudentSkills" multiple>
								<option value="Java core">Java core </option>
								<option value="Spring core">Spring core </option>
								<option value="Spring MVC">Spring MVC </option>
								</select>
</td>
</tr>
</table>
<table>
<tr><td>Student's Address hello</td></tr>
<tr>
<td>Country: <input type="text" name="Studentaddress.Country"/></td>
<td>City: <input type="text" name="Studentaddress.City"/></td>
<td>Street: <input type="text" name="Studentaddress.Street"/></td>
<td>PinCode: <input type="text" name="Studentaddress.pincode"/></td>
</tr>
</table>
<td> <input type="submit" value="submit the form"> </td>

</form>
</body>
</html>