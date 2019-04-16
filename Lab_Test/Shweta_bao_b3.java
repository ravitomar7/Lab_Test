package Java_Test;
	public class Equality {

		public boolean inOrderEqual(int a,int b, int c, boolean equalOK){
			if(equalOK == true){ //equality is allowed		
			if(b>=a){
				if(c>=b){
					
					//System.out.println("True case");
					return true;
				}
			}
			}
			else{ //equality is not allowed		
				if(b>a){
					if(c>b){
						return true;
					}
				}
				}
			return false;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Equality e1 = new Equality();
		System.out.println(e1.inOrderEqual(9,9,18,true));
			}
		}
