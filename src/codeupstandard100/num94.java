package codeupstandard100;

import java.util.Scanner;

public class num94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int a = sn.nextInt();
		int [] sd = new int[a];
		
		for(int i=0; i<a; i++) {
			sd[i]=sn.nextInt();
		}
		
		for(int i=a-1; i>=0; i--) {
			System.out.print(sd[i]+" ");
		}
	}

}
