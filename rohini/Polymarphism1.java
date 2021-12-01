class Plane1
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

class CargoPlane1 extends Plane1
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

class PassengerPlane1 extends Plane1
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

class FighterPlane1 extends Plane1
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

class Airport
{
 public void permit(Plane1 ref)
 {
  ref.takeOff();
  ref.fly();
  ref.land();
 }
}
public class Polymarphism1 {

	public static void main(String[] args) {
		  CargoPlane1 cp=new CargoPlane1();
		  PassengerPlane1 pp=new PassengerPlane1();
		  FighterPlane1 fp=new FighterPlane1();
		  Airport a=new Airport();
		  a.permit(cp);
		  a.permit(pp);
		  a.permit(fp);	

	}

}
