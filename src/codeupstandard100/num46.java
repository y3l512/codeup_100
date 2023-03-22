package codeupstandard100;

import java.util.*;

public class num46{
    public static void main(String [] args){
        long a,b,c;
        Scanner sn = new Scanner(System.in);
        
        long sum;
        double avg;
        
        a = sn.nextLong();
        b= sn.nextLong();
        c= sn.nextLong();
        
        sum = a+b+c;
        avg = (double)(a+b+c)/3;
        
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n", avg);
    }
    
}