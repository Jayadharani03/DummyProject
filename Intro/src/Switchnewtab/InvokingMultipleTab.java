package Switchnewtab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		String Parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		driver.get("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(s);

	}

}
