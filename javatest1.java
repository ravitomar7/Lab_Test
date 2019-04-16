public class test2 {
	public static boolean makeBricks(int small, int big, int goal) {

	    int totalInches = small + big*5;
	    if(totalInches < goal){
	        return false;
	    }

	    int bigInches= big*5;
	    int smallRequired = goal %5;

	    if(smallRequired > small && bigInches != goal){
	        return false;
	    }else if(smallRequired <=small){
	        if( bigInches >= goal || smallRequired + bigInches == goal || small +bigInches ==goal 
	                || small+ bigInches == goal){
	            return true;
	        }if(bigInches + small > goal){
	            if(small > goal-bigInches){
	                return true;
	            }
	        }

	    }
	    return false;
	}

}









public class testing extends test2
{
	public static void main(String args[])
			{
             
        System.out.println(test2.makeBricks(4,5,6));
		
			}
	

}

