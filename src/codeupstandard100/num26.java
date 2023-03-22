package codeupstandard100;
import java.util.*;
public class num26 {
    public static void main(String [] args){
        int h, m, s;
        String a;
        Scanner sn=new Scanner(System.in);
        a = sn.nextLine();
        String[] result = a.split(":");
        
        h = Integer.parseInt( result[0]);
        m = Integer.parseInt(result[1]);
        s = Integer.parseInt(result[2]);
        
        System.out.println(m);
        
    }
}
