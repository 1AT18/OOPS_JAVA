package com.jsp.accesspecifier1;

import com.jsp.accesspecifier.*;

public class main1 
{

	public static void main(String[] args) 
	{
		simple s1 = new simple();
		s1.test1();// only public can be accessed
		//s1.test2();// protected not accessed
		//s1.test3();// pkg-level not accessed
		//s1.test4();// private not be accessed
	}
}
