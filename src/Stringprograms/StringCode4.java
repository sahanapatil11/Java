package Stringprograms;

public class StringCode4 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "rama";
		if(s1.compareTo(s2)==0) {
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
