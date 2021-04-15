package Com.cg.util;

public class Util {
	
	public static final double HUNDRED=100.0;
    
	public static double round2Dec(double num)
	{
		double res=Math.round(num*HUNDRED)/HUNDRED;
		return res;
	}
	
}
