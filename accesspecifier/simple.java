package com.jsp.accesspecifier;

public class simple {
	public void test1()
	{
		System.out.println("public");
	}
	protected void test2()
	{
		System.out.println("protected");
	}
	void test3()
	{
		System.out.println("pkg-level default");
	}
	private void test4()
	{
		System.out.println("private");
	}

	public static void main(String[] args) 
	{
		simple s1 = new simple();
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
	}
}
