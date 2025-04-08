package Stringprograms;

public class StringMethods {
    public static void main(String args[]) {
    	String str = "SachinRameshTendulkar";
    	char c1 = str.charAt(8);
    	System.out.println(c1);
    	
    	int i = str.charAt(8);
    	System.out.println(i);
    	
    	//c1 = str.charAt(70);  It raises an exception called "StringIndexOutOfBoundsException"
    	//System.out.println(c1);
    	System.out.println("--------------------");
    	
    	String str1 = str.concat(" is the best cricketer in the world");
    	System.out.println(str1);
    	str.concat(" is the best cricketer in the world");
    	System.out.println(str);

    	System.out.println("--------------------");
    	
    	boolean res = str.contains("Ramesh");
    	System.out.println(res);
    	res = str.contains("Umesh");
    	System.out.println(res);
    	res = str.contains("SRT");
    	System.out.println(res);
    	System.out.println("--------------------");
    	
    	boolean res1 = str.endsWith("Tendulkar");
    	System.out.println(res1);
    	res1 = str.endsWith("Pendulkar");
    	System.out.println(res1);
    	System.out.println("--------------------");
    	
    	Class class1 = str.getClass();
    	System.out.println(class1);
    	System.out.println("--------------------");
    	
    	int hashCode = str.hashCode();
    	System.out.println(hashCode);
    	System.out.println("--------------------");
    	
    	int indexOf = str.indexOf("a");
    	System.out.println(indexOf);
    	indexOf = str.indexOf("Sachin"); //gives the index value of first character of the string
    	System.out.println(indexOf);
    	indexOf = str.indexOf("Sachinn");
    	System.out.println(indexOf);
    	indexOf = str.indexOf("Rachin");
    	System.out.println(indexOf);
    }
}
