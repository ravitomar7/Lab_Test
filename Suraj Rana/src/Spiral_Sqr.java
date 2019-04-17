import java.util.Scanner;

public class Spiral_Sqr {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the size of square");
		int n = sc.nextInt();
		int counter = 0;
		int[][] arr = new int[n][n];

		int i,j,k;
		
	    for(i=n-1, j=0; i>0; i--, j++)
	    {
	        //1st row
	        for(k=j; k<i; k++) 
	        	arr[j][k] = ++counter;
	        // last column
	        for(k=j; k<i; k++) 
	        	 arr[k][i] = ++counter;
	        
	        for(k=i; k>j; k--) 
	        	arr[i][k] = ++counter;
	       
	        for(k=i; k>j; k--) 
	        	 arr[k][j] = ++counter;
	 
	    }
	    
	     int mid = (n-1)/2;
	     if (n% 2 == 1) System.out.print( arr[mid][mid]);
	     System.out.println();
	     System.out.println("Spiral Square:");
	     for(int  p = 0 ; p  < n ; p++) {
	    	 for(int q = 0; q < n; q++) {
	    		 
	    		 System.out.print(arr[p][q]+"\t");
	    	 }
	    	 
	    	 System.out.println();
	     }

	}

}