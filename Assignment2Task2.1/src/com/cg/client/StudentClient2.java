package com.cg.client;

import java.util.List;
import java.util.Scanner;

import com.cg.beans.Student;
import com.cg.beans.StudentService;

public class StudentClient2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the branch: ");
		String branch=sc.next();
		StudentService ser= new StudentService();
		List<Student> list = ser.findStudent(branch, 2);
		for (Student stu: list)
		{
			System.out.println(stu.getStudentId()+ " "+stu.getStuName()+ " "+stu.getMarks()+" "+stu.getBranch());
		}
		
	}

}
