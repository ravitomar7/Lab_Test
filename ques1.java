public class ques1 {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		if(equalOk)
			return (a <= b && b <= c);
		return (a < b && b < c);
	}
	public static void main(String[] args) {
		ques1 obj=new ques1();
		boolean a=obj.inOrderEqual(3,4,1,true);
		System.out.println(a);

	}
}

