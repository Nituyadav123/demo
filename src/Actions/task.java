package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import URL.WebElement;

public class task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Atlassian.com/");
//driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		List<org.openqa.selenium.WebElement> vDriverobj = driver.findElements(By.xpath("//input[@name=\"Login\"]"));
//		for (int i = 0; i < vDriverobj.size(); i++) {
//			WebElement xxElement = (WebElement) vDriverobj.get(i);
//			String ggString = ((org.openqa.selenium.WebElement) xxElement).getText();
//			System.err.println("xxElemenet");
//		}TLASSIAN.

	}

}
