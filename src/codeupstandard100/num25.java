package codeupstandard100;
import java.util.*;
public class num25 {
    public static void main(String[] args){
        String a;
        Scanner sn = new Scanner(System.in);
        a = sn.nextLine();
        String[] num = a.split("");
        
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int num3 = Integer.parseInt(num[2]);
        int num4 = Integer.parseInt(num[3]);
        int num5 = Integer.parseInt(num[4]);
        
        System.out.printf("[%d]\n", num1*10000);
        System.out.printf("[%d]\n", num2*1000);
        System.out.printf("[%d]\n", num3*100);
        System.out.printf("[%d]\n", num4*10);
        System.out.printf("[%d]", num5);
        
    }
}
