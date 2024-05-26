package Webdriverintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
Assert.assertFalse(driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

	}

}
