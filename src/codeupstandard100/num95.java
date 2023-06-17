package codeupstandard100;

import java.util.Scanner;

public class num95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int a = sn.nextInt();
		int [] sd = new int[a];
		
		for(int i=0; i<a; i++) {
			sd[i]=sn.nextInt();
		}
		
		int min=sd[0];
		
		for(int i=0; i<a-1; i++) {
			if(min>sd[i]) {
				min=sd[i];
			}
			
		}
		System.out.println(min);
	}

}
