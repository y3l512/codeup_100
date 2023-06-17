package codeupstandard100;

import java.util.Scanner;

public class num85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		long h = sn.nextLong();
		long b = sn.nextLong();
		long c = sn.nextLong();
		long s = sn.nextLong();
		
		double mb=0;
		
		mb=(double)((h*b*c*s))/8/1024/1024;
		
		System.out.printf("%.1f MB",mb);
		
	}

}
