package pattern;
import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size; j++) {
				System.out.print("#");
			}
			for(int k=1; k<=i; k++) {
				System.out.printf("&");
			}
			System.out.println();
		}
	}

}
