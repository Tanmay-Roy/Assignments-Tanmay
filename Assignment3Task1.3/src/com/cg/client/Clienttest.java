package com.cg.client;

import java.util.Scanner;

import com.cg.bean.SumSeries;
import com.cg.bean.SumSeriesExpr;

public class Clienttest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		SumSeries obj=new SumSeriesExpr();
		int sum=obj.sumSeriesOfNaturalNos(n);
		System.out.println("the sum of natural numbers upto n is: "+sum);
	}

}


