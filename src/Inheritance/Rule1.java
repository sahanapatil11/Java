package Inheritance;
class Parent1{
	 private static int accno=111;
	 private static int balance=30000;
	 private static int pin=222;
	
	void display() {
		System.out.println(accno);
		System.out.println(balance);
		System.out.println(pin);
	}
}
class Child1 extends Parent1{
	void modify() {
		
		/*
		 * balance=20000; pin=333; 
		 * System.out.println(accno);
		 * System.out.println(balance);  // gives error because private members cannot be accessed outside the class
		 * System.out.println(pin);
		 */
		 
	}
}
public class Rule1 {
	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		p1.display();
		System.out.println();
		Child1 c1 = new Child1();
		c1.modify();
		c1.display();
		System.out.println("--------");
		p1.display();        
	}
}
