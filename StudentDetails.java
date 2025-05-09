package com.elc;

public class StudentDetails {
public static void main(String [] args)
{
Student stu=new Student();
stu.setStudentDetails("A.Jahnavi",10,85.7);
String res=stu.getStudentDetails();
System.out.println(res);
}
}
