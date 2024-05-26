package GetLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
	}

}
;;