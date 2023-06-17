package codeupstandard100;

import java.util.Scanner;

public class num91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int m=sn.nextInt();
		int d=sn.nextInt();
		int n=sn.nextInt();
		
		long result=0;
		long t =a;
		
		for(int i=0; i<n-1; i++) {
			t=t*m+d;
		}
		
		System.out.println(t);
		
		
	}

}
