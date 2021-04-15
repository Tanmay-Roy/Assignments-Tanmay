package com.cg.bean;

public class SumSeriesExpr extends SumSeries{
	//overridding sumSeriesOfNaturalNos() method of super class
	
	public int sumSeriesOfNaturalNos(int n)
	{
		int res= (n*(n+1))/2;
		System.out.println("sum returned from sub class");
		return res;
	}

}
