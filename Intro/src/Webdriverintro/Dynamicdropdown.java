package Webdriverintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='BHO']")).click();
		//Using index
		//driver.findElement(By.xpath("(//option[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click();
		
		
		
		
	}

}
