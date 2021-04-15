package com.cg.bean;

public class SumSeries {
	
	public int sumSeriesOfNaturalNos(int n)
	{
		int sum=0;
		for (int i=1;i<=n;++i)
			sum=sum+i;
		System.out.println("sum returned from super class");
		return sum;
	}

}
