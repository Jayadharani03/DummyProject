package Handlingcart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofWebelementwithArray {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemneeded = {"Cauliflower","Cucumber","Tomato"};
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		List<WebElement> productid = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productid.size(); i++) {
			String[] name = productid.get(i).getText().split("-");
			String formattedname = name[0].trim();
			List itemlist = Arrays.asList(itemneeded);
			if (itemlist.contains(formattedname)) {
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
