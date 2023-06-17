package codeupstandard100;

import java.util.Scanner;

public class num84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a = sn.nextInt();
		int b = sn.nextInt();
		int c = sn.nextInt();
		int sum=0;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				for(int k =0; k<c; k++) {
					System.out.println(i+" "+j+" "+k);
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
