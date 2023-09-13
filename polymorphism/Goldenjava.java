package com.jsp.polymorphism;

class AA
{
	public void print()
	{
		System.out.println("GOODDD");
	}
}
class BB extends AA
{
	public void print()
	{
		System.out.println("BADDD");
	}
}
public class Goldenjava 
{
	public static void main(String[] args) 
	{
		AA a1=new BB();//BADDD
		a1.print();   // we get output as "BADDD" the method is overriden in subclass although upcasted reference variable 
		              //we can access only superclass properties.
	}
}
