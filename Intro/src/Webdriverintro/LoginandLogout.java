package Webdriverintro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("54875");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(	driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@rha.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
