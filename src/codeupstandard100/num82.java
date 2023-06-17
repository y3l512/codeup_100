package codeupstandard100;

import java.util.Scanner;

public class num82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a = sn.nextInt(16);
		for(int i=1; i<=15; i++) {
			System.out.printf("%X*%X=%X\n",a,i,a*i);
		}
	}

}
