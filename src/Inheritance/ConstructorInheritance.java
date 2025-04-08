package Inheritance;
 class Animal{
	 String name;
	 String breed;
	 String color;
	 int age;
	 
	 public Animal() {
		 System.out.println("Inside zero parameterized constructor");
		 this.name="Elephant";
		 this.breed="Indian";
		 this.color="White";
		 this.age=18;
		 
		 System.out.println(this.name);
		 System.out.println(this.breed);
		 System.out.println(this.color);
		 System.out.println(this.age);
		 System.out.println("---------");
	 }
	 public Animal(String name, String breed, String color, int age) {
		 super();
		 System.out.println("Inside one parameterized constructor");
		 this.name=name;
		 this.breed=breed;
		 this.color=color;
		 this.age=age;
		 
		 System.out.println(this.name);
		 System.out.println(this.breed);
		 System.out.println(this.color);
		 System.out.println(this.age);
		 System.out.println("----------");
	 }
 }
 class Elephant extends Animal{
	 public Elephant() {
		 super();
	 }
 }
 class Tiger extends Animal{
	 public Tiger() {
		 super("Ramu","African","Orange",6);
	 }
 }
public class ConstructorInheritance {
	public static void main(String[] args) {
		Elephant e = new Elephant();
		Tiger t = new Tiger();
	}
}
