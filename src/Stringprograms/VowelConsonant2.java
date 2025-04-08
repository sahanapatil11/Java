package Stringprograms;
import java.util.Scanner;
public class VowelConsonant2 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string:");
      String str = sc.nextLine();
      int lowerVowel_cnt =0;
      int upperVowel_cnt =0;
      
      for(int i=0; i<str.length(); i++) {
    	  if(str.charAt(i)>=65 && str.charAt(i)<=90) {
    		  if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
    				  str.charAt(i)=='O' || str.charAt(i)=='U') {
    			  upperVowel_cnt++;
    		  }
    	  }else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
    		  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
    				  str.charAt(i)=='o' || str.charAt(i)=='u') {
    			  lowerVowel_cnt++;
    		  }
    	  }
      }
      System.out.println("LowerVowel_count="+lowerVowel_cnt);
      System.out.println("UpperVowel_count="+upperVowel_cnt);
	}

}
