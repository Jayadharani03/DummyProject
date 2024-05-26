package Statuscode;

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

public class Statuscode {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//		
//		HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("Head");
//		conn.connect();
//		int respcode=conn.getResponseCode();
//		System.out.println(respcode);
		
		List <WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link:links)
		{
			String url1=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url1).openConnection();
			con.setRequestMethod("HEAD");
			int status= con.getResponseCode();
			System.out.println(status);
			if(status>400)
			{
				System.out.println("The broken link is "+link.getText()+" ");
			}
			
		}
		
		

	}

}
