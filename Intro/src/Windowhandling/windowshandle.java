package Windowhandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set <String> windows=driver.getWindowHandles();
		Iterator <String>it=windows.iterator();
		String parentId =it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		
		String mailId=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(mailId);
		
		
		
		
		
		
		
	}

}
