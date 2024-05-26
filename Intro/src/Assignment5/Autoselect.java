package Assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autoselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for (WebElement country : countries) {
			if (country.getText().equalsIgnoreCase("India")) {
				country.click();
				Thread.sleep(2000);
				String update = driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
				Assert.assertEquals(update, "India");
				break;
			}
		}

	}

}
