package com.cg.bean;

public class Onroll extends Emp{

	private double pf;
	private double da;
	public Onroll(int empId, String empName, double sal) {
		super(empId, empName, sal);
		// TODO Auto-generated constructor stub
		this.pf=this.getSal()*0.12;
		this.da=this.getSal()*0.4;
	}
	
	public double calSalary()
	{
		return this.getSal()+da-pf;
	}
	
	
	public void display()
	{
		super.display();
		String emptype=getClass().getSimpleName();
		System.out.printf("%10.2f%10.2f%10s%10.2f%10s\n",da,pf,"--",calSalary(),emptype);
	}
}
