Name: Sarika Gangwar
Roll No:35
SAPID: 500063329
Batch:2
Question Assigned: 1

PROGRAM-

package com.rt;
class Exercise 
{ 
      static int HIGH = 100; 
      static void run(int x, int y, int arr[][])
       { 
         int val = 1; 
        int p = 0, q = 0; 
        while (p < x && q < y) 
          { 
           for (int i = q; i < y; ++i) 
                { 
                    arr[p][i] = val++; 
                } 
                    p++; 
            for (int i = p; i < x; ++i) 
                { 
                    arr[i][y - 1] = val++; 
                } 
                    y--; 
            if (p < x) 
            { 
                    for (int i = y - 1; i >= q; --i) 
                { 
                    arr[x - 1][i] = val++; 
                } 
                    x--; 
            } 
            if (q < y) 
            { 
                for (int i = x - 1; i >= p; --i) 
                { 
                    arr[i][q] = val++; 
                } 
                q++; 
            } 
          } 
       } 
   public static void main(String args[]) 
    { 
        int x = 4, y = 4; 
        int arr[][] = new int[HIGH][HIGH]; 
        run(x, y, arr); 
        for (int i = 0; i < x; i++) 
        { 
            for (int j = 0; j < y; j++) 
            { 
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(""); 
        } 
    } 
} 
