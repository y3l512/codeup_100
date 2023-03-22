package codeupstandard100;
import java.util.*;
public class num19 {
	public static void main(String[] args) {
	     String a;
	    Scanner sn = new Scanner(System.in);
	    a= sn.nextLine();
	   
	   String[] num = a.split("\\.");
	 
	    
	    String year1 = num[0];
	    String month1 = num[1];
	    String day1 = num[2];
	    
	    int year = Integer.parseInt(year1);
	    int month = Integer.parseInt(month1);
	    int day = Integer.parseInt(day1);
	    
	    System.out.printf("%04d.%02d.%02d", year, month, day);
	}
}
