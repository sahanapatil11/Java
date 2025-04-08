package Constructors;
/*class object{
	object(){
		----
		----
	}
}*/
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	//Zero parameterized constructor
	public Dog() {
		this("Jimmy");
		System.out.println("Inside zero parameterized constructor:");
		this.name="Tommy";
		this.color="red";
		this.breed="pug";
		this.age=2;
		this.cost=40000;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println("----------");		
	}
    //one parameterized constructor
	public Dog(String name) {
		this("Bruno","Brown");
		System.out.println("Inside one parameterized constructor:");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println("-----------");
	}
//two parameterized constructor
	public Dog(String name, String color) {
		this("lipsy","White","GR");
		System.out.println("Inside two parameterized constructor:");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.breed);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println("------------");
	}

 //three parameterized constructor
 public Dog(String name, String color, String breed) {
	 this("Chintu","purple","Shitzu",3);
	 System.out.println("Inside three parameterized constructor:");
	 this.name=name;
	 this.color=color;
	 this.breed=breed;
	 System.out.println(this.name);
	 System.out.println(this.color);
	 System.out.println(this.breed);
	 System.out.println(this.cost);
	 System.out.println(this.age);
	 System.out.println("------------");
 }
 //four parameterized constructor
  public Dog(String name, String color, String breed, int age) {
	  this("Rocky","Brown-Black","German-Shepard",7,90000);
	  System.out.println("Inside four parameterized constructor:");
	  this.name=name;
	  this.color=color;
	  this.breed=breed;
	  this.age=age;
	  System.out.println(this.name);
	  System.out.println(this.color);
	  System.out.println(this.breed);
	  System.out.println(this.age);
	  System.out.println(this.cost);
	  System.out.println("-----------");
  }
  //Five parameterized constructor
  public Dog(String name, String color, String breed, int cost, int age) {
	  super();
	  System.out.println("Inside five parameterized constructor:");
	  this.name=name;
	  this.color=color;
	  this.breed=breed;
	  this.age=age;
	  this.cost=cost;
	  System.out.println(this.name);
	  System.out.println(this.color);
	  System.out.println(this.breed);
	  System.out.println(this.cost);
	  System.out.println(this.age);
	  System.out.println("----------------");
  }
}
public class Constructor {
	public static void main(String[] args) {
	Dog d1 = new Dog();	
	}

}
