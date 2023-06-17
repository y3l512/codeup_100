package codeupstandard100;

import java.util.Scanner;

public class num86 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		long w = sn.nextLong();
		long h = sn.nextLong();
		long b = sn.nextLong();
		
		double mb=0;
		
		mb = (double)(w*h*b)/8/1024/1024;
		
		System.out.printf("%.2f MB",mb);
		
	}
}
