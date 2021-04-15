package com.cg.client;

import java.util.Scanner;

import com.cg.bean.Student;

public class FinalizeDemo {
	
	public static void main(String[] args) {
		
		Student stu1= new Student(1001,"rama",78,"ece");
		Student stu2= new Student(1002,"peter",98,"ece");
		Student stu3= new Student(1003,"akbar",88,"eee");
		stu2=null;
		stu3=null;
		System.gc();
		System.out.println("press any key to quit");
		new Scanner(System.in).next();//to take next input
	}

}
