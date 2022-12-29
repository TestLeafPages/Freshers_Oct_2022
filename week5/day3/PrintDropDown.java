package week5.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDown {
public static void main(String[] args) {
	//To launch Chrome Browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/select.xhtml;jsessionid=node01h96rsm65udfj19pcizvfodmks470639.node0");
	
	//Maximize the browser
	driver.manage().window().maximize();
	
//	driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).click();
//	List<WebElement> ele = driver.findElements(By.xpath("//select[@class='ui-selectonemenu']/option"));
//	
//	for (int i = 0; i < ele.size(); i++) {
//		String text = ele.get(i).getText();
//		System.out.println(text);
//	}
	
	
	
	
	
	
	
	
	WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dropDown=new Select(ele);
	List<WebElement> options = dropDown.getOptions();
   for (int i = 0; i < options.size(); i++) {
	String text = options.get(i).getText();
	System.out.println(text);
}


}
}
