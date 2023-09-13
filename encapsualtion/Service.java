package com.jsp.encapsualtion;


public class Service 
{
	public void deposit(double amt,Accountt a1)
	{
		if(amt>0)
		{
			double b1=a1.getbal() + amt;//double b1=1000+500;
			a1.setbal(b1);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public void withdraw(double amt,Accountt a1)
	{
		if(a1.getbal()>amt)
		{
			double b2=a1.getbal()-amt;
			a1.setbal(b2);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public void checkbal(Accountt a1)
	{
		System.out.println("current bal :"+a1.getbal());
	}
}
