package codeupstandard100;

import java.util.Scanner;

public class num66_2 {
	public static void main(String[] args) {
	int[] num = new int[3];
	Scanner sn= new Scanner(System.in);
	
	for(int i=0; i<3; i++) {
		num[i]=sn.nextInt();
		if(num[i]%2==0) System.out.println("even");
		else System.out.println("odd");
	}
	
//	for(int i=0; i<3; i++) {
//
//	}
	}
}
