package codeupstandard100;

import java.util.Scanner;

public class num67 {
	public static void main(String[] args) {
	int a;
	Scanner sn =new Scanner(System.in);
	a=sn.nextInt();
	
	if(a<0) System.out.println("minus");
	else System.out.println("plus");
	
	if(a%2==0) System.out.println("even");
	else System.out.println("odd");
	
	}
}
