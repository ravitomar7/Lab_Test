# Lab-Test

> x Questions will be given on the day of the test.

> Pick question according to your roll number: 
  for e.g if x=4 and last three digit of your roll no are 123 then your question no is (1+2+3)%4 + 1 = 3
  
# Pull this repository and Fill in the blanks in Readme File alongwith:

Name: Rhitik krishnani
Roll No: 83
SAPID: 500062971
Batch: B3
Question Assigned: 3 and 4


# How to code?

* Use proper coding ethics.
* Use Package.
* Use Access Modifiers Properly.
* Different file for each class.
* Folder hierachy: 
                  src/com/bao/<your_roll_no>/<your_class.java>
                  bin/com/bao/<your_roll_no>/<your_class.class>
                  
* To do all above Code in Eclipse and commit in your own repository you pulled earlier.
* Raise a merge request(thru github webpage) to me and add screenshot of output withit.
* Request should be raised within Lab timing. i.e 

              # B4 BAO - 15 April 2019 11:30-13:30Hrs
              # B3 BAO - 16 April 2019 09:30-11:30Hrs
              # B3 OGI - 17 April 2019 09:30-11:30Hrs
              
              MAX Allowable time with marks deduction is 1 Hour.
              
All the Best!!

Q1
package pack;

public class ques1 {
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
package pack;


public class testingq1 extends ques1
{
	public static void main(String args[])
			{
             
        System.out.println(ques1.makeBricks(4,5,7));
		
			}

}
Q2
package pack;


public class ques2 {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		if(equalOk)
			return (a <= b && b <= c);
		return (a < b && b < c);
	}
	public static void main(String[] args)
	
	{
		ques2 ob = new ques2();
		boolean a=ob.inOrderEqual(7,5,19,true);
		System.out.println(a);
	}
}




