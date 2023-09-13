package com.jsp.abstraction;

interface Swiggy
{
	public void order();
}
class Veg implements Swiggy
{
	@Override
	public void order()
	{
		System.out.println("order veg");
	}
}
class Nonveg implements Swiggy
{
	@Override
	public void order()
	{
		System.out.println("order NoN veg");
	}
}
class service
{
	Swiggy s1;
	public Swiggy createobject(String colour)
	{
		if(colour=="green")
		{
			s1=new Veg();
			return s1;
		}
		else
		{
			s1=new Nonveg();
			return s1;
		}
	}
}
public class SwiGGy 
{
	public static void main(String[] args) 
	{
		service v1=new service();
		Swiggy s1=v1.createobject("green");
		s1.order();
		System.out.println("---------------");
		Swiggy s2=v1.createobject("red");
		s2.order();
	}
}
