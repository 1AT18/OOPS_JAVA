package com.jsp.account;

public class Atm2 extends Account implements User1
{
	@Override
	public void trnsafer(double amt, int choice) 
	{
		if(choice==1)
	{
		deposit(amt);
	}
	else
	{
		withdraw(amt);
	}
	}
}
