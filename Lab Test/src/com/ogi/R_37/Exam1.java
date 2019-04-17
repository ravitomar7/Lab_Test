package com.ogi.R_37;
import java.util.Scanner;
public class Exam1 
{
	static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if (!equalOk && a < b && b < c)
		    return true;
		  if (equalOk && a <= b && b <= c)
		    return true;
		  else
		    return false;
		}

	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		char ch;
		String ar;
		boolean equalOk;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		System.out.println("equal ok is true?-y/n");
		ar=obj.next();
		ch=ar.charAt(0);
		if(ch=='y'||ch=='Y')
			equalOk=true;
		else
			equalOk=false;
		System.out.println(inOrderEqual(a,b,c,equalOk));
		
}
}