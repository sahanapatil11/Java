package loops;
import java.util.Scanner;
public class Forloop4 {
  //print all even numbers till n
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n:");
         int n = sc.nextInt();
         
         int i=0;
         
         for(i=0; i<=n; i+=2) {
        	 System.out.print(i + " ");
         }		
	}

}
