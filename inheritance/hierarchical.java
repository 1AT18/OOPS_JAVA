package com.jsp.inheritance;

class account
{
	long acctno;
	double bal;
	String owner;
	public void deposit( double amt)
	{
		bal=bal+amt;
		System.out.println("current bal "+ bal +",deposit amount" +amt);
	}
	public void withdraw(double amt)
	{
		if(amt<bal)
		{
			bal=bal-amt;
			System.out.println("current bal= "+bal+",withdraw amount "+ amt);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}
class savings extends account
{
	final double min_bal=10000;
	public void showmin_bal()
	{
		System.out.println("show minimun balance "+min_bal);
	}
}
class current extends account
{
	double roi=0.05;
	public void calculate_roi(double bal)
	{
	bal=bal+bal*roi;
	System.out.println("after roi bal "+bal);
	}
}
public class hierarchical {

	public static void main(String[] args) 
	{
		savings s1=new savings();
		s1.showmin_bal();
		s1.deposit(100);
		s1.withdraw(99);
		current c1=new current();
		System.out.println(c1.roi);
		c1.calculate_roi(150);
	}
}
