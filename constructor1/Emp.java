package com.jsp.constructor1;

public class Emp 
{
	String name;
	long phono;
	String pw;
	public Emp(String name,long phono)
	{
		this.name=name;
		this.phono=phono;
	}
	public Emp(long phono,String pw)
	{
		this.phono=phono;
		this.pw=pw;
	}
	public Emp(String name,long phono,String pw)
	{
		this.name=name;
		this.phono=phono;
		this.pw=pw;
	}
	public void details()
	{
		System.out.println(name);
		System.out.println(phono);
		System.out.println(pw);
	}
	public void details1()
	{
		System.out.println(name);
		System.out.println(phono);
	}
	public void details2()
	{
		System.out.println(phono);
		System.out.println(pw);
	}
	public static void main(String[] args) 
	{
		Emp e1= new Emp("Akshatha",124578l,"ajaj@132");
		e1.details();
		Emp e2=new Emp("shastry",123456l);
		e2.details1();
		Emp e3= new Emp(125578l,"gow@123");
		e3.details2();
	}
}
