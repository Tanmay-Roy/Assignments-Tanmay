package com.cg.bean;

public class Sales {
	
	private String name;
	private double samt;
	public static double tot;
	public static int count;
	public Sales(String name, double samt) {
		super();
		this.name = name;
		this.samt = samt;
		this.name=this.name.toUpperCase();
		++count;
		tot=tot+this.samt;
	}
	
	

}
