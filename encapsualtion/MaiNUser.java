package com.jsp.encapsualtion;

public class MaiNUser 
{
	public static void main(String[] args) 
	{
		Accountt a3=new Accountt("Akash");
		Service s1=new Service();
		s1.deposit(1223.0, a3);
		s1.checkbal(a3);
		s1.withdraw(1000.0, a3);
		s1.checkbal(a3);
	}
}
