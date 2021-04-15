package com.cg.bean;

public abstract class Emp {
	
	private int empId;
	private String empName;
	private double sal;
	public Emp(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSal() {
		return sal;
	}
	
	
	public void display() {
		System.out.printf("%10d%15s%10.2f",empId,empName,sal);
	}
	
	public abstract double calSalary();

}
