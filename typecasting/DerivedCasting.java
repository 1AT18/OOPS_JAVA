package com.jsp.typecasting;

class sampler
{
	public void test1()
	{
		System.out.println("hello");
	}
}
class demod extends sampler
{
	public void test2()
	{
		System.out.println("hi");
	}
}
public class DerivedCasting 
{
	public static void main(String[] args) 
	{
		demod d1=new demod();
		sampler s1=d1; //upcasting
		//by storing subclass object reference  into superclass object then(s1 is called upcasted ref)
		s1.test1();
		//downcasting
		demod d2=(demod)s1;
		d2.test1();
		d2.test2();
	}
}