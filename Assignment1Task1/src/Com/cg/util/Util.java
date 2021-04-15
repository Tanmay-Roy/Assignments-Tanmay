package Com.cg.util;

public class Util {
	
	public static final byte TWO=2;
	public static final double HUNDRED=100.0;
	
	public static double round2Dec(double num)
	{
		double res=Math.round(num*HUNDRED)/HUNDRED;
		return res;
	}
	
	public static double round2Dec(double num,int round)
	{
		double power=Math.pow(10, round);
		double res=Math.round(num*power)/power;
		
		return res;
	}

}
