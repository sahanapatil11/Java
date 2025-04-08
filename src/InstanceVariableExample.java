import java.util.Scanner;

class Dog{
	String name;
	String color;
	String breed;
	int age;
	int cost;


void allocateData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the dog:");
	name = sc.next();
	System.out.println("Enter the color of the dog:");
	color = sc.next();
	System.out.println("Enter the breed of the dog:");
	breed = sc.next();
	System.out.println("Enter the age of the dog:");
	age = sc.nextInt();
	System.out.println("Enter the cost of the dog:");
	cost = sc.nextInt();
}

void display() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(breed);
	System.out.println(age);
	System.out.println(cost);
}
}

public class InstanceVariableExample {
 public static void main(String args[]) {
	 Dog d1 = new Dog();
	 d1.display();
	 System.out.println("------------------");
	 d1.allocateData();
	 d1.display();
 }
}
