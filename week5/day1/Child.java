package week5.day1;

public class Child extends Parent{

	public void car() {
		System.out.println("Car");
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.bungalow();
		child.car();
	}
}
