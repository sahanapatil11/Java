package pattern;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++) {
			for(int j=size; j>=i; j--) {
				System.out.print("-");
			}
			for(int k=1; k<= i*2-1; k++) {
				System.out.print("&");
			}
			System.out.println();
		}

	}

}
