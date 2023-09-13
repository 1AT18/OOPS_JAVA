package com.jsp.inheritance;

class whatsappv1
{
	public void sendmsg()
	{
		System.out.println("sendmsg");
	}
}
class whatsappv2 extends whatsappv1
{
	public void voicemsg()
	{
		System.out.println("voicemsg");
	}
}
class whatsappv3 extends whatsappv2
{
	public void videocall()
	{
		System.out.println("videocall");
	}
}
public class multilevel 
{
     public static void main(String[] args) 
     {
    	 whatsappv3 w1=new whatsappv3();
    	 w1.sendmsg();
    	 w1.videocall();
    	 w1.voicemsg();
	 }
}
