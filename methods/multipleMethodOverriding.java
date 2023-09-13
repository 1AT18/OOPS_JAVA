package com.jsp.methods;

class whatsapp1
{
	public void deliveryreport()
	{
		System.out.println("single tick");
	}
}
class whatsapp2 extends whatsapp1
{
	@Override
	public void deliveryreport()
	{
		super.deliveryreport();
		System.out.println("double tick");
    }
 }
class whatsapp3 extends whatsapp2
{
	@Override
	public void deliveryreport()
	{
		super.deliveryreport();
		System.out.println("blue tick");
	}
}
public class multipleMethodOverriding 
{
	public static void main(String[] args) 
	{
		whatsapp3 v3=new whatsapp3();
		v3.deliveryreport();
	}
}