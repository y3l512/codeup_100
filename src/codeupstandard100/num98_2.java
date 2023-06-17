package codeupstandard100;

import java.util.Scanner;

public class num98_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn= new Scanner(System.in);
		int h=sn.nextInt();
		int w=sn.nextInt();
		
		int[][] pn=new int[h][w];
		
		int num = sn.nextInt();
		
		for(int i=0; i<num; i++) {
			int l = sn.nextInt();
			int d = sn.nextInt();
			int x = sn.nextInt();
			int y = sn.nextInt();
			
			
			if(d==0) {
				for(int q=0; q<l; q++) {
					pn[x-1][y-1+q]=1;
				}
			}
			else {
				for(int q=0; q<l; q++) {
					pn[x-1+q][y-1]=1;
				}
			}
			
			
		}
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.printf("%d ",pn[i][j]);
			}
			System.out.println();
		}
	}

}
