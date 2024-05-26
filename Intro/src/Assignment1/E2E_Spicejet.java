package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class E2E_Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(
				By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[text()='Agra']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOM']/parent::div/div/parent::div/parent::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();
		driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style");
		System.out.println(driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style"));
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n'] //div[text()='round trip']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
		} else {
			System.out.println("Its not enabled");
		}
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']/div//div[text()='1 Adult']"))
				.click();
		int i = 1;
		while (i < 5) {
			driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz']/div[3])[1]")).click();
			i++;
		}
		driver.findElement(By.xpath("//div[text()='Currency']/following-sibling::div")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();

		driver.findElement(By.xpath("//div[text()='Students']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Search Flight']/parent::div")).click();

	}

}
