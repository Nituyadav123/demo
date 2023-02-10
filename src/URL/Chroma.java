package URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chroma {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("")).sendKeys("admin");
		driver.findElement(By.xpath("")).sendKeys("admin");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
