package ques2;
public class ques2 {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		if(equalOk)
			return (a <= b && b <= c);
		return (a < b && b < c);
	}
	public static void main(String[] args) {
		ques2 obj=new ques2();
		boolean a=obj.inOrderEqual(3,4,1,true);
		System.out.println(a);

	}
}

