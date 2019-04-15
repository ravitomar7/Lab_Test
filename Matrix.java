import java.util.Scanner;


public class Matrix {
	public static void main(String args[])
    {
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] a=new int[n][n];
		int b=1,c=0,d=n-1,e=n-1,f=0,g;
		/* b= value     
		 * c=Minnimum value of columns
		 * d=Maximum value of column
		 * e=Maximum value of row
		 * f=Minimum value of row*/ 
		
		for(g=0;g<=n;g++)
		{
			for (int i=c;i<=d;i++)
			{
				a[f][i]=b;
				b++;
			}
			for (int i=f+1;i<=e;i++) 
			{ 
				a[i][d]=b; 
				b++; 
			} 
			for (int i=d-1;i>=c;i--)
			{
				a[e][i]=b;
				b++;
			}
			for (int i=e-1;i>=f+1;i--) 
			{
				a[i][c]=b;
				b++;
			}
			c++;f++;d--;e--;
		}
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
    }
}
