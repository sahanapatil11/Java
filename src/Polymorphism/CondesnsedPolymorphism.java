package Polymorphism;
class Plane{
	 void takeOff() {
		 System.out.println("plane took off");
	 }
	 void fly() {
		 System.out.println("plane flys");
	 }
	 void land(){
		 System.out.println("plane landed");
	 }
}
class CargoPlane extends Plane{
	 @Override
	 void fly() {
		 System.out.println("Cargo Plane flys at lower heights");
	 }
	 void CarryGoods() {
		 System.out.println("Cargo plane carry goods");
	 }
}
class PassengerPlane extends Plane{
	 void fly() {
		 System.out.println("Passenger Plane flys at medium heights");
	 }
	 void CarryHumans() {
		 System.out.println("Passenger Plane carry humans");
	 }
	}
class FighterPlane extends Plane{
	 void fly() {
		 System.out.println("Fighter plane flys at great heights");
	 }
	 void CarryWeapons() {
		 System.out.println("Fighter plane carry weapons");
	 }
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();		
	}
}
public class CondesnsedPolymorphism {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		Plane ref;
		System.out.println("CargoPlane data:");
		a.permit(cp);
		cp.CarryGoods();
		System.out.println("-------------------");
		System.out.println("PassengerPlane data:");
		a.permit(pp);
		pp.CarryHumans();
		System.out.println("-------------------");
        System.out.println("FighterPlane data:");
        a.permit(fp);
        fp.CarryWeapons();
	}

}
