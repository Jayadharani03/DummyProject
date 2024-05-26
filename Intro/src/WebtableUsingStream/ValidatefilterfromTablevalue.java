package WebtableUsingStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatefilterfromTablevalue {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Rice");

		List<WebElement> total = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> single = total.stream().filter(s -> s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(total.size(), single.size());

		List<String> price = single.stream().filter(s -> s.getText().contains("Rice")).map(amount -> getamount(amount))
				.collect(Collectors.toList());
		price.forEach(s -> System.out.println(s));

	}

	private static String getamount(WebElement amount) {
		String A = amount.findElement(By.xpath("//tr/td[3]")).getText();
		return A;
	}

}
