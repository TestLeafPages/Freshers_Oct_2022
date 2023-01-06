package week6.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
public static void main(String[] args) {
	//Launch ChromeDriver
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://erail.in/");
	//Maximize the browser
	driver.manage().window().maximize();
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//enter from station
	WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	fromStation.clear();
	fromStation.sendKeys("MAS",Keys.TAB);
	
	//enter to location
	WebElement toStation = driver.findElement(By.id("txtStationTo"));
	toStation.clear();
	toStation.sendKeys("MDU",Keys.TAB);
	
	//click on sort date check box
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
//	//to get the row count
//	List<WebElement> trainRow = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
//	
//	System.out.println(trainRow.size());
	
	//to get the train names
	List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a//td"));
	System.out.println(trainNames.size());
	for (int i = 0; i < trainNames.size(); i++) {
		String text = trainNames.get(i).getText();
		System.out.println(text);
	}
	 
	
	
	
	
	
}
}
