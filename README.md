# Lab-Test

> x Questions will be given on the day of the test.

> Pick question according to your roll number: 
  for e.g if x=4 and last three digit of your roll no are 123 then your question no is (1+2+3)%4 + 1 = 3
  
# Pull this repository and Fill in the blanks in Readme File alongwith:

Name: Rahul jain
Roll No:82
SAPID: 500062969
Batch:b3
Question Assigned: 1,2


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


Answer of question 1:
package com;
public class Javatest {
		public boolean inOrderEqual(int a,int b,int c, boolean equalOk){  
		    if(a==b && b==c){
		    	equalOk= true;
		    	return equalOk;	}
		    else{
			if(a>b && a>c)
		    	 return equalOk;
		       else if(b>a && b>c)
		    	   return false;
		       else if(c>a && c>b){
		    	   if(a>b)
		    	     return equalOk;
		    	   else{
		    		   equalOk=true;
		    		 return  equalOk; 
		    	   }
		       }
}
			return equalOk;
}
	public static void main(String[] args) {
		boolean k;
		Javatest obj = new Javatest(); 
		k= obj.inOrderEqual(5,5,7,false);
		System.out.println(k);	
	}
}


Answer of question 2:
package com;

public class Javatest2 {

	public boolean makeBricks(int small, int big, int goal)
	{
		int mg = goal/5;
		if(mg <= big)
			goal -= mg*5;
		else
			goal -= big*5;
		if(goal <= small)
			return true;
		else
		return false;
	}
	public static void main(String args[])
	{
		boolean d;
		Javatest2 b=new Javatest2();
		d=b.makeBricks(1, 5, 3);
		System.out.println(d);
	}

}





