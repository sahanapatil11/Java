package Stringprograms;

public class StringCode2 {

	public static void main(String[] args) {
		//Object based representation which allows duplications. hence, the references are not equal here
		String s1 = new String("Rama");
		String s2 = new String("Rama");
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		System.out.println("---------------------------");
		if(s1==s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("Refences are not equal");
		}
	}

}
