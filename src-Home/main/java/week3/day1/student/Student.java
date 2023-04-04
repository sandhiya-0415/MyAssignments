package week3.day1.student;

import week3.day1.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Name:Sandhiya");

	}

	public void studentDept() {
		System.out.println("Dept:CSE");
	}

	public void studentId() {
		System.out.println("08CS80");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.CollegeName();
		s.collegeRank();
		s.collegeCode();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}
}
