import java.util.Scanner;
public class ArithmeticOperators {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number:");
	 int num1 = sc.nextInt();
	 
	 System.out.println("Enter the second number:");
	 int num2 = sc.nextInt();
	 
	 //Addition operation - Sum
	 int res1 = num1 + num2;
	 System.out.println("Addition result:"+ res1);
	 
	 //Subtraction operation - difference
	 int res2 = num1 - num2;
	 System.out.println("Subtraction result:"+ res2);
	 
	 //Multiplication operation - Product
	 int res3 = num1 * num2;
	 System.out.println("Multiplication result:"+ res3);
	 
	 //Modulus operation - Reminder
	 int res4 = num1 % num2;
	 System.out.println("Modudlus result:"+ res4);
 }
}
