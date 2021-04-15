package com.cg.client;


import java.util.*;

import com.cg.bean.Contract;
import com.cg.bean.Emp;
import com.cg.bean.Onroll;

public class EmpClient {
	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		list.add(new Onroll(1001,"ram",230000));
		list.add(new Onroll(1002,"vikas",430000));
		list.add(new Contract(1003,"anil",3000,20));
		list.add(new Contract(1004,"samuel",6000,10));
		generateReport(list);
	}

	public static void generateReport(List<Emp> list)
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%15s%10s%10s%10s%10s%10s%10s\n","EID","ENAME","SAL","DA","PF","DAYS","NSAL","ETYPE");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for (Emp emp:list)
		{
			emp.display();
		}
	}
}
