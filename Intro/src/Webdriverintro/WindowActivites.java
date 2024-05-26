package Webdriverintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivites {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		//driver.navigate().forward();
	}

}
