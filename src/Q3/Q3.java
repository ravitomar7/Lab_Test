package bin.q3;
import java.util.Scanner;

class Q3{
  Scanner in = new Scanner(System.in);
  Q3(){
    System.out.print("Enter three numbers(smallest to largest) and if you want
                      strict increasing or not(true/false): ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    boolean equalOk = in.nextBoolean();
    boolean fin = inOrderEqual(a,b,c,equalOk);
    System.out.println(fin);
  }
  public static void main(String[] args) {
    Q3 q = new Q3();
  }
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
    if(c>=b && b>=a && equalOk==true) return true;
    if(c>b && b>a && equalOk==false) return true;
    else return false;
  }
}
