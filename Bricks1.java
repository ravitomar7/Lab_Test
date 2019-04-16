package bao;

public class Bricks1 {

	/**
	 * @param args
	 */
	public boolean makeBricks(int small, int big, int goal)

	 {

	 	int no_of_fives = goal/5;

	 	if( no_of_fives<= big)

	 		goal -= no_of_fives*5;

	 	else

	 		goal -= big*5;

	 	if(goal <= small)

	 		return true;
	 	return false;

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bricks1 obj= new Bricks1();
		System.out.println((obj.makeBricks(1,5,8)));
		
}
}