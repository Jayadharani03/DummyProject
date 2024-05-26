package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
     int  e=driver.findElements(By.tagName("frame")).size();
     System.out.println(e);
	driver.switchTo().frame("frame-top");
	System.out.println(driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[2]")).getText());
     driver.switchTo().defaultContent();
     System.out.println(driver.getTitle());
     driver.switchTo().frame("frame-bottom");
     System.out.println(driver.findElement(By.xpath("//html//body")).getText());
     
     
     
     
    
		

	}

}
