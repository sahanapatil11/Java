package Stringprograms;

public class StringCode3 {

	public static void main(String[] args) {
		//literal based representation
		String s1 = "Rama";
		String s2 = "raMa";
		if(s1.equalsIgnoreCase(s2)==true) {
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
		
		System.out.println("=============================");
		//object based representation
		String str1 = new String("Rama");
		String str2 = new String("raMa");
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		System.out.println("---------------------------");
		if(str1==str2) {
			System.out.println("References are equal");
		}else {
			System.out.println("Refences are not equal");
		}

	}

}
