package Webdriverintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id *='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//Size of the Checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
