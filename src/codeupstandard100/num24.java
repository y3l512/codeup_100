package codeupstandard100;
import java.util.*;
public class num24 {
    public static void main(String[] args){
        String word;
 	        Scanner sn = new Scanner(System.in);
 	        word = sn.nextLine();
 	        String[] wordpack= word.split("");
 	      
 	        
 	        for(int i=0; i<word.length(); i++){
 	            System.out.printf("\'%s\'\n", wordpack[i]);}
         
     }
     
}
