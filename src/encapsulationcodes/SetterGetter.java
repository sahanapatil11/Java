package encapsulationcodes;

class Dog {
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age;

//generic setter
void setData() {
	name="tommy";
	color="Black";
	breed="lab";
	
	age=6;
}
//Generic setter with parameter
  void setData1(String a, String b, String c, int d, int e) {
	  name=a;
	  color=b;
	  breed=c;
	  age=d;
	  cost=e;
  }
//Generic getter
  void getData() {
	  System.out.println(name);
	  System.out.println(color);
	  System.out.println(breed);
	  System.out.println(cost);
	  System.out.println(age);
  }
}
public class SetterGetter {

	public static void main(String[] args) {
		Dog d1 = new Dog();
// Error as the private members cannot be accessed directly
		/*
		  d1.name="jimmy"; 
		  d1.color="brown"; 
		  d1.breed="GR"; 
		  d1.age=2; 
		  d1.cost=4000;
		 */
		System.out.println("Generic setter without parameter is getting executed....");
		d1.setData();
		System.out.println("Generic setter without parameter is excecuted");
		System.out.println("----------------");
        d1.getData();
        System.out.println("Generic setter with parameter is getting executed");
        d1.setData1("Rocky","White","GR",4,6000);
        System.out.println("Generic setter with parameter is executed");
        System.out.println("----------------");
        d1.getData();    
	}

}
