package pattern;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the row size:");
         int r = sc.nextInt();
         
         System.out.println("Enter the column size:");
         int c = sc.nextInt();
         
         for(int i=1; i<=r; i++) {  //Outer loop (Vertical)
        	 for(int j=1; j<=c; j++) {  //Inner loop (Horizontal)
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
