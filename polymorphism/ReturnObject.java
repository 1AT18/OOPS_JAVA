package com.jsp.polymorphism;

class A3
{
	
}
public class ReturnObject extends A3
{
	public A3 t1(A3 o)
	{
		return o;
	}
	public static void main(String[] args) 
	{
		ReturnObject r1=new ReturnObject();//object of subclass
		A3 a2=new A3();//object of superclass
		System.out.println(r1);
		A3 a=r1.t1(r1);//upcasted reference
		A3 a3=r1.t1(a2);//upcasted reference
		System.out.println(a);
		System.out.println(a3);
	}
}
