package codeupstandard100;

import java.util.Scanner;

public class num97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = new int[20][20];
		
		Scanner sn = new Scanner(System.in);
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				a[i][j]=sn.nextInt();
			}
		}

		int num = sn.nextInt();
		
		int [][] pin=new int[num][2];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				pin[i][j]=sn.nextInt();
				
			}
		}
		
	
			for(int p=0; p<19; p++) {	
				for(int q=0; q<num; q++) {
				if(a[p][pin[q][0]-1]==0) {
					a[p][pin[q][0]-1]=1;
				}
				else {
					a[p][pin[q][0]-1]=0;
				}
				
				if(a[pin[q][1]-1][p]==0) {
					a[pin[q][1]-1][p]=1;
				}
				else {
					a[pin[q][1]-1][p]=0;
				}
				
				}
				
			}
			
			for(int i=0; i<19; i++) {
				for(int j=0; j<19; j++) {
					System.out.printf("%d ",a[i][j]);
				}
				System.out.println();
			}
		
		
	
	
	}

}
