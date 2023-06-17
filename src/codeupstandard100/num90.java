package codeupstandard100;

import java.util.Scanner;

public class num90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int r=sn.nextInt();
		int n=sn.nextInt();
		
		long result=0;
		result = a*(long)(Math.pow(r, n-1));
		
		System.out.println(result);
	}

}
