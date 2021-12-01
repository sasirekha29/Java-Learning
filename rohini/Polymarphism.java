class Plane
{
 public void takeOff()
 {
  System.out.println("Plane is Taking-Off");
 }
 public void fly()
 {
  System.out.println("Plane is Flying");
 }
 public void land()
 {
  System.out.println("Plane is Landing");
 }
}

class CargoPlane extends Plane
{
 public void takeOff()
 {
  System.out.println("CargoPlane takeoff in long runway");
 }
 public void fly()
 {
  System.out.println("CargoPlane Flys at lower height");
 }
 public void land()
 {
  System.out.println("CargoPlane is Lands on long runway");
 }
}

class PassengerPlane extends Plane
{
 public void takeOff()
 {
  System.out.println("PassengerPlane takeoff in medium runway");
 }
 public void fly()
 {
  System.out.println("PassengerPlane Flys at medium height");
 }
 public void land()
 {
  System.out.println("PassengerPlane Lands on medium runway");
 }
}

class FighterPlane extends Plane
{
 public void takeOff()
 {
  System.out.println("FighterPlane takeoff in small runway");
 }
 public void fly()
 {
  System.out.println("PassengerPlane flys at great heights");
 }
 public void land()
 {
  System.out.println("PassengerPlane Lands on short runway");
 }
}
public class Polymarphism {

	public static void main(String[] args) {
		  CargoPlane cp=new CargoPlane();
		  PassengerPlane pp=new PassengerPlane();
		  FighterPlane fp=new FighterPlane();
		  Plane ref;
		  ref=cp;
		  ref.takeOff();
		  ref.fly();
		  ref.land();

		  ref=pp;
		  ref.takeOff();
		  ref.fly();
		  ref.land();

		  ref=fp;
		  ref.takeOff();
		  ref.fly();
		  ref.land();   	

	}

}
