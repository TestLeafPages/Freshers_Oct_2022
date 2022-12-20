package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnXpath {
public static void main(String[] args) {
	
	//to open chrome browser
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//load the applicationd url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	//enter the username as democsr
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
	//Enter the password as crmsfa
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	//click login button
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//click crmsfa link
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	//click leads tap
	
	
	
	
	
	
}
}
