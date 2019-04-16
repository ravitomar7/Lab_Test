package bao;

public class makebricks {
	public boolean checkMethod(int small, int big, int goal) {
		  
	if (goal < 0 || big < 0 || small < 0) {
	    throw new IllegalArgumentException();
	  } 
	else if (goal > big * 5 + small) 
	{
	    return false;
	  }
	 else if (goal % 5 <= small)
	 {
	    return true;
	  } 
	else {
	    return false;
	  }
	}


	public static void main(String args[]) {
	    makebricks brick = new makebricks();
	    System.out.println(brick.checkMethod(10, 0, 13));
	}
}
