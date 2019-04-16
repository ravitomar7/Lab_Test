import java.util.*;
class second
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int small,big,goal;boolean res;
System.out.println("enter no of small bricks");
small=sc.nextInt();
System.out.println("enter no of big bricks");
big=sc.nextInt();
System.out.println("enter GOAL");
goal=sc.nextInt();
res=makeBricks(small,big,goal);
System.out.println(res);
}
public static boolean makeBricks(int small,int big,int goal)
{
if(goal>big* 5+small)
return false;
if (goal % 5 <= small) 
{
return true;
}
 else
{
return false;
}
}
}