package com.jsp.inheritance;
class amazon
{
	public void order()
	{
		System.out.println("order placed succesfully");
	}
}
class mobiles extends amazon
{
	public void mobile()
	{
		System.out.println("show brands");
	}
}
class mobilebrand extends mobiles
{
	public void iphone()
	{
		System.out.println("place the iphone");
	}
	public void oneplus()
	{
		System.out.println("place the oneplus");
	}
}
class electronics extends amazon
{
	public void camera()
	{
		System.out.println("cannon camera");
	}
	public void oven()
	{
		System.out.println("sony oven");
	}
	public void laptop()
	{
		System.out.println("MacBook");
	}
}
class movies extends amazon
{
	public void language()
	{
		System.out.println("kannada");
	}
	public void type()
	{
		System.out.println("action movies");
	}
}
class fashion extends amazon
{
	public void men()
	{
		System.out.println("casuals");
	}
	public void women()
	{
		System.out.println("skirts");
	}
	public void kids()
	{
		System.out.println("sweters");
	}
}
public class hybrid {

	public static void main(String[] args) 
	{
		mobiles m1=new mobiles();
		m1.mobile();
		mobilebrand m2=new mobilebrand();
		m2.iphone();
		m2.order();

	}

}
