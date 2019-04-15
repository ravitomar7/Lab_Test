import java.util.Scanner;

public class pattern {
	public static void main(String args[])
    {
        System.out.println("Enter value of n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();         
        int[][] a=new int[n][n];         
        int value=1;         
        int minCol=0 ;         
        int maxCol=n-1;
        int minRow=0;
        int maxRow=n-1;
        int	j;         
        for(j=0;j<=n;j++)
        {
            for(int i=minCol;i<=maxCol;i++)
            {
                a[minRow][i]=value;
                value++;
            }
            for(int i=minRow+1;i<=maxRow;i++) 
            { 
                a[i][maxCol]=value; 
                value++; 
            } 
            for(int i=maxCol-1;i>=minCol;i--)
            {
                a[maxRow][i]=value;                            
                value++;
            }
            for(int i=maxRow-1;i>=minRow+1;i--) 
            {
                a[i][minCol]=value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
         
        for (int i=0;i<a.length;i++)
        {
            for (int k=0;k<a.length;k++)
            {
                System.out.print(a[i][k]+ "\t");
            }
            System.out.println();
        }
    }
}
