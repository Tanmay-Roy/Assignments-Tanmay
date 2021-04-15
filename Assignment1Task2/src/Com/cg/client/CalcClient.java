package Com.cg.client;

import java.util.Scanner;

import Com.cg.bean.Circle;
import Com.cg.util.Util;

public class CalcClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius=sc.nextDouble();
		Circle obj=new Circle();
		obj.radius=radius;
		double area=obj.calcArea();		
		System.out.println("the area of the circle is: "+Util.round2Dec(area));
		double perimeter=obj.calcPerimeter();
		System.out.println("the perimeter of the circle is: "+Util.round2Dec(perimeter));
	}

}
