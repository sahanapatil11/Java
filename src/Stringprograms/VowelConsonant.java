package Stringprograms;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String:");
       String str= sc.nextLine();
       
       int vowel_cnt=0;
       int consonant_cnt=0;
       str=str.toUpperCase();
       
       for(int i=0; i<str.length(); i++) {
    	   if(str.charAt(i)>=65 && str.charAt(i)<=90) {
    		   if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||
    			   str.charAt(i)=='O'|| str.charAt(i)=='U') {
    			   vowel_cnt++;
    		   }else {
    			   consonant_cnt++;
    		   }
    	   }
       }
       System.out.println("Vowel:"+vowel_cnt);
       System.out.println("Consonant:"+consonant_cnt);
	}

}
