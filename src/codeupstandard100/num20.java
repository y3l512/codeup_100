package codeupstandard100;
import java.util.*;
public class num20 {
    public static void main(String[] args){
        String a;
        Scanner sn = new Scanner(System.in);
        a=sn.nextLine();
        String[] num = a.split("-");
        String num1 = num[0];
        String num2 = num[1];
        
        System.out.println(num1+num2);
    }
}
