package Stringprograms;
import java.util.Scanner;
public class WordCount {

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
        System.out.println("Total number of words are:"+ word_count);
	}
	}