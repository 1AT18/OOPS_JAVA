package com.jsp.Iface;

interface post
{
	public void like();
	public void comment();
	public void share();
	public void save();
}
interface photoedit
{
	public void addsong();
}
interface videoedit
{
	public void mute();
	public void addsong();
}
class photo implements post,photoedit
{
	int size=3;
	@Override
	public void like()
	{
		System.out.println("liked your photo");
	}
	@Override
	public void comment()
	{
		System.out.println("commented on your photo");
	}
	@Override
	public void share()
	{
		System.out.println("shared a post");
	}
	@Override
	public void save()
	{
		System.out.println("saved a post");
	}
	@Override
	public void addsong()
	{
		System.out.println("add music to photo");
	}
	public void addfilter()
	{
		System.out.println("add an filter");
	}
	public void crop()
	{
		System.out.println("crop an photo");
	}
}
class video implements post,videoedit
{
	double duration=40;
	@Override
	public void like()
	{
		System.out.println("liked your video");
	}
	@Override
	public void comment()
	{
		System.out.println("commented on your video");
	}
	@Override
	public void share()
	{
		System.out.println("shared a video");
	}
	@Override
	public void save()
	{
		System.out.println("saved a video");
	}
	@Override
	public void mute()
	{
		System.out.println("mute an videp");
	}
	@Override
	public void addsong()
	{
		System.out.println("addsong to video");
	}
	public void trim()
	{
		System.out.println("trim a video");
	}
}
public class Instagram 
{
	public static void main(String[] args) 
	{
		video v1=new video();
		v1.trim();
		v1.mute();
		v1.addsong();
		v1.like();
		v1.comment();
		v1.share();
		v1.save();
		System.out.println(v1.duration);
		System.out.println("--------------------------------------");
		photo p1=new photo();
		p1.addfilter();
		p1.crop();
		p1.like();
		p1.share();
		p1.save();
		p1.comment();
		System.out.println(p1.size);
	}
}
