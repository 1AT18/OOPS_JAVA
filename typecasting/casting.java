package com.jsp.typecasting;

class sample
{
	
}
class demo extends sample
{
	
}
class demo1 extends sample
{
	
}
public class casting 
{
	public void test(sample s)//sample s=new sample();
	{
		System.out.println("sample a ="+ s);
	}
	public void test(demo a)//demo a=new demo();
	{
		System.out.println("demo a="+ a);
	}
    public static void main(String[] args) 
    {
    	casting c1=new casting();
    	sample s=new sample();
    	demo d1=new demo();
    	demo1 d2=new demo1();
    	c1.test(s);
    	c1.test(d1);
    	c1.test(d2);
    	c1.test(d1);
	}
}
