package URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8888/");
		driver.get("https://youtube.com");
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("song");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

	}

}
