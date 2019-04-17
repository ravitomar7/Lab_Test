

Name: Siddarth Kumar Jha
Roll No: 40
SAPID: 500062053
Batch:B2
Question Assigned: 1


# How to code?

package com.ogi;

public class A 
{
	public static void main(String[] args)
	{
		System.out.println("We will be checking the number preceding is greater or not");
		A obj=new A();   //object is created
		boolean x=obj.inOrderEqual(2, 5, 11, true);   //boolean object type and method calling
		System.out.println(x+"   -The values were 2,5,11");
		System.out.println("Aim accomplished");
		
	}
	public boolean inOrderEqual(int a,int b,int c,boolean equalOk)
	{
		if(equalOk)
		{
			return (a <= b && b <= c);	
		}
		return (a < b && b < c);   //boolean return type
	}

}







