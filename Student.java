package org.student;

import org.department.Department;

public class Student extends Department {

public void studentName() {
	System.out.println("Student name");
}

public void studentDept() {
	System.out.println("Student department");
}
public void studentId() {
	System.out.println("Student ID");
}

public static void main(String[] args) {
	Student obj = new Student();
	
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	
	obj.deptName();
	
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
}
}

