package WebtableUsingStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("th:nth-child(1)")).click();
		List <WebElement> l1=driver.findElements(By.cssSelector("tbody tr td:nth-child(1)"));
		l1.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		List <String>Orginal= l1.stream().map(s->s.getText()).collect(Collectors.toList());
		List <String>sortList=Orginal.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(Orginal.equals(sortList));
		
		
	}

}
