package loops;

/*Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
package loops;*/
import java.util.Scanner;
public class DoWhile2 {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Enter 1 to continue and 0 to exit");
			choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println("Enter the marks of the students between 0 to 100");
				 int marks = sc.nextInt();
				if(marks>=90) {
					System.out.println("this is good");
				}else if(marks>= 60) {
					System.out.println("this is also good");
				}else if(marks>=0) {
					System.out.println("this is good as well");
				}else {
					System.out.println("invalid marks");
				}
				
			}
		}while(choice!=0);
 System.out.println("Program stopped");
	}

}


