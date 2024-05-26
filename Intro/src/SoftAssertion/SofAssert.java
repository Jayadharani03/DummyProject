package SoftAssertion;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class SofAssert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		SoftAssert a= new SoftAssert();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link:links)
		{
			String url1=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url1).openConnection();
			con.setRequestMethod("HEAD");
			int status= con.getResponseCode();
			System.out.println(status);
			a.assertTrue(status>400, "The broken link is "+link.getText()+" ");
			
			
		}
		
		a.assertAll();
	}

}
