import java.lang.String;
public class StringCode3 {
  public static void main(String args[]) {
	  String s1 = "Rama";
	  String s2 = "RAMA";
	  
	  if(s1.compareTo(s2)==0) {
		  System.out.println("String are equal");
	  }else {
		  System.out.println("Strings are not equal");
	  }
	  System.out.println("----------------");
	  if(s1==s2) {
		  System.out.println("References are equal");
	  }else {
		  System.out.println("References are not equal");
	  }
  }
}
