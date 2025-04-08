import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte value:");
		byte bt = sc.nextByte();
		System.out.println("The value of byte is:"+bt);
		System.out.println("---------------------------");
		
		System.out.println("Enter the short value:");
		short st = sc.nextShort();
		System.out.println("The value of short is:"+st);
		System.out.println("---------------------------");
		
		System.out.println("Enter the int value:");
		int it = sc.nextInt();
		System.out.println("The value of int is:"+it);
		System.out.println("---------------------------");
		
		System.out.println("Enter the long value:");
		long lg = sc.nextLong();
		System.out.println("The value of long is:"+lg);
		System.out.println("---------------------------");
		
		System.out.println("Enter the float value:");
		float ft = sc.nextFloat();
		System.out.println("The value of float is:"+ft);
		System.out.println("---------------------------");
		
		System.out.println("Enter the double value:");
		double db = sc.nextDouble();
		System.out.println("The value of double is:"+db);
		System.out.println("---------------------------");
		
		System.out.println("Enter the String value:");
		String str = sc.next();
		System.out.println("The value of string is:"+str);
		System.out.println("---------------------------");
		
		System.out.println("Enter the string/character value:");
		String str1 = sc.next();
		System.out.println("The value of string/character is:"+str1);
		System.out.println("---------------------------");
	}

}
