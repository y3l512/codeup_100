package codeupstandard100;

import java.util.Scanner;

public class num96 {

	public static void main(String[] args) {
		
		
		int [][] a= new int[20][20];
		
		Scanner sn= new Scanner(System.in);
		
		int num = sn.nextInt();
		int [][] white= new int[num][2];
		
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				white[i][j]=sn.nextInt();
			}
		}
		
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.printf("%d ", white[i][j]);
//			}
//			System.out.println();
//		}
		
		
		for(int i=0; i<num; i++) {
			a[white[i][0]-1][white[i][1]-1]=1;
		}
		
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println();
			
		}

	}

}
