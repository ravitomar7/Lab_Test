import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number of size of square");
		int n = sc.nextInt();
		int count = 0;
		int[][] arr = new int[n][n];

		int i,j,k;
		
	    for(i=n-1, j=0; i>0; i--, j++)
	    {
	        
	        for(k=j; k<i; k++) 
	        	arr[j][k] = ++count;
	        
	        for(k=j; k<i; k++) 
	        	 arr[k][i] = ++count;
	        
	        for(k=i; k>j; k--) 
	        	arr[i][k] = ++count;
	       
	        for(k=i; k>j; k--) 
	        	 arr[k][j] = ++count;
	 
	    }
	    
	     int middle = (n-1)/2;
	     if (n% 2 == 1) System.out.print( arr[middle][middle]);
	     System.out.println();
	     
	     for(int  p = 0 ; p  < n ; p++) {
	    	 for(int q = 0; q < n; q++) {
	    		 
	    		 System.out.print(arr[p][q]+"\t");
	    	 }
	    	 
	    	 System.out.println();
	     }

	}

}
