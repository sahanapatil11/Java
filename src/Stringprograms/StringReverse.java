package Stringprograms;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		str= str.trim();
        int spc_cnt=0;
        
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
        		spc_cnt++;
        	}
        }
        int word_count = spc_cnt+1;
        
        String arr[] = new String[word_count];
        String temp = "";
        int count = arr.length-1;
        
        for(int i=str.length()-1; i>=0; i--) {
        	if(str.charAt(i)!=' ') {
        		temp = temp + str.charAt(i);
        	}
        	else if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
        		arr[count]=temp;
        		temp=" ";
        		count--;
        	}
        }
        arr[count] = temp;
        for(String str1: arr) {
        	System.out.print(str1+" ");
        }
	}

}
