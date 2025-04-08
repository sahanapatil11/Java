package Stringprograms;

public class StringMethods2 {

	public static void main(String[] args) {
      String str = "SachinRameshTendulkar";
      String str1 = "";
      String str2 = "   ";
      boolean res = str1.isBlank();
      System.out.println(res);
      res = str2.isBlank();
      System.out.println(res);
      System.out.println("----------------");
      
      res = str1.isEmpty();
      System.out.println(res);
      res = str2.isEmpty();
      System.out.println(res);
      System.out.println("----------------");
      
      int lastIndexOf = str.lastIndexOf("e");
      System.out.println(lastIndexOf);
      lastIndexOf = str.lastIndexOf("z");
      System.out.println(lastIndexOf);
      System.out.println("----------------");
      
      int length = str.length();
      System.out.println(length);
      System.out.println("----------------");
      
      String replace = str.replace("Tendulkar", "Pendulkar");
      System.out.println(replace);
      replace = str.replace("e", "$");
      System.out.println(replace);
      System.out.println("----------------");
      
      boolean res1 = str.startsWith("Sachin");
      System.out.println(res1);
      res1 = str.startsWith("Rachin");
      System.out.println(res1);
      System.out.println("----------------");
      
      String str3 = "     Hi Good Morning    ";
      String strip_str = str3.strip();
      System.out.println(strip_str);
      System.out.println("----------------");
      
      strip_str = str3.stripLeading(); //removes unwanted spaces in the beginning of the string
      System.out.println(strip_str);
      System.out.println("----------------");
      
      strip_str = str3.stripTrailing(); //removes unwanted spaces at the end of the string
      System.out.println(strip_str);
      
      String substring = str.substring(7);
      System.out.println(substring);
      substring = str.substring(6,10);
      System.out.println(substring);
      System.out.println("----------------");
      char[] charArray = str.toCharArray();
      for(char c : charArray) {
    	  System.out.println(c);
      }
      System.out.println("----------------");
      String lowercase = str.toLowerCase();
      System.out.println(lowercase);
      String upperCase = str.toUpperCase();
      System.out.println(upperCase);
      System.out.println("----------------");
      String trim = str3.trim();
      System.out.println(trim);
      System.out.println("----------------");
	}

}
