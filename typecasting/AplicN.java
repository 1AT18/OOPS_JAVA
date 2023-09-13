package com.jsp.typecasting;

class user
{
	
}
class customer extends user
{
	public void buyproduct()
	{
		System.out.println("customer can buy product");
	}
	public void cancelproduct()
	{
		System.out.println("customer can cancel product");
	}
}
class admin extends user
{
	public void addproduct()
	{
		System.out.println("admin can add product");
	}
	public void removeproduct()
	{
		System.out.println("admin can remove product");
	}
}
class login
{
	public void loginn(user c)
//	public void loginn(Object c)
	{
		if(c instanceof customer)
		{
			customer c1=new customer();
			System.out.println("object of customer class created");
			c1.buyproduct();
			c1.cancelproduct();
		}
		else
		{
			admin a1=new admin();
			System.out.println("object of admin class created");
			a1.addproduct();
			a1.removeproduct();
		}
		
	}
}
public class AplicN 
{
	public static void main(String[] args) 
	{
		login lp=new login();
		customer c1=new customer();
		lp.loginn(c1);
		System.out.println("------------");
		admin a1=new admin();
		lp.loginn(a1);
	}
}
