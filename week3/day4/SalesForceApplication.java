package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceApplication {
public static void main(String[] args) {
	//to open chrome browser
	ChromeDriver driver=new ChromeDriver();
	//load the appliacatiopn url
	driver.get("https://qeagle-dev-ed.my.salesforce.com/");
	//Maximize the Browser
	driver.manage().window().maximize();
	//Add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//Entern the username
	driver.findElement(By.xpath("//div[@id='username_container']/input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	//enter the password
	driver.findElement(By.xpath("//form[@id='login_form']/input[@id='password']")).sendKeys("Testleaf$321");
	
	//click on login button
	driver.findElement(By.xpath("(//form[@id='login_form']/input)[2]")).click();
	
	
	
}
}
