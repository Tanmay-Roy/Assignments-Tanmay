package com.cg.client;

import com.cg.bean.Sales;

public class SalesClient {
	public static void main(String[] args) {
		
		Sales s1=new Sales("ram",20000);
		Sales s2=new Sales("tom",30000);
		Sales s3=new Sales("sam",10000);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Count = "+Sales.count);
		System.out.println("Total Sales = "+Sales.tot);
	}

}
