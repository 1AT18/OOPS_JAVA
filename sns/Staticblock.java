package com.jsp.sns;

public class Staticblock 
{
		public void point(int x,int y)
		{
			System.out.println("x="+x+","+"y="+y);
		}
		protected void point(int x,double y)
		{
			System.out.println("x="+x+","+"y="+y);
		}
		static        //its first printed
		{
			System.out.println("x=");
		}
		private int point(double x,double y)
		{
			System.out.println("x="+x+","+"y="+y);
			return 1;
		}
		public static void main(String[] args) 
		{
			Staticblock n1 = new Staticblock();
			n1.point(1, 40);
			n1.point(1.2, 10.01);
			n1.point(1, 5.02);
		}
	}