package codeupstandard100;

import java.util.Scanner;

public class num81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		int a = sn.nextInt();
		int b = sn.nextInt();
		
		for(int i=1; i<=a;i++) {
			for(int j=1; j<=b; j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
