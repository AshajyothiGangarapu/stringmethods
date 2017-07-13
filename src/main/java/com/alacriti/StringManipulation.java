package com.alacriti;

public class StringManipulation {
	public void concat(String s1,String s2)
	{
		String s3=s1.concat(s2);
		System.out.println(s3);
	}
	public void startWith(String s1){
		boolean y=s1.startsWith("hello");
		if(y)
		{
			System.out.println("entered text starts with hello");
		}
		else
			System.out.println("entered text does not starts with hello");
	}
	public void replace(String s1)
		{
			String s2=s1.replace("hello");
		}

}
