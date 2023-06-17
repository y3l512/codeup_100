package codeupstandard100;

import java.util.Scanner;

public class num88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		for(int i=1; i<=a; i++) {
			if(i%3==0) continue;
			System.out.print(i+" ");
		}
	}

}
