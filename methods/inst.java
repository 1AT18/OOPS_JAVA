package com.jsp.methods;

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
	int size=10;
	public void addfilter()
	{
		System.out.println("add an filter to image");
	}
	public void crop()
	{
		System.out.println("crop an image");
	}
	public void imagesize()
	{
		System.out.println(size + "MB");
	}
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
		System.out.println("shared a photo");
	}
	@Override
	public void save()
	{
		System.out.println("save an photo");
	}
	@Override
	public void addsong()
	{
		System.out.println("edit an photo");
	}
}
class video implements post,videoedit
{
	double duration=4.0;
	public void trim()
	{
		System.out.println("trim an viideo");
	}
	public void videoduration()
	{
		System.out.println(duration + "minutes");
	}
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
		System.out.println("shared an video");
	}
	@Override
	public void save()
	{
		System.out.println("saved an video");
	}
	@Override
	public void mute()
	{
		System.out.println("mute an video");
	}
	@Override
	public void addsong()
	{
		System.out.println("add song to video");
	}
}
public class inst 
{
	public static void main(String[] args) 
	{
		photo p1=new photo();
		p1.addsong();
		p1.addfilter();
		p1.crop();
		p1.like();
		p1.comment();
		p1.share();
		p1.save();
		p1.imagesize();
		System.out.println("-----------------");
		video v1=new video();
		v1.like();
		v1.addsong();
		v1.comment();
		v1.mute();
		v1.trim();
		v1.videoduration();
		v1.share();
		v1.save();
	}
}
