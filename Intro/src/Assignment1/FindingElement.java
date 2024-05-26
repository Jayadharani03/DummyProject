package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Jaya dharani");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("jaya07081998@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("jaya");
		driver.findElement(By.cssSelector("div[class='form-check'] label")).click();
		driver.findElement(By.xpath("//label[text()='Gender']")).click();
		WebElement drop=driver.findElement(By.cssSelector("div select[id='exampleFormControlSelect1']"));
		Select dropdown=new Select(drop);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']/following-sibling::label")).click();
		driver.findElement(By.xpath("//label[@for='dateofBirth']/following-sibling::input")).sendKeys("07-08-1998");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		
		
		
		
		
	}

}
