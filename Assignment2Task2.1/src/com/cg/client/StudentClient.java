package com.cg.client;

import java.util.Scanner;

import com.cg.beans.Student;
import com.cg.beans.StudentService;

public class StudentClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		int sid=sc.nextInt();
		StudentService ser= new StudentService();
		Student stu= ser.findStudent(sid);
		if (stu != null)
		{
			System.out.println(stu.getStudentId()+ " "+stu.getStuName()+ " "+stu.getMarks()+ " "+stu.getBranch());
		}
		else
		{
			System.out.println("Student ID not found");
		}
		
		
	}

}
