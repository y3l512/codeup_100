package codeupstandard100;

import java.util.Scanner;

public class num99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] miro = new int [11][11];
		Scanner sn = new Scanner(System.in);
		
		for(int i =1; i<=10; i++) {
			for(int j =1; j<=10; j++) {
				miro[i][j]=sn.nextInt();
			}
		}
		
		int x = 2;
		int y=2;
	
		
		while(true) {
			
			if(miro[x][y]==2) {
				miro[x][y]=9;
				break;
			}
			else { miro[x][y]=9;
			if(miro[x][y+1]==2) {
				miro[x][y+1]=9;
				break;
			}
			else if(miro[x][y+1]==0) {
				miro[x][y+1]=9;	
				y++;
			}
			else if(miro[x+1][y]==2) {
				miro[x+1][y]=9;
				break;
			}		
			
			else if(miro[x+1][y]==0) { 
				miro[x+1][y]=9;
				x++;
			}
			
			
			else break;
			}
		}
		
		
		for(int i =1; i<=10; i++) {
			for(int j =1; j<=10; j++) {
				
				System.out.printf("%d ",miro[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

}
