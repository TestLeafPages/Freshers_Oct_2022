package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchChromeBrowser {
public static void main(String[] args) {
	
	//to open chrome browser
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//load the applicationd url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	//enter the username as democsr
	driver.findElement(By.id("username")).sendKeys("DemoCsr");
	
	//enter  the password as crmsfa
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//click crmsfa link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//clickon leads tap
	driver.findElement(By.linkText("Leads")).click();
	//click on create lead button
	driver.findElement(By.partialLinkText("Create")).click();
	//select the source dropdown
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	Select sourceDropDown=new Select(source);
	
	//sourceDropDown.selectByVisibleText("Conference");
	
	//select by index
	sourceDropDown.selectByIndex(8);
}
}
