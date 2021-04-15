package Com.cg.client;

import java.util.Scanner;

import Com.cg.bean.Calculator;
import Com.cg.util.Util;


public class CalcClient {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		double pamt=scan.nextDouble();
		System.out.println("enter the years");
		int pterm=scan.nextInt();
		System.out.println("enter the rate");
		float prate=scan.nextFloat();
		
		Calculator calc=new Calculator();
		calc.amt=pamt;
		calc.years=pterm;
		calc.rate=prate;
		
		double si=calc.calcSimple();
		double ci=calc.calcComp();
		System.out.println("Simple Interest = "+Util.round2Dec(si));
		System.out.println("Compound Interest = "+Util.round2Dec(ci));
	}

}
