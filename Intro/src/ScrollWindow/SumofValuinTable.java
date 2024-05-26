package ScrollWindow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SumofValuinTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=2000");
		List<WebElement> d=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum=0;
		for(int i=0;i<d.size();i++)
		{
			
				int	values=Integer.parseInt(d.get(i).getText());
				sum=sum+values;
			
		}
		System.out.println(sum);
		String cost=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		int cost4=Integer.parseInt(cost.split(":")[1].trim());
		System.out.println(cost4);
		Assert.assertEquals(sum, cost4);
		
		
		
		
				
	}

}
