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