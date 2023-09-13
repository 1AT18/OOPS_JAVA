package com.jsp.typecasting;

public class casting1 
{
	public static void main(String[] args) 
	{
		int a=50; //32
		double b=a; //64=32 //widening
		System.out.println(a); //50
		System.out.println(b); //50.0
		
		double a1=2.345;
		int b1=(int)a1; //323=(32)64  //narrowing
		                //casting statement syntax:(datatype)variable=value:
		System.out.println(a1);
		System.out.println(b1);
	}
}
