package Stringprograms;

public class StringCode1 {

	public static void main(String[] args) {
		//Case1: Literal based representation pointing to the same reference without creating the duplicates
		
		String s1 = "Rama"; //Literal based representation
		String s2 = "Rama";
        if(s1.equals(s2)==true) {
        	System.out.println("Strings are equal");
        }else {
        	System.out.println("Strings are not equal");
        }
        System.out.println("-------------------");
        if(s1==s2) {
        	System.out.println("References are equal");
        }else {
        	System.out.println("Refenrenes are not equal");
        }
        System.out.println("===========================");
        // Case 2: Literal based representation pointing to different pointers as the strings are different
       
        String str1 = "Rama"; //Literal based representation
		String str2 = "RaMa";
        if(str1.equals(str2)==true) {
        	System.out.println("Strings are equal");
        }else {
        	System.out.println("Strings are not equal");
        }
        System.out.println("-------------------");
        if(str1==str2) {
        	System.out.println("References are equal");
        }else {
        	System.out.println("Refenrenes are not equal");
        }
        
        
	}

}
