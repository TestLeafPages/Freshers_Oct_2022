package week6.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class MergeLead {
	public static void main(String[] args) throws InterruptedException {
		//to open chrome browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//load the applicationd url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the username as democsr
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter  the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clickon leads tap
		driver.findElement(By.linkText("Leads")).click();
		
		//click on mergelead button
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		//Store the current Window as parentWindow
		String parentWindow = driver.getWindowHandle();
		//click on FromLead image icon
		driver.findElement(By.xpath("(//span[text()='From Lead']/following::img)[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<String>(windowHandles);
		//controll move to child window
		driver.switchTo().window(childWindow.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		
		driver.switchTo().window(parentWindow);
		
		
		
		
	}
}
