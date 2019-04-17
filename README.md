

Name: Siddharth Chauhan
Roll No:58
SAPID: 500063909
Batch:ogi batch2
Question Assigned: question 4


public class Bricks {
	public boolean checkMethod(int small, int big, int goal) {
	    if (goal <= small + big * 5 && goal >= big * 5) {
	        return true;
	    } else
	        return false;
	}

	public static void main(String args[]) {
	    Bricks brick = new Bricks();
	    System.out.println(brick.checkMethod(3, 2, 10));
	}
	  
  }
