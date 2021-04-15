package Com.cg.client;

import Com.cg.bean.Emp;

public class EmpClient 
{
	public static void main(String[] args)
	{
		
	Emp emp=new Emp();
	try {
		emp.setName("rama");
		emp.setAge(24);
		emp.setSal(6000);
		System.out.println("Name "+emp.getName());
		System.out.println("age "+emp.getAge());
		System.out.println("Salary "+emp.getSal());
		System.out.println("DA "+emp.getDa());
		System.out.println("PF "+emp.getPf());
		System.out.println("Net Salary "+emp.getNetSal());
	}
	catch(Exception e){
		System.out.println(e.getMessage());	
	}
	}
}
