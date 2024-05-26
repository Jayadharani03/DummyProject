package Webdriverintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ComparetextusingAssert {
	public static void main(String[] args) throws InterruptedException {
		String name="Jaya";
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:/rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
		
		
	}

}
