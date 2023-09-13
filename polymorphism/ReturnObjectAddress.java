package com.jsp.polymorphism;

public class ReturnObjectAddress 
{
	public ReturnObjectAddress add(ReturnObjectAddress c)
	{
		return c;
	}
	public static void main(String[] args) 
	{
		ReturnObjectAddress r1=new ReturnObjectAddress();
		System.out.println(r1.add(r1));
		ReturnObjectAddress r2=r1.add(r1);
		System.out.println(r2);
	}
}
