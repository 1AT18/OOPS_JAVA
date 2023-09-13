package com.jsp.typecasting;

class samplee
{
	public void test()
	{
		System.out.println("hello");
	}
}
class demoo extends samplee
{
	public void test2()
	{
		System.out.println("good");
	}
}
public class CastException 
{
	public static void main(String[] args) 
	{
		demoo d=new demoo();
		samplee s1=d;
		s1.test();
//		s1.test2(); //class cast exception
	}
}
