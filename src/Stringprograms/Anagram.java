package Stringprograms;
import java.util.Scanner;
public class Anagram {

	static char[] bubbleSort(char arr[]) {
		char temp=' ';
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first string:");
      String s1 = sc.next();
      
      System.out.println("Enter the second string:");
      String s2 = sc.next();
      
      if(s1.length()==s2.length()) {
    	  char arr1[] = new char[s1.length()];
    	  char arr2[] = new char[s2.length()];
    	  
    	  for(int i=0; i<arr1.length; i++) {
    		  if(arr1[i]!=arr2[i]) {
    			  System.out.println("Not anagram");
    			  System.exit(0);
    		  }
     }
    	  System.out.println("Anagram");
}
      
	}
}

