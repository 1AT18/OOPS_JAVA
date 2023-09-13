package com.jsp.methods;

class simple
{
	public void send()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
}
class deal extends simple
{
	@Override
	public void send()
	{
		super.send();
		for( int i=3;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
public class methodoveriding {

	public static void main(String[] args) 
	{
		deal d1=new deal();
		d1.send();
	}
}
