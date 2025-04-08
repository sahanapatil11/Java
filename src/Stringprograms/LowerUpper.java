package Stringprograms;
import java.util.Scanner;
public class LowerUpper {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:-");
      String str = sc.nextLine();
      
      String new_lower="";
      String new_upper="";
      
      
      for(int i=0; i<str.length(); i++) {
    	  if( str.charAt(i)>=65 && str.charAt(i)<=90) {
    		   new_lower +=  (char) (str.charAt(i) + 32);
    		   new_upper += str.charAt(i); //keeps the uppercase unchanged
    		
    	  }else if( str.charAt(i)>=97 && str.charAt(i)<=122) {
    		   new_upper += (char) (str.charAt(i) - 32);
    		   new_lower += str.charAt(i);  //keeps the lowercase unchanged
    	  }else if(str.charAt(i)== ' ') {    // counts the space+
    		  new_lower=new_lower+" ";
    		  new_upper= new_upper+" ";  
    	  }
      }
      System.out.println("Lowercase:" + new_lower);
      System.out.println("Uppercase:" + new_upper);
      
	}
	

}
