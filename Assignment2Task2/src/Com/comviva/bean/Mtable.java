package Com.comviva.bean;

public class Mtable {
	private int num;
	
	public Mtable(int num) throws Exception
	{
		super();
		if (num<=0)
			throw new Exception("number must be greater than zero");
		this.num=num;
	}
	
	public void display()
	{
		for (int i=1;i<=10;++i)
			System.out.println(i+"* "+num+" ="+(num*i));
	}
	
	public void display(int rows)
	{
		for (int i=1;i<=rows;++i)
		    System.out.println(i+"* "+num+" ="+(num*i));   	
	}
	
	public void display(int start,int end)
	{
		for (int i=start;i<=end;++i) 
			System.out.println(i+"* "+num+" ="+(num*i));
	}
}
