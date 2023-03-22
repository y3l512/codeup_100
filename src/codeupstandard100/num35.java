package codeupstandard100;
import java.util.Scanner;

public class num35 {

	  public static void main(String[] args)

	  {
	      int a;
	      String c;
	      String b;
	      Scanner sn = new Scanner(System.in);
	      b=sn.nextLine();
	      a = Integer.valueOf(b,16);
	      c = Integer.toOctalString(a);
	      sn.close();
	      System.out.println(c);
	      
	      
	      
	  }
	    
}
