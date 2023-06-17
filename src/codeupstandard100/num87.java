package codeupstandard100;

import java.util.Scanner;

public class num87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int sum=0;
		int i = 0;
		
		while(true) {
			if(sum>=a) break;
			i++;	
			sum+=i;
				
			}
		
		System.out.println(sum);
	}
	}

