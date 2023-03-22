package codeupstandard100;
import java.util.*;
import java.lang.Integer;

public class num33 {
    public static void main(String[] args){
        int a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        String hex = Integer.toHexString(a);
        String hex2;
        hex2 = hex.toUpperCase();
        System.out.println(hex2);   
    }
}
