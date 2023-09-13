package com.jsp.sns;

public class Nonstaticblock 
{
	{
		System.out.println("hello of nonstaticblock");
	}
	public Nonstaticblock()
	{
		System.out.println("zero arg constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("java");
		new Nonstaticblock();	
	}
}
