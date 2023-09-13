package com.jsp.inheritance;

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
	final double min_bal=5000;
	public currentt(String owner,long accno,double bal)
	{
		super(owner,accno,bal);
	}
	public void showmin_bal()
	{
		System.out.println(min_bal);
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
	
public class accountchaining 
{

	public static void main(String[] args) 
	{
		saving s1=new saving("akash",53434l,1.2);
		s1.showdetails();
		currentt c1=new currentt("kii",54545l,5.5);
		c1.showmin_bal();
		c1.deposit(2355);
		c1.withdraw(2366);
		s1.calculateroi();
	}
}