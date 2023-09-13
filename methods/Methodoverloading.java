package com.jsp.methods;

public class Methodoverloading 
{
	public void point(int x,int y)
	{
		System.out.println("x="+x+","+"y="+y);
	}
	protected void point(int x,double y)
	{
		System.out.println("x="+x+","+"y="+y);
	}
	static void point(double x,int y)
	{
		System.out.println("x="+x+","+"y="+y);
	}
	private int point(double x,double y)
	{
		System.out.println("x="+x+","+"y="+y);
		return 1;
	}
	public static void main(String[] args) 
	{
		Methodoverloading n1 = new Methodoverloading();
		n1.point(1, 40);
		Methodoverloading.point(2.0,4);
		n1.point(1.2, 10.01);
		n1.point(1, 5.02);
	}
}
