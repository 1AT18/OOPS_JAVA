package com.jsp.constructor1;

public class constructoroverloading 
{
	public constructoroverloading() 
	{
		System.out.println();
	}
	public constructoroverloading(int a)
	{
		System.out.println("sample int");
	}
	public constructoroverloading(double b)
	{
		System.out.println("sample double");
	}
	public constructoroverloading(int a,double b)
	{
		System.out.println("sample int,double");
	}
	public constructoroverloading(double a, int b)
	{
		System.out.println("sample double,int");
	}
	public static void main(String[] args) 
	{
		new constructoroverloading(1);
		new constructoroverloading(2.2);
		new constructoroverloading(1,1.2);
		new constructoroverloading(1.2,1);
	}
}
