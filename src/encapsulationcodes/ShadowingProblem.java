package encapsulationcodes;

class Dog1{
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;

//generic setter with parameter
 void setData(String name, String color, String breed, int cost,int age) {
	 this.name=name;  //this keyword is used to overcome the shadowing problem
	 this.color=color;
	 this.breed=breed;
	 this.cost=cost;
	 this.age=age;
 }
 //generic getter
 void getData() {
	 System.out.println(name);
	 System.out.println(color);
	 System.out.println(breed);
	 System.out.println(age);
	 System.out.println(cost);
 }
}
public class ShadowingProblem {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.setData("Rocky","White","GR",5,6000);
		d1.getData();
	}

}
