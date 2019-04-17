
public class Function {
	
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
	    if(equalOk)
	        return a <= b && b <= c;
	          
	    return a < b && b < c;
	}
	public static void main(String[] args)
	{
	Function obj=new Function();
	obj.inOrderEqual(2,5,11, "equalOk");
	}

}
