package week6.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckbox {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	
	List<WebElement> text = driver.findElements(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-unchecked')]/label"));
	
	for (int i = 0; i < args.length; i++) {
		String text2 = text.get(i).getText();
		System.out.println(text2);
	}
	
	
	
}
}
