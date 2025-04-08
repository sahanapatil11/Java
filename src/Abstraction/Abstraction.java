package Abstraction;

abstract class Plane {
	void takeOff() {
		System.out.println("plane took off");
	}

	abstract void fly();

	void land() {
		System.out.println("plane landed");
	}
}

class CargoPlane extends Plane {

	
	  void fly() { System.out.println("Cargo Plane flys at lower heights"); }
	 
	void CarryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}

class PassengerPlane extends Plane {

	void fly() {
		System.out.println("Passenger Plane flys at medium heights");
	}

	void CarryHumans() {
		System.out.println("Passenger Plane carry humans");
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter plane flys at great heights");
	}

	void CarryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Plane ref;
		System.out.println("Cargo Plane data:");
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.CarryGoods();
		System.out.println("------------------");

		System.out.println("Passenger Plane data:");
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.CarryHumans();
		System.out.println("-------------------");

		System.out.println("Fighter Plane data:");
		ref = fp;
		ref.takeOff();
		ref.land();
		fp.CarryWeapons();
	}
}
