package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions a=new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.cssSelector("//a[@id='nav-link-accountList']"))).build().perform();
		
		
		
	}

}
