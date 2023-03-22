package codeupstandard100;
import java.util.*;

public class num53{
    public static void main(String [] args){
        int a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        
        int c = 0;
        
        if (a==1) 
       { c=0;}
        else if(a==0)
        {c=1;}

        System.out.printf("%d", c);
    }
}
