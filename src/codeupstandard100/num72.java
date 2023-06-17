package codeupstandard100;


import java.util.Scanner;

public class num72 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int a =sn.nextInt();
		
		int[] num = new int[a];
		
		for(int i=0; i<a; i++){
			num[i]=sn.nextInt();
			System.out.println(num[i]);
		
		}

	}

}
