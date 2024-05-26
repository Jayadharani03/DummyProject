package Webdriverintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Radiobutton_checkelementenabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com");
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
		driver.findElement(By.xpath("//div/div[2]//div[text()='Return Date']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
		if(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("9"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
		

	}

}
