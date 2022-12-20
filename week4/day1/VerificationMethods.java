package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods {

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
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
		//click on submit button
		driver.findElement(By.name("submitButton")).click();
		
		//verify the page title
		String title="View Lead | opentaps CRM";
		String title2 = driver.getTitle();
		if(title.equals(title2)) {
			System.out.println("Page title is verified succesfully");
		}else {
			System.out.println("Page title is verified not succesfully");
		}
	}
}
