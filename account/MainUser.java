package com.jsp.account;

public class MainUser {

	public static void main(String[] args) {
		Account a1=new Account("akash",4546464l,255.55);
		a1.deposit(11.2);
		Transaction t1=new Transaction();
		User1 u1=t1.createobject(1234);
		u1.trnsafer(2154.5,1);
		u1.trnsafer(354.1354,1);
		
		User1 u2=t1.createobject(1111);
		u2.trnsafer(3134.2,2);
		u2.trnsafer(14564.2,45);
	}
}
