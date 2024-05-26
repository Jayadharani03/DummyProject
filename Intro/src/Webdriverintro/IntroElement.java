package Webdriverintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//ID
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//NAME
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//CLASS 
		driver.findElement(By.className("signInBtn")).click();
		//Cssselector using classname syntax
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		//LinkText syntax
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//Xpath Syntax
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		// cssselector syntax
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@e.com");
		//Xpath using index syntax
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//Cssselector using index syntax
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		//Xpath using travers from parent to child
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8778605223");
		//cssselector using classname syntax
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//cssselector using parent to child
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//xpath and parent to child syntax
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		//cssselector using ID syntax
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//cssselector using regular experessions
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//id syntax
		driver.findElement(By.id("chkboxOne")).click();
		//xpath regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		
		
		
		
	
		
		
			
		
		
	}

}
