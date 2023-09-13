package com.jsp.encapsualtion;

public class Accountt 
{
	private double bal=0.0;
	private String name;
	public Accountt(String name)
	{
		this.name=name;
	}
	public double getbal()
	{
		return bal;
	}
	public void setbal(double bal)
	{
		this.bal=bal;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
}
