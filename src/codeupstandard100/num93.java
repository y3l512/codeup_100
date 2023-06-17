package codeupstandard100;

import java.util.Scanner;

public class num93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int a = sn.nextInt();
		int [] sd = new int[a];
		
		for(int i=0; i<a; i++) {
			sd[i]=sn.nextInt();
		}
		
		int[] num = new int [23];
		
		for(int i=0; i<a;i++) {
			num[(sd[i]-1)]+=1;
		}
		
		for(int i=0; i<23;i++) {
		System.out.print(num[i]+" ");
		}
	}

}
