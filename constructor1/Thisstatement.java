package com.jsp.constructor1;

public class Thisstatement 
{
	public Thisstatement()
	{
		System.out.println("zero argument");
	}
	public Thisstatement(int a)
	{
		
		this();
		System.out.println("int a");
	}
	public Thisstatement(double b)
	{
		this(1);
		System.out.println("double b");
	}
	public Thisstatement(int a,double b)
	{
		this(1.2);
		System.out.println("int a,double b");
	}
	public Thisstatement(double a,int b)
	{
		this(1,1.2);
		System.out.println("double b,int a");
	}
	public static void main(String[] args) 
	{
		new Thisstatement(1.2,1);
	}
}
