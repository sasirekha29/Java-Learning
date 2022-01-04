package com.learn.SpringMVCFORM;

import java.util.ArrayList;
import java.util.Date;

public class Student {
private String StudentName;
private String StudentID;
private Long StudentMobile;
private Date DOB;
private ArrayList<String> StudentSkills; 
private Address Studentaddress;
public Address getStudentaddress() {
	return Studentaddress;
}
public void setStudentaddress(Address studentaddress) {
	Studentaddress = studentaddress;
}
public Long getStudentMobile() {
	return StudentMobile;
}
public void setStudentMobile(Long studentMobile) {
	StudentMobile = studentMobile;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public ArrayList<String> getStudentSkills() {
	return StudentSkills;
}
public void setStudentSkills(ArrayList<String> studentSkills) {
	StudentSkills = studentSkills;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String StudentName) {
	this.StudentName = StudentName;
}
public String getStudentID() {
	return StudentID;
}
public void setStudentID(String StudentID) {
	this.StudentID = StudentID;
}

}
