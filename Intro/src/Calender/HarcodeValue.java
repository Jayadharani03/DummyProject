package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HarcodeValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String monthNumber="6";
		String date="15";
		String year="2027";
		String[] expected={monthNumber,date,year};
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//abbr[text()='June']")).click();
		driver.findElement(By.xpath("//abbr[text()='15']")).click();
		
		
		List<WebElement> actual=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input react-date-picker__inputGroup"));
		for(int i=0;i<actual.size();i++)
		{
			System.out.println(actual.get(i).getAttribute("value"));
			Assert.assertEquals(actual.get(i).getAttribute("value"), expected[i]);
			
		}
		

	}

}
