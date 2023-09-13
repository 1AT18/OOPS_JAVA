package com.jsp.aabstract;

 abstract class sample
{
	public abstract void test1();
	public void test2()
	{
		System.out.println("vcgkj2");
	}
	public static void test3()
	{
		System.out.println("jhjgjh3");
	}
}
 class demo extends sample
 {
	 @Override
	 public void test1()
	 {
		 System.out.println("hfhggj1");
	 }
 }
public class abstract2 
{
	public static void main(String[] args) 
	{
		demo d1=new demo();
		d1.test1();
		d1.test2();
		sample.test3();
	}
}
