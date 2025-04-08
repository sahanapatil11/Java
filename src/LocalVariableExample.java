class Calculator{
	void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
}
public class LocalVariableExample {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.add();
		cal.sub(10, 6);
	}

}
