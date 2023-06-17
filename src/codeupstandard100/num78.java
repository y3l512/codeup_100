package codeupstandard100;

import java.util.Scanner;

public class num78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int sum=0;
		
		for(int i=1; i<=a;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
	}

}
