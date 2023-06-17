package codeupstandard100;

import java.util.Scanner;

public class num70 {
	public static void main(String[] args) {
		int a;
		Scanner sn=new Scanner(System.in);
		a = sn.nextInt();
		switch(a) {
		case 12,1,2:System.out.println("winter");
					break;
		case 3,4,5 :System.out.println("spring");
					break;
		case 6,7,8 :System.out.println("summer");
					break;
		case 9,10,11 :System.out.println("fall");
					break;
		}
	}
}
