ublic class Bricks {


	public boolean makeBricks(int small, int big, int goal) {
		  if (goal < 0 || big < 0 || small < 0) {
		    throw new IllegalArgumentException();
		  } else if (goal > big * 5 + small) {
		    return false;
		  } else if (goal % 5 <= small) {
		    return true;
		  } else {
		    return false;
		  }
		}

	public static void main(String[] args)
	{
		Bricks obj =new Bricks ();
				obj.makeBricks(3, 1, 8);
System.out.print(obj.makeBricks(3, 1, 8));	

	}

}