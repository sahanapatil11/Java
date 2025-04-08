import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3 ) {
			System.out.println("num1 is greater");
		}else if(num2 > num1 && num2 > num3) {
				System.out.println("num2 is greater");
			}
		else {
				System.out.println("num3 is greater");
			}
		System.out.println("-------------------");
		System.out.println("Enter the passcode name");
		String name = sc.next();
		
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		
		if(name.equals("india") || key==150 ) {
			System.out.println("Entry Permitted");
		}else {
			System.out.println("Entry Denied");
		}
		
		
		
	}

}
