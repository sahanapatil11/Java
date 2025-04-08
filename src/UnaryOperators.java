
public class UnaryOperators { // increment and decrement

	public static void main(String[] args) {
		int a=10;  //pre increment
		int b=0;
		
		b=++a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------");
		
		b=a++;  //post increment
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------");
		
		b=--a; //pre decrement
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------");
		
		b=a--;  //post decrement
		System.out.println(a);
		System.out.println(b);
	}

}
