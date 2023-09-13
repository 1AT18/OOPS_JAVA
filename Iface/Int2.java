package com.jsp.Iface;

interface run
{
	int a=10;
	public void test();
}
interface run1
{
	public void count();
}
class b
{
	public void display()
	{
		System.out.println("concrete method");
	}
}
class huu extends b implements run,run1
{
	@Override
	public void test()
	{
		System.out.println("overridden test");
	}
	@Override
	public void count()
	{
		System.out.println("overridden count");
	}
}
public class Int2 
{

	public static void main(String[] args) 
	{
		huu A1=new huu();
		A1.test();
		A1.count();
		System.out.println(A1);
		A1.display();
	}

}
