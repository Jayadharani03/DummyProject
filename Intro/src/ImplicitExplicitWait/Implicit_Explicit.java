package ImplicitExplicitWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait ui=new WebDriverWait(driver,Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		

		String[] itemNeeded = { "Cauliflower", "Cucumber", "Tomato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		ui.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		ui.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		ui.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemNeeded) {
		int j = 0;
		List<WebElement> productid = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productid.size(); i++) {
			String[] name = productid.get(i).getText().split("-");
			String formattedname = name[0].trim();
			List itemAddList = Arrays.asList(itemNeeded);// why here error

			if (itemAddList.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formattedname);
				System.out.println("its clicked");
				if (j == 3) {
					break;
				}
			}
		}
	}

}
