package com.jsp.inheritance;

class father 
{
	final int a = 10;
    public final void bike()
    {
        System.out.println("bullet");
    }
    public static void car()
    {
    	System.out.println("car");
    }
}
class son extends father
{
    public void cycle()
    {
        System.out.println("cycle");
    }
}
public class inheritance
{
    public static void main(String[] args) 
    {
        son s1 = new son();
        s1.cycle();
        s1.bike();
        father.car();
        father.car();
        System.out.println(s1.a);
    }
}

