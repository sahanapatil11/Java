package Inheritance;
class Parent3{
	String name;
	String city;
	int age;
	public Parent3(String name, String city, int age) {
		super();
		this.name=name;
		this.city=city;
		this.age=age;
	}
	public Parent3() {
	}
}
class Parent4{
	String name;
	String city;
	int age;
	public Parent4() {
	}
	public Parent4 (String name, String city, int age) {
		super();
		this.name=name;
		this.city=city;
		this.age=age;
	}
}
// class Child3 extends Parent3, Parent4{	// gives error because a child class can have only one parent
//}
public class Rule3 {
	public static void main(String[] args) {

	}
}
