package Webdriverintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Bra");
		 Thread.sleep(3000);
		 List <WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item /a']"));
		
		 for(WebElement option:options)
		 {
			 if(option.getText().equalsIgnoreCase("Brazil"))
			 {
				 System.out.println(option.getText());
				 option.click();
				 break;
				 
			 }
		 }
		 
	}

}
