import java.util.Scanner;
 class Farmer {
  double principle;
  static double rate;
  double time;
  double si;
  
  static {
	  rate = 7.897;
  }
  
  void collectData() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the principle:");
	  principle = sc.nextDouble();
	  System.out.println("Enter the time: ");
	  time = sc.nextDouble();
  }
   void calculate() {
	   si = (principle * time * rate)/100;
   }
   void display() {
	   System.out.println("The si = "+si);
   }
	
 }
public class ApplicationStatic {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("--------------");
		Farmer f2 = new Farmer();
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("--------------");
		Farmer f3 = new Farmer();
		f3.collectData();
		f3.calculate();
		f3.display();
		
	}
	}



 
