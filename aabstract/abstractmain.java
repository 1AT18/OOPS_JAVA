package com.jsp.aabstract;

 abstract class demo1
{
	public abstract void test();
}
class link extends demo1
{
	@Override
	public void test()
	{
		System.out.println("kljdsfj");
	}
}
public class abstractmain 
{

	public static void main(String[] args) 
	{
		link l1=new link();
		System.out.println(l1);// address of method
		l1.test();
	}
}
