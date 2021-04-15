package com.cg.client;

import com.cg.beans.Account;

public class ClientCode {
	
	public static void main(String[] args) {
		
		
		Account obj=new Account();
		System.out.println(obj.balance);
		obj.withdraw();
		obj.getBalance();
		obj.deposit();
		obj.clearPdc();
	}

}
