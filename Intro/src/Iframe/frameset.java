package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target=driver.findElement(By.cssSelector("div[id='droppable']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
