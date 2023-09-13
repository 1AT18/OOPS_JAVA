package com.jsp.inheritance;

class atria
{
	public atria(String type)
	{
		super();
		System.out.println(type);
	}
}
class akash extends atria
{
	public akash()
	{
		super("worst");
		System.out.println("student");
	}
}
public class constructorchaining 
{
	public static void main(String[] args) 
	{
		new akash();
	}
}
