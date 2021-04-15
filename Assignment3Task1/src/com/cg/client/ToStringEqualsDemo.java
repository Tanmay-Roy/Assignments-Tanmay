package com.cg.client;

import com.cg.bean.Student;

public class ToStringEqualsDemo {
	public static void main(String[] args) {
		
		Student stu1= new Student(1001,"ram",98);
		Student stu2= new Student(1001,"ram",98);
		
		System.out.println("Student 1: "+stu1);
		System.out.println("Student 2: "+stu2);
	}

}
