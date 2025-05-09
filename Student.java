package com.elc;
public class Student{
private String name;
private int rollNumber;
private double percentage;

	public void setStudentDetails(String nm , int rollNo , double perc) {
	name=nm;
	rollNumber=rollNo;
	percentage=perc;
}
	public String getStudentDetails()
{
		return "Student name:" +name +"\n Student rollNumber:" +rollNumber +"\n student percentage:" +percentage;
		
}
}