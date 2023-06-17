package codeupstandard100;

import java.util.Scanner;

public class num98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int h=sn.nextInt();
		int w=sn.nextInt();
		
		int [][] pn= new int[h+1][w+1];
		int num=sn.nextInt();
		
		int [][] ip =new int[num][4];
		
		int [] l = new int[num];
		int [] d =new int[num];
		int [][] xy = new int[num][2];
		
		
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<4; j++) {
				ip[i][j]=sn.nextInt();
			}
		}
		
		for(int i=0; i<num; i++) {
			l[i]=ip[i][0];
			d[i]=ip[i][1];
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				xy[i][0]=ip[i][2];
				xy[i][1]=ip[i][3];
			}
		}
		
		for(int i=0; i<num; i++) {	
			pn[xy[i][0]-1][xy[i][1]-1]=1;
			if(d[i]==0) {
				for(int q=1; q<=l[i]; q++) {
					pn[xy[i][0]-1][xy[i][1]-1+q]=1;
				}
			}
			
			else {
				for(int q=1; q<=l[i]; q++) {
					pn[xy[i][0]-1+q][xy[i][1]-1]=1;
				}
			}
			
			
		}
	
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.printf("%d ", pn[h][w]);
		}
			System.out.println();
		}
		
			
	}

}
