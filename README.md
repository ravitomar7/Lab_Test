# Lab-Test



Name: Shivani Agarwal
Roll No:38
SAPID: 500059977
Batch:2
Question Assigned: 4

package com.ogi.rollno_38;
import java.util.Scanner;
public class Anagrams
{
    public static void main(String args[])
    {
        String st1, st2;
        int l, lst1, lst2, i, j, get=0, not_get=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string to check for anagram :");
        st1 = sc.nextLine();
        System.out.print("Enter second string to check for anagram :");
        st2 = sc.nextLine();
        
        lst1 = st1.length();
        lst2 = st2.length();
		
        if(lst1 == lst2)
        {
            l = lst1;
            for(i=0; i<l; i++)
            {
                get = 0;
                for(j=0; j<l; j++)
                {
                    if(st1.charAt(i) == st2.charAt(j))
                    {
                        get = 1;
                        break;
                    }
                }
                if(get == 0)
                {
                    not_get = 1;
                    break;
                }
            }
            if(!(not_get == 1))
            {
                System.out.println("Strings are Anagram");
            }
            else
            {
                System.out.println("Strings are not Anagram to each other");
            }
        }
        else
        {
            System.out.println("Both Strings Must have the same number of Character and length should be equal to be an Anagram");
        }
    }
}









