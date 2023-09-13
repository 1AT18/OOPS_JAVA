package com.jsp.Iface;

interface jii
{
	public static void t1()
	{
		System.out.println("static concrete of interface");
	}
	public default void t2()
	{
		System.out.println("non ststic concrete of interface");
	}
	public void t3();
}
class juu implements jii
{
	@Override
	
	public void t3()
	{
		System.out.println("non static overriden");
	}
}
public class Int3 
{

	public static void main(String[] args) 
	{
		jii.t1();
		juu B1=new juu();
		B1.t2();
		B1.t3();
	}
}
