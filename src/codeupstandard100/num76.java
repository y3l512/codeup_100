package codeupstandard100;

import java.util.Scanner;



public class num76 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String a = sn.nextLine();
		char c=a.charAt(0);
		int num=97;
		
		do {
			System.out.println((char)num);
			++num;
		}while(num<=(int)c);
	}
}
