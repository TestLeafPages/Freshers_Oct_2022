package week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {
public static void main(String[] args) {
	//To launch Chrome Browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/select.xhtml;jsessionid=node01h96rsm65udfj19pcizvfodmks470639.node0");
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	
	
}
}
