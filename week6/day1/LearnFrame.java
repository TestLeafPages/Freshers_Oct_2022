package week6.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) {
	//To open the Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://leafground.com/frame.xhtml");
	    //Maximize the browser
		driver.manage().window().maximize();
		//controll move to frame
		//driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		
		String text = frame1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();

}
}
