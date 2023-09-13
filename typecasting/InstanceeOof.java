package com.jsp.typecasting;

class samplex
{
	
}
class demon extends samplex
{
	
}
class demon1 extends samplex
{
	
}
public class InstanceeOof 
{
	public static void main(String[] args) 
	{
		samplex s1=new samplex();
		demon d1=new demon();
		demon1 d2=new demon1();
		System.out.println(s1 instanceof samplex);
		System.out.println(d1 instanceof samplex);
		System.out.println(d2 instanceof samplex);
		System.out.println("-------------------");
		System.out.println(s1 instanceof demon);
		System.out.println(s1 instanceof demon1);
		System.out.println("-------------------");
		System.out.println(d1 instanceof demon);//no relation itself
		System.out.println(d2 instanceof demon1);//no relation itself
	}
}
