package encapsulationcodes;
class Dog2{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class SpecificSetterGetter {
   public static void main(String[] args) {
	   Dog2 d1 = new Dog2();
	   d1.setName("Tommy");
	   d1.setColor("Yellow");
	   d1.setBreed("Pug");
	   d1.setAge(8);
	   d1.setCost(9000);
	   
	   System.out.println(d1.getName());
	   System.out.println(d1.getColor());
	   System.out.println(d1.getBreed());
	   System.out.println(d1.getAge());
	   System.out.println(d1.getColor());
	   
   }
}
