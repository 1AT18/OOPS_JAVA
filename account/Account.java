package com.jsp.account;

public class Account 
{
String owner;
long accno;
double bal;
    public Account()
    {
    	
    }
	public Account(String owner,long accno,double bal)
	{
		this.owner=owner;
		this.accno=accno;
		this.bal=bal;
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
		 else
		 {
			 System.out.println("insufficient balance");
		 }
	 }
	 public void showdetails()
	 {
		 System.out.println(owner);
		 System.out.println(accno);
		 System.out.println(bal);
	 }
}