package com.jsp.Iface;

interface hii
{
	public static void test1()
	{
		System.out.println("ststic method");
	}
	public default void test2()
	{
		System.out.println("non static method");
	}
}
interface hello
{
	public static void test1()
	{
		System.out.println("static method");
	}
	public default void test2()
	{
		System.out.println("non static method");
	}
}
class hmm implements hii,hello
{
	@Override
	public void test2()
	{
		System.out.println("non static implemented");
	}
}
public class Int4
{
    public static void main(String[] args) 
	{
    	hii.test1();
    	hello.test1();
    	hmm C1=new hmm();
    	C1.test2();
	}
}
