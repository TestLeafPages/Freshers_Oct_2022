package week6.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) {
	//To open the Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01jy6ghei3ytcxlcpujlq9yxsi23365.node0");
	    //Maximize the browser
		driver.manage().window().maximize();
		
		//to click an alert button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//controll move to an alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		confirmAlert.click();
	//	Alert alert2 = driver.switchTo().alert();
	//	alert2.dismiss();
		
		WebElement promptAlert=driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promptAlert.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Oct 2022");
		alert3.accept();
		
		
		
		
		
		
		

}
}
