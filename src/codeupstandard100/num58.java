package codeupstandard100;


import java.util.*;

public class num58{
    public static void main(String [] args){
        int a, b;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        b = sn.nextInt();
        int c = 0;
        
        if (a==0 && b==0) 
        {c=1;}
        else 
        {c=0;}

        System.out.printf("%d", c);
    }
}

