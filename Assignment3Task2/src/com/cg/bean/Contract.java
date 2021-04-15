package com.cg.bean;

public class Contract extends Emp {

	private int days;

	public Contract(int empId, String empName, double sal,int days) {
		super(empId, empName, sal);
		// TODO Auto-generated constructor stub
		this.days=days;
	}
	
	//override
	
	public double calSalary()
	{
		return this.getSal()*days;
	}
	
	public void display()
	{
		
		super.display();
		String emptype=getClass().getSimpleName();
		System.out.printf("%10s%10s%10d%10.2f%10s\n","--","--",days,calSalary(),emptype);
	}
	
}
