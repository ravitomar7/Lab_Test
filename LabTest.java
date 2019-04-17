
public class LabTest {
	public static void main(String[] args) {

	       System.out.println(makeBricks(10,0,10));
	   }
	public static boolean makeBricks(int small, int big, int goal) {

		 if ((small + big * 5) >= goal) {

		  if (goal % 5 <= small) {

		    return true;

		    }
		  }

		 return false;

		}

}
