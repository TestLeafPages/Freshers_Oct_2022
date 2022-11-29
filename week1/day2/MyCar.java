package week1.day2;

public class MyCar {
	
	//type method name use ctrl +space and press enter key
	//change your access modifier as public
	public void driveCar() {
		System.out.println("Drive Car");

	}
	public void switchOnAc() {
		System.out.println("Switch on Ac");
	}
	public void slowACar() {
		System.out.println(" Slow a car");
	}
	
public static void main(String[] args) {
	MyCar car =new MyCar();
	car.driveCar();
	car.slowACar();
	car.switchOnAc();
	
}
}
