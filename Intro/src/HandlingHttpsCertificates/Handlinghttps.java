package HandlingHttpsCertificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handlinghttps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jaya0/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		
		
		

	}

}
