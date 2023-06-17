package codeupstandard100;

import java.util.Scanner;

public class num68 {
	public static void main(String[] args) {
		int score;
		Scanner sn=new Scanner(System.in);
		score = sn.nextInt();
		if(score>=90) System.out.println("A");
		else if(score>=70) System.out.println("B");
		else if(score>=40) System.out.println("C");
		else System.out.println("D");
	}
}
