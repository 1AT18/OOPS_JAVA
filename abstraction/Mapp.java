package com.jsp.abstraction;

interface map
{
	public void daymap();
	public void nightmap();
}
class twoDmap implements map
{
	@Override
	public void daymap()
	{
		System.out.println("day....two...d");
	}
	public void nightmap()
	{
		System.out.println("night...two d");
	}
}
class threeDmap implements map
{
	@Override
	public void daymap()
	{
		System.out.println("day....two...d");
	}
	public void nightmap()
	{
		System.out.println("night...two d");
	}
}
class servicee
{
	public map createobject(int dim)
	{
		if(dim==2)
		{
			map m2=new twoDmap();
			return m2;
		}
		else if(dim==3)
		{
			map m3=new threeDmap();
			return m3;
		}
		else
		{
			map m3=new threeDmap();
			return m3;
		}
	}
}
public class Mapp 
{
	public static void main(String[] args) 
	{
		servicee v1=new servicee();
		map s1=v1.createobject(2);
		s1.daymap();
		s1.nightmap();
		System.out.println("-------------");
		map s2=v1.createobject(3);
		s2.daymap();
		s2.nightmap();
	}
}
