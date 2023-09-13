package com.jsp.abstraction;

interface user
{
	public void transfer();
}
class atm implements user
{
	@Override
	public void transfer()
	{
		System.out.println("transfer of atm");
	}
}
class web implements user
{
	@Override
	public void transfer()
	{
		System.out.println("transfer of web");
	}
}
class transaction
{
	user u1;
	public user createobject(int pin)
	{
		if(pin==123)
		{
			u1=new atm();
			System.out.println("object of atm is created");
			return u1;
		}
		else
		{
			u1=new web();
			System.out.println("object of web is created");
			return u1;
		}
	}
}
public class userr 
{
	public static void main(String[] args) 
	{
		transaction t1=new transaction();
		user u1=t1.createobject(123);
		u1.transfer();
		user u2=t1.createobject(1545);
		u2.transfer();
	}
}
