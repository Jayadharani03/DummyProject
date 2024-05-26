package GetLinkText;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getlinkcountinfootersection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait u=new WebDriverWait(driver,Duration.ofSeconds(5));
		
				
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement ft=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ft.findElements(By.tagName("a")).size());
		
		//Check all thelink is working
		for(int i=1;i<ft.findElements(By.tagName("a")).size();i++)
		{
			
			String ClickOnEachLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ft.findElements(By.tagName("a")).get(i).sendKeys(ClickOnEachLink);
			Thread.sleep(5000);
			
		}
		Set <String> windows=driver.getWindowHandles();
		Iterator <String> it=windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
	}

}
