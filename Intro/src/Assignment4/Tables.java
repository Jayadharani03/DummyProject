package Assignment4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Total row
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		//total column
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		//Print the 2 row
		List<WebElement> printdata=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		
		for(int i=0;i<printdata.size();i++)
		{
			System.out.println(printdata.get(i).getText());
			
		}
	
		
		
		
		
		
	
	}

}
