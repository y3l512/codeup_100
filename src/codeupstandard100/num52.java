package codeupstandard100;

import java.util.*;

public class num52{
    public static void main(String [] args){
        int a,b;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        b = sn.nextInt();
        int c;
        
        c = a!=b ? 1 : 0;
        
        System.out.printf("%d", c);
    }
}
