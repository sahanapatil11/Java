package Stringprograms;

public class MutableStrings {

	public static void main(String[] args) {
		//here s1 is an immutable String
		String s1 = "RAMA";
		System.out.println(s1);
		s1.concat("Sita");
		System.out.println(s1);  //concatination does not occur because s1 is an immutable string.
		// if it needs be conactinated, then use the following method
		s1=s1.concat("Sita");
		System.out.println(s1);
		
		System.out.println("----------");
		
		//mutable string using StringBuffer. it is concatinated using append method
		StringBuffer sb1 = new StringBuffer("Romeo");
		sb1.append("Juliet");
		System.out.println(sb1);
        
		//Mutable string using StringBuilder
		StringBuilder sb2 = new StringBuilder("Shiva");
		sb2.append("Parvati");
		System.out.println(sb2);
		
	}

}
