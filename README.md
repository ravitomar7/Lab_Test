# Lab-Test

> x Questions will be given on the day of the test.

> Pick question according to your roll number: 
  for e.g if x=4 and last three digit of your roll no are 123 then your question no is (1+2+3)%4 + 1 = 3
  
# Pull this repository and Fill in the blanks in Readme File alongwith:

Name: Srajan Sahu
Roll No:62
SAPID: 500064071
Batch: batch b2
Question Assigned: ouestion 1 


import java.util.Scanner;

public class MainClass
{
	public static void main(String args[])
    {
		System.out.println("Enter The Value For N :");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] spiral = new int[n][n];

		int value = 1;

		int minCol = 0;

		int maxCol = n-1;

		int minRow = 0;

		int maxRow = n-1;

		while (value <= n*n)
		{
			for (int i = minCol; i <= maxCol; i++)
			{
				spiral[minRow][i] = value;

				value++;
			}

			for (int i = minRow+1; i <= maxRow; i++)
			{
				spiral[i][maxCol] = value;

				value++;
			}

			for (int i = maxCol-1; i >= minCol; i--)
			{
				spiral[maxRow][i] = value;

				value++;
			}

			for (int i = maxRow-1; i >= minRow+1; i--)
			{
				spiral[i][minCol] = value;

				value++;
			}

			minCol++;

			minRow++;

			maxCol--;

			maxRow--;
		}

		for (int i = 0; i < spiral.length; i++)
		{
			for (int j = 0; j < spiral.length; j++)
			{
				System.out.print(spiral[i][j]+ "\t");
			}

			System.out.println();
		}
    }
}






