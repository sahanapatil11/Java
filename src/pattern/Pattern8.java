package pattern;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		
		int count = size * size;
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size; j++) {
				System.out.printf("%3d", count);
				count--;
			}
			System.out.println();
		}
		

	}

}
