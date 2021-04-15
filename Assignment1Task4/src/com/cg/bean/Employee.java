package com.cg.bean;

public class Employee {
	
	private double basic;
	private double pf;
	private double da;
	private double totsal;
	public double getBasic() {
		return basic;
	}
	public Employee(int basic) {
		super();
		this.basic = basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public double getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public double getTotsal() {
		return totsal;
	}
	public void setTotsal(int totsal) {
		this.totsal = totsal;
	}
	
	public void printDetails()
	{
		System.out.println("Basic salary: "+basic);
		this.pf=(0.12*this.basic);
		System.out.println("PF :"+pf);
		this.da=(0.4*this.basic);
		System.out.println("DA :"+da);
		this.totsal=this.basic + this.pf +this.da;
		System.out.println("Total salary :"+this.totsal);
	}

}
