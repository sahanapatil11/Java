package Stringprograms;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string");
      String str = sc.next();
      String temp= "";
      
      for(int i=str.length()-1; i>=0; i--) {
    	  temp=temp+str.charAt(i);
      }
      if(str.equals(temp)==true) {
    	  System.out.println("Palindrome");
      }else {
    	  System.out.println("Not a Palindrome");
      }
	}

}
