package codeupstandard100;

import java.util.*;

public class num64{
    public static void main(String [] args){
        int a,b,c;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        b = sn.nextInt();
        c = sn.nextInt();
        System.out.printf("%d", (a<b ? a:b)<c ? (a<b ? a:b):c );
    }
}
