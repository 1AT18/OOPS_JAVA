package com.jsp.account;

public class Web extends Account implements User1
{
	@Override
	public void trnsafer(double amt, int choice) {
		if(choice==1)
		{
			withdraw(amt);//send
		}
		else
		{
			deposit(amt);//receive
		}
	}
}
