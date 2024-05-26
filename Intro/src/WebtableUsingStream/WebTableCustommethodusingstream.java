package WebtableUsingStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCustommethodusingstream {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("th:nth-child(1)")).click();
		List<String> price;
		do {

			List<WebElement> l1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = l1.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getVeggie(s))
					.collect(Collectors.toList());
			price.forEach(n -> System.out.println(n));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}

		} while (price.size() < 1);

	}

	private static String getVeggie(WebElement s) {
		String d = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return d;
	}

}
