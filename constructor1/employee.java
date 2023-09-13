package com.jsp.constructor1;

public class employee 
{
	String ename;
	int eid;
	long sal;
public employee(String ename,int eid,long sal)
{
	this.ename=ename;
	this.eid=eid;
	this.sal=sal;
}
public void showempdetails()
{
	System.out.println(ename);
	System.out.println(eid);
	System.out.println(sal);
}
public void updatesal(long newsal)
{
    sal = newsal;
    System.out.println(sal);
}
	public static void main(String[] args) 
	{
		employee e1 = new employee("abc",123,203l);
		e1.showempdetails();
		employee e2 = new employee("xyz",456,120l);
		e2.showempdetails();
		e1.updatesal(1252l);
		e1.showempdetails();
	}
}


