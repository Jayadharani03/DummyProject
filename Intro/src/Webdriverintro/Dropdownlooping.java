package Webdriverintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownlooping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
		driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		i++;
		}
		driver.findElement(By.cssSelector("input[class='buttonN']")).click();
		
		
		
		
	}

}
