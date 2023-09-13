package com.jsp.accesspecifier;

public class maiin 
{

	public static void main(String[] args) 
	{
		simple s1 = new simple();
		s1.test1();// public
		s1.test2();// protected
		s1.test3();// pkglevel default
		//s1.test4();// its an private
	}
}
