package MethodOverloading;

 class Calculator{
	 int add(int a, int b) {
		 return a+b;
	 }
	 float add(float a, float b) {
		 return a+b;
	 }
	 float add(float a, int b) {
		 return a+b;
	 }
	 float add(int a, float b) {
		 return a+b;
	 }
	 float add(float a, float b, float c) {
		 return a+b+c;
	 }
	 double add(double a, double b) {
		 return a+b;
	 }
	 double add(int a, double b) {
		 return a+b;
	 }
	 double add(double a, int b) {
		 return a+b;
	 }
	 double add(float a, double b) {
		 return a+b;
	 }
	 double add(double a, float b) {
		 return a+b;
	 }
	 double add(int a, float b, double c) {
		 return a+b+c;
	 }
	 double add(float a, int b, double c) {
		 return a+b+c;
	 }
	 double add(double a, int b, float c) {
		 return a+b+c;
	 }
	 double add(double a, float b, int c) {
		 return a+b+c;
	 }	 
 }

public class MethodOverloading {
     public static void main(String[] args) {
    	 Calculator cal = new Calculator();
    	 int a=10, b=20, c=30;
    	 float m=10.5f, n=40.8f, o=30.6f; 
    	 double p=10.7676, q=20.756767, r=30.7442;
    	 System.out.println(cal.add(a, b));
    	 System.out.println(cal.add(p, q));
    	 System.out.println(cal.add(a, n));
    	 System.out.println(cal.add(m, b));
    	 System.out.println(cal.add(q, b,m));
    	 System.out.println(cal.add(m, b,q));
    	 System.out.println(cal.add(m, n));
    	 System.out.println(cal.add(a, m,q));
     }
}
