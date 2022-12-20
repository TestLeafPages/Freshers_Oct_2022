package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	//to open chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the applicationd url
		driver.get("https://www.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on Create new account button
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arun");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='lastname'")).sendKeys("RK");
		
		//close the current browser
		driver.close();
}
}
