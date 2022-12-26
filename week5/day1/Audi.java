package week5.day1;

import java.util.ArrayList;
import java.util.List;

public class Audi extends Car{

	public void openSunRoof() {
		System.out.println("Open Sun Roof");
	}
	
	public static void main(String[] args) {
		
		Audi obj=new Audi();
		obj.applyBreak();
		obj.soundHorn();
		obj.openSunRoof();
	}
}
