package com.jsp.abstraction;

interface user1
{
	public void transfer(double amt,int choice);
}
class ATM1 implements user1
{
	double bal;
	@Override
	public void transfer(double amt,int choice)
	{
		if(choice==1)
		{
			deposit(amt);
		}
		else
		{
			withdraw(amt);
		}
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println(bal);
		}
	}
}
class WEB1 implements user1
{
	double bal=10000.0;
	@Override
	public void transfer(double amt,int choice)
	{
		if(choice==1)
		{
			sendmoney(amt);
		}
	}
	public void sendmoney(double amt)
	{
		bal=bal-amt;
		System.out.println(bal);
	}
}
class transaction1
{
	user1 u1;
	public user1 createobject(int pin)
	{
	if(pin==123)
	{
		u1=new ATM1();
		System.out.println("object of atm is created");
		return u1;
	}
	else
	{
		u1=new WEB1();
		System.out.println("objec of web is created");
		return u1;
	}
	}
}
public class userr2 
{
	public static void main(String[] args) 
	{
		transaction1 t1=new transaction1();
		user u1=(user) t1.createobject(123);//User u1=new ATM();
		u1.transfer();
		u1.transfer();
		
		user u2=(user) t1.createobject(23465);
		u2.transfer();
	}
}
