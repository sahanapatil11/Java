package pattern;
import java.util.Scanner;
public class Program13 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size:");
       int size = sc.nextInt();
       
       for(int i=1; i<=size; i++) {
    	   for(int j=1; j<=i; j++ ) {
    		   System.out.printf("%2d" ,j);
    	   }
    	   System.out.println();
       }
	}

}
