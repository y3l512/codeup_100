package codeupstandard100;

import java.util.Scanner;

public class num92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int r=sn.nextInt();
		int n=sn.nextInt();
		
		int sm =0;
		int day=1;
		while(day%a!=0||day%r!=0||day%n!=0) {
			day++;
		}
		System.out.println(day);
		
		
	}

}
