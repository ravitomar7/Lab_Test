class lab
{
	public static void main(String[] args) 
	{
		System.out.println("we have to check whether preceeding num is greater or not");
		lab obj=new lab();
		boolean x=obj.inOrderEqual(2, 5, 11, true);
		System.out.println(x+";values:2,5,11");
		
	}
public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
 {
	if(!equalOk && a < b && b < c)
		return true;
	if (equalOk && a <= b && b <=c)
		return true;
	else
		return false;
 }
}
       
       
       
       
       
       
       
       
       
       
       
       
       
 
  
  