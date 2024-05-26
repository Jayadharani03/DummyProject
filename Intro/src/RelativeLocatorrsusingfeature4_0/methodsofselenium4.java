package RelativeLocatorrsusingfeature4_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class methodsofselenium4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Above method
		
		WebElement edit=driver.findElement(By.xpath("//input[@name='name']"));
		String d=driver.findElement(with (By.tagName("label")).above(edit)).getText();
		System.out.println(d);
		
		//Below Method
		WebElement f=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with (By.tagName("input")).below(f)).click();
		
		
		//Left method
		
		//label[contains(text(),'Check me out if you Love IceCreams')]
		WebElement c=driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams')]"));
		driver.findElement(with (By.tagName("input")).toLeftOf(c)).click();
		
		//Right method
		WebElement r=driver.findElement(By.id("inlineRadio2"));
		driver.findElement(with (By.tagName("label")).toRightOf(r)).click();
		
		
		
		
		
		
	}		

}
