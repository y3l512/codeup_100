package codeupstandard100;
import java.util.*;
import java.lang.Integer;
public class num32 {
    public static void main(String[] args){
        int a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        String hex = Integer.toHexString(a);
        System.out.println(hex);
    }
    
}
