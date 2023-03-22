package codeupstandard100;
import java.util.*;
public class num27 {
    public static void main(String[] args){
        int y,m,d;
        String a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextLine();
        String[] result;
        result = a.split("\\.");
        
        y=Integer.parseInt(result[0]);
        m=Integer.parseInt(result[1]);
        d=Integer.parseInt(result[2]);
        
        System.out.printf("%02d-%02d-%04d", d,m,y);
        
    }
    
}
