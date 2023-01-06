package week6.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable2 {
	public static void main(String[] args) {
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
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		System.out.println(findElements.size());
		
		for (int i = 2; i < findElements.size(); i++) {
			String text2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]/a")).getText();
			System.out.println(text2);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		List<WebElement> findElements1 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a"));
//		for (int i = 0; i < findElements1.size(); i++) {
//			String text = findElements1.get(i).getText();
//			System.out.println(text);
//			
//		}
		
		
		
	}

}
