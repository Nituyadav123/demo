package URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("http:localhost://8888");
 
 
	}

}
