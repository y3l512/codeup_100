package codeupstandard100;

import java.util.Scanner;

public class num83 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int a = sn.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i%3!=0) System.out.print(i+" ");
			else System.out.print("X ");
			
		}

	}

}
