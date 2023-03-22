package codeupstandard100;
import java.util.*;

public class num45 {
	public static void main(String[] args){
        int a, b, d;
        double c;
       
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        b = sn.nextInt();
        d = (int)(a/b);
        c = (double)a/b;
        System.out.printf("%d\n", a+b);
        System.out.printf("%d\n", a-b);
        System.out.printf("%d\n", a*b);
        System.out.printf("%d\n", d);
        System.out.printf("%d\n", a%b);
        System.out.printf("%.2f", c);
    }
}
