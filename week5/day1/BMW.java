package week5.day1;

public class BMW extends Car {

	public void switchOnAc() {
		System.out.println("Switch on ac");
	}
	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.applyBreak();
		obj.soundHorn();
		obj.switchOnAc();
	}
}
