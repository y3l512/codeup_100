package codeupstandard100;
import java.util.*;
import java.lang.Integer;

public class num31 {
    public static void main(String[] args){
        int a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        String oct = Integer.toOctalString(a);
        System.out.println(oct);
        
    }
}
