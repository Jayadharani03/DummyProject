package Webdriverintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Getworddynamically {
	public static void main(String[] args) throws InterruptedException {
		String name="Jaya";
		//System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.geckodriver.driver","C:/Users/jaya0/Downloads/geckodriver-v0.34.0-win-aarch64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String password=getpassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:/rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
		
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray=passwordtext.split(" '");
		String password=passwordarray[1].split("'")[0];
		return password;
		
		
		
	}
	
	
	

}
