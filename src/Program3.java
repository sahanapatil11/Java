import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double db = 127.0;
		System.out.println("The value of double is:"+db);
		System.out.println("---------------------------");
		float ft = (float)db;
		System.out.println("The value of float is:"+ft);
		System.out.println("---------------------------");
		long lg = (long)ft;
		System.out.println("The value of long is:"+lg);
		System.out.println("---------------------------");
		int it = (int)lg;
		System.out.println("The value of int is:"+it);
		System.out.println("---------------------------");
		short st = (short)it;
		System.out.println("The value of short is:"+st);
		System.out.println("---------------------------");
		byte bt = (byte)st;
		System.out.println("The value of byte is:"+bt);
		System.out.println("---------------------------");

	}

}
