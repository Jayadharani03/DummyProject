package Assignement4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdatapassing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String getcheckbox = driver.findElement(By.xpath("//input[@id='checkBoxOption3']/parent::label")).getText();
		System.out.println(getcheckbox);
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(drop);
		s.selectByVisibleText(getcheckbox);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(getcheckbox);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		// Hello Options, share this practice page and share your knowledge
		String[] gettext = text.split(",");
		String finaltext = gettext[0].split(" ")[1];
		if (getcheckbox.equals(finaltext)) {
			System.out.println("Its Matching");
		}

		driver.switchTo().alert().accept();

	}

}
