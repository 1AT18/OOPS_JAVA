package com.jsp.aabstract;

abstract class sample1
{
	public void test1() //non static concrete method
	{
		System.out.println("hello non static");
	}
	public static void test2()  //static concrete of abstract class
	{
		System.out.println("hello static");
	}
	public abstract void test3();
}
class demo2 extends sample1
{
	@Override
	public void test3()
	{
		System.out.println("abstract overridden");
	}
}
public class absconcrete 
{
	public static void main(String[] args) 
	{
		demo2 n1=new demo2();
		n1.test1();
		sample1.test2();
		n1.test3();
	}
}
