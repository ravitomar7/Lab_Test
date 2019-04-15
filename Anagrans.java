import java.util.Arrays;
import java.util.Scanner;


public class Anagrans 
{
	public static void main(String args[]) 
	{
		  String str1;
		  String str2;
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter String1:");
	      str1=s.nextLine();
	      System.out.println("Enter String2:");
	      str2=s.nextLine();

	      if (str1.length()==str2.length()) 
	     {
	         char[] arr1 = str1.toCharArray();
	         Arrays.sort(arr1);
	     
	         char[] arr2 = str2.toCharArray();
	         Arrays.sort(arr2);
	         
	         if(Arrays.equals(arr1, arr2))
	         {
	            System.out.println("Both Strings are anagrams");
	         }
	         else 
	         {
	            System.out.println("Both Strings are not anagrams");
	         }
	      }
	      else
	      {
	    	  System.out.println("Strings are not anagram");
	      }
	 }
}
