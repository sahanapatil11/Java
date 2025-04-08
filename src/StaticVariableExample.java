class SampleCode{
	static int var1, var2, var3; //static variables - created using static keyword
	int nvar1, nvar2, nvar3;     //non-static variables
	
	//static block
	static {
		var1=100;  //static variables can be accessed inside the static block
		var2=200;  //static variables can be accessed inside the static block
		var3=300;  //static variables can be accessed inside the static block
		
		// nvar1=111;  non-static variables cannot be accessed inside the static block
		// nvar2=222;  non-static variables cannot be accessed inside the static block
		// nvar3=333;  non-static variables cannot be accessed inside the static block
	}
	
	//non-static block  - they are just created by opening a flower bracket
	
	{
		var1=1000;  //static variables can be accessed inside the non-static block
		var2=2000;  //static variables can be accessed inside the non-static block
		var3=3000;  //static variables can be accessed inside the non-static block
		
		nvar1=999;  //non-static variables can be accessed inside the non-static block
		nvar2=888;  //non-static variables can be accessed inside the non-static block
		nvar3=777;  //non-static variables can be accessed inside the non-static block
		
	}
	
	//static method
	static void display1() {
		System.out.println(var1);  //static variables can be accessed inside the static method
		System.out.println(var2);  //static variables can be accessed inside the static method
		System.out.println(var3);  //static variables can be accessed inside the static method
		
	 //   System.out.println(nvar1);   non-static variables cannot be accessed inside the static method
	 //   System.out.println(nvar2);   non-static variables cannot be accessed inside the static method
	 //   System.out.println(nvar3);   non-static variables cannot be accessed inside the static method
	     
	}
	
	//non-static method
	void display(){
		System.out.println(var1);  //static variables can accessed inside the non-static method
		System.out.println(var2);  //static variables can accessed inside the non-static method
		System.out.println(var3);  //static variables can accessed inside the non-static method
		
		System.out.println(nvar1); //non-static variables can be accessed inside the non-static method
		System.out.println(nvar2); //non-static variables can be accessed inside the non-static method
		System.out.println(nvar3); //non-static variables can be accessed inside the non-static method
  	}
	
}
public class StaticVariableExample {

	public static void main(String[] args) {
		SampleCode.display1();
		System.out.println("---------------");
		SampleCode.var1=1;
		SampleCode.var2=2;
		SampleCode.var3=3;
		System.out.println(SampleCode.var1);
		System.out.println(SampleCode.var2);
		System.out.println(SampleCode.var3);
		System.out.println("-----------------");
		SampleCode sc = new SampleCode();
		System.out.println("-----------------");
		sc.display();
		System.out.println("-----------------");
		sc.display1();			
				
	}

}
