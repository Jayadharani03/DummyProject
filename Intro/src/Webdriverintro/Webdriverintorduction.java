package Webdriverintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverintorduction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096196#overview");
	driver.getTitle();
	driver.getCurrentUrl();
	driver.close();
		
//		System.setProperty("webdriver.geckodriver.driver","C:/Users/jaya0/Downloads/geckodriver-v0.34.0-win-aarch64/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096196#overview");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.close();
		
		

		
		
	}

}
