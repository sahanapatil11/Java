package pattern;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int size = sc.nextInt();
     
     for(int i=1; i<=size; i++) {
    	 for(int j=1; j<=size; j++) { // i and j prints the star format
    		 System.out.printf("* ");
    	 }
    	 for(int k=1; k<=size; k++) { // k prints the # format
    		 System.out.print("# ");
    	 }
    	 System.out.println();
     }
	}

}
