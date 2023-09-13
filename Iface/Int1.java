package com.jsp.Iface;

interface runn
{
	int a=10;
	public void test1();
}
class A implements runn
{
	@Override
	public void test1()
	{
		System.out.println("test of overridden");
	}
}
public class Int1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		System.out.println(runn.a);
	}

}