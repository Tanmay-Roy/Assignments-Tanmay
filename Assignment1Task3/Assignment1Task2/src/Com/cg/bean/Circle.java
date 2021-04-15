package Com.cg.bean;

public class Circle {
	public double radius; 

	public Circle() {
		
	}
	
	public double calcPerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public double calcArea()
	{
		return Math.PI*radius*radius;
	}
	
}
