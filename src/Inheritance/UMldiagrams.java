package Inheritance;
class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override //annotation
	void fly() {
		System.out.println("Cargo Plane flys at lower heights");
	}
	void CarryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane flys at medium height");
	}
	void CarryHumans() {
		System.out.println("Passenger plane carry humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly(){
		System.out.println("Fighter plane flys at great heights");
	}
	void CarryWeapons() {
		System.out.println("Fighter Plane carry weapons");
	}
}

public class UMldiagrams {
	public static void main(String[] args) {
		CargoPlane cg = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp =  new FighterPlane();
		
		System.out.println("CargoPlane Data");
		cg.takeOff();
		cg.fly();
		cg.land();
		cg.CarryGoods();
		System.out.println("------------");
		
		System.out.println("PassengerPlane data");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.CarryHumans();
		System.out.println("------------");
		
		System.out.println("FighterPlane data");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.CarryWeapons();
		System.out.println("-----------------");
	}
}

