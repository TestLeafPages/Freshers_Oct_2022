package week5.day1;

public class Bajaj  extends Auto{

	public void bajajVehicle() {
		System.out.println("Bajaj Vehicle");
	}
	public static void main(String[] args) {
		Bajaj vehicle=new Bajaj();
		vehicle.applyBreak();
		vehicle.handleStarter();
		vehicle.bajajVehicle();
	}
}
