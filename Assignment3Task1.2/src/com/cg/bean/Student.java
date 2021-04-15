package com.cg.bean;

public class Student {
	
	private int stuId;
	private String stuName;
	private int score;
	private String stuStream;
	public Student(int stuId, String stuName, int score, String stuStream) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
		this.stuStream = stuStream;
	}
	
	
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collected the student "+stuId);
	}

}
