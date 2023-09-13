package com.jsp.polymorphism;

class demo
{
	public void high(int c)
	{
		System.out.println("djsgsjddgsa");
	}
}
class real extends demo
{
	@Override
	public void high(int c)
	{
		System.out.println("bscjchsghj");
	}
}
public class Polymorphism 
{
	public static void main(String[] args) 
	{
		real r1=new real();
		demo d1=r1;
		d1.high(1);
		demo d2=(demo)d1;
		d2.high(4);
	}
}
