package com.jsp.methods;


class accountt
{
String owner;
long accno;
double bal;
	public accountt(String owner,long accno,double bal)
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
class currentt extends accountt
{
	double min_bal=5000;
	public currentt(String owner,long accno,double bal)
	{
		super(owner,accno,bal);
	}
	public void showmin_bal()
	{
		bal=min_bal;
		System.out.println(min_bal);
	}
	@Override
	public void withdraw(double amt)
	{
		if(bal-amt>min_bal)
		{
			bal=bal-amt;
			System.out.println(bal);
		}
		else
		{
			System.out.println("below minimum balance");
		}
	}
}
class saving extends accountt
{
	public saving(String owner,long accno,double bal)
	{
		super(owner,accno,bal);
	}
	double roi=0.05;
	public void calculateroi()
	{
		bal=bal+bal*roi;
		System.out.println(bal);
	}
}
public class AccountMO {
	

	public static void main(String[] args) 
	{
		currentt c1 =new currentt("akash",1223l,1.2);
		c1.deposit(100);
		c1.showdetails();
		c1.withdraw(20);
		
	}

}
