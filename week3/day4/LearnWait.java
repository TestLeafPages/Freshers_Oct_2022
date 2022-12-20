package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {
public static void main(String[] args) {
	//to open chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the applicationd url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username as democsr
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		//enter  the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login button
		driver.findElement(By.className("decorativeSubmit12232")).click();
}
}
