package com.cg.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	
	private static List<Student> slist=new ArrayList<>();
	
	static{
		slist.add(new Student(1001, "ram kumar", 90, "ece"));
		slist.add(new Student(1002, "ravi teja", 80, "eee"));
		slist.add(new Student(1004, "salman khan", 70, "ece"));
		slist.add(new Student(1005, "surya", 95, "eee"));
		slist.add(new Student(1003, "sharukh", 83, "ece"));
		slist.add(new Student(1006, "peter", 83, "ece"));	
	}
	
	public Student findStudent(int sid)
	{
		for (Student stu: slist)
		{
			if (stu.getStudentId()== sid)
				return stu;
		}
		return null;
	}
	
	public List<Student> findStudent(String branch)
	{
		List<Student> newList= new ArrayList<>();
		for (Student stu: slist)
		{
			if (stu.getBranch().equalsIgnoreCase(branch))
				newList.add(stu);
		}
		return newList;
	}
	
	public List<Student> findStudent(String branch,int limit)
	{
		List<Student> newList= new ArrayList<>();
		int count=1;
		for (Student stu: slist)
		{
			if (stu.getBranch().equalsIgnoreCase(branch) && count<=limit)
				newList.add(stu);
			++count;
		}
		return newList;
	}		
}