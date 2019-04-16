import java.util.*;
class first
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;boolean equals=false,res;
System.out.println("enter value of a");
a=sc.nextInt();
System.out.println("enter value of b");
b=sc.nextInt();
System.out.println("enter value of c");
c=sc.nextInt();
if(a==b||a==c||b==c)
equals=true;
res=inOrder(a,b,c,equals);
System.out.println(res);
}
public static boolean inOrder(int a,int b,int c,boolean equals)
{
if(equals)
return a <= b && b <= c;
return a < b && b < c;
}
}