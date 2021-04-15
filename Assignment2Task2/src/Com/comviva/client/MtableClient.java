package Com.comviva.client;

import Com.comviva.bean.Mtable;

public class MtableClient {
	public static void main(String[] args) {
		try
		{
			Mtable obj=new Mtable(5);
			obj.display();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
