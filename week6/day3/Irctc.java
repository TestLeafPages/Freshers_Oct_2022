package week6.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
public static void main(String[] args) {
	//To open the Chrome Browser
			ChromeDriver driver=new ChromeDriver();
			//Load the application url
			driver.get("https://www.irctc.co.in/nget/train-search");
			//Maximize the browser
			driver.manage().window().maximize();
			
			//current Active window
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			String title = driver.getTitle();
			System.out.println("Parent:"+title);
			
			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> childWindow=new ArrayList<String>(windowHandles);
			driver.switchTo().window(childWindow.get(1));
			
			String title2 = driver.getTitle();
			System.out.println("Child:"+title2);
			
			
}
}
