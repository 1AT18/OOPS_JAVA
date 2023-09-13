package com.jsp.typecasting;

public class Casting2 
{
	
	public static void check(int a)
	{
		System.out.println(a);
	}
	public static void check(double a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		int a=10;
		float b=(int)a;
		check(6); //check for int only else search for check() with higher capacity.
		check('A'); //search for check() with equal arg2 else search for greater int
		check(1.98); //search for same
		System.out.println("--------");
		System.out.println(a); //float is greater than int
		System.out.println(b); //double is greter than long
		
	}
}
