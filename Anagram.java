import java.util.Arrays;  
   
public class Anagram 
{  
    	static void isAnagram(String a, String b) 
	{  
        	String x = a.replaceAll("\\s", "");  
        	String y = b.replaceAll("\\s", "");  
        	boolean status = true;  
        	if (x.length() != y.length()) 
		{  
            	status = false;  
		} 
		else 
		{  
            	char[] ArrayX = x.toLowerCase().toCharArray();  
            	char[] ArrayY = y.toLowerCase().toCharArray();  
            	Arrays.sort(ArrayX);  
            	Arrays.sort(ArrayY);  
            	status = Arrays.equals(ArrayX, ArrayY);  
        	}  
        	if (status) 
		{  
            	System.out.println(x + " and " + y + " are anagrams");  
        	} 
		else 
		{  
            	System.out.println(x + " and " + y + " are not anagrams");  
        	}  
	}  
   
	public static void main(String[] args) 
	{  
        isAnagram("abc", "cab");  
        isAnagram("game of thrones", "friends");  
	}  
}  