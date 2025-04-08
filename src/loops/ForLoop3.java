package loops;
import java.util.Scanner;
public class ForLoop3 { 
	//print the table of n
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the value of n");
	     int n = sc.nextInt();
		
		
		for(int i=1; i<=10; i++) {
        	System.out.println(n*i);
        }
	}

}
