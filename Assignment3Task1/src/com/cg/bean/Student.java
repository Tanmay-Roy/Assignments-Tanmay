package com.cg.bean;

public class Student {
	private int stuId;
	private String sname;
	private int score;
	public Student(int stuId, String sname, int score) {
		super();
		this.stuId = stuId;
		this.sname = sname;
		this.score = score;
	}
	
	public String toString()
	{
		return (stuId+" "+ sname+ " "+score);
	}

}
