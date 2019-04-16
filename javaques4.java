package javatest;

public class javaques4
{
	public boolean makeBricks(int small, int big, int goal)
	{
		int big_brick =5*big;  
		int goal_res = goal%5;
		if ((small < goal_res) || ((small+big_brick)<goal))   // less no. of bricks than required
			return false;  
		else
			return true;
	}
	public static void main(String[] args)
	{
		javaques4 j = new javaques4();
		System.out.println(j.makeBricks(12, 20, 35));

	}

}

