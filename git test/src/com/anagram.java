package com;


public class anagram {
	char s1[],s2[];
public static char[] sort_array(String str)
{
	char arr[]=new char[100];
	for (int i=0;i<str.length();i++)
	{
	arr[i]=str.charAt(i);
	}
	int j=0;
	char temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(j=0;j<arr.length;j++)
		{
			if(arr[j] > arr[i])
			{
				temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	return arr;
}
public static boolean compare(String s1,String s2)
{
	char a1[]=new char[100];
	char a2[]=new char[100];
	for (int i=0;i<s1.length();i++)
	{
	a1[i]=s1.charAt(i);
	}
	for (int i=0;i<s2.length();i++)
	{
	a2[i]=s2.charAt(i);
	}
	if(a1.length != a2.length)
		return false;
	else
	{
		a1=sort_array(s1);
		a2=sort_array(s2);
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i] != a2[i])
				return false;
			
		}
		return true;
	}
}
public static void main(String args[])
{
	String s1="Keep";
	String s2="Peek";
	if(compare(s1.toLowerCase(),s2.toLowerCase()))
		System.out.println(s1+" and "+s2+" are anagrams");
	else
		System.out.println(s1+" and "+s2+" are not anagrams");
}
}
