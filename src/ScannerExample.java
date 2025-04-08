import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte value:");
		byte bt = sc.nextByte();
		System.out.println("Collected byte value is: "+bt);
		System.out.println("---------------------");
		System.out.println("Enter the short value:");
		short st = sc.nextShort();
		System.out.println("Collected short value is: "+st);
		System.out.println("---------------------");
		System.out.println("Enter the int value:");
		int it = sc.nextInt();
		System.out.println("Collected int value is: "+it);
		System.out.println("---------------------");
		System.out.println("Enter the long value:");
		long lg = sc.nextLong();
		System.out.println("Collected long value is: "+lg);
		System.out.println("---------------------");
		System.out.println("Enter the flaot value:");
	    float ft = sc.nextFloat();
	    System.out.println("Collected float value is: "+ft);
	    System.out.println("---------------------");
	    System.out.println("Enter the double value:");
	    double db = sc.nextDouble();
	    System.out.println("Collected double value is: "+db);
	    System.out.println("---------------------");
	    System.out.println("Enter the boolean value:");
	    boolean bl = sc.nextBoolean();
	    System.out.println("Collected boolean value is: "+bl);
	    System.out.println("---------------------");
	    System.out.println("Enter the string value:");
	    String str = sc.next();
	    System.out.println("Collected string value is: "+str);
	    System.out.println("---------------------");
	    System.out.println("Enter the string value:");
	    String str2= sc.nextLine();
	    System.out.println("Collected string value is: "+str2);
	
	}

}
