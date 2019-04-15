import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	 public static void main(String args[]) 
	 {
		 Scanner st= new Scanner(System.in);
		 System.out.println("Input first String:");
		 String str=st.nextLine();
		 
		 Scanner st1= new Scanner(System.in);
		 System.out.println("Input second String:");
		 String str1=st1.nextLine();
		 
	      if (str.length() == str1.length()) 
	      {
	         char[] arr = str.toCharArray();
	         Arrays.sort(arr);
	         
	         char[] arr1 = str1.toCharArray();
	         Arrays.sort(arr1);
	         
	         if(Arrays.equals(arr,arr1))  
	         {
	            System.out.println("Given strings are anagrams");
	         } 
	         else
	         {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
	      else
	      {
	    	  System.out.println("Strings are not an anagram");
	      }
	   }

}
