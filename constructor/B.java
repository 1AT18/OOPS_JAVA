package com.jsp.constructor;

public class B 
{
	public B(String s1)
	{
		System.out.println("B() zero arg constructor");
	}
	public static void main(String[] args) 
	{
		new B("ABC");
	}
}
