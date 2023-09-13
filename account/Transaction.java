package com.jsp.account;

public class Transaction 
{
	User1 u1;
		public User1 createobject(int atmpin)
		{
			if(atmpin==1234)
			{
				u1=new Atm2();
				System.out.println("object of atm");
				return u1;
			}
			else
			{
				u1=new Web();
				System.out.println("object of web");
				return u1;
			}
		}
}
