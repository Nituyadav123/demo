package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\anshi\\eclipse-workspace\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		List<WebElement> bbElement=driver.findElements(By.tagName("a"));
		for (WebElement webElement : bbElement) {
			
		}
		driver.findElement(By.linkText("Sales")).click();
		Thread.sleep(0000);
		
	    driver.findElement(By.xpath("//input[@id='35']")).click();
		driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click(); ///for click on delete
		Thread.sleep(5000);
	    driver.switchTo().alert().accept(); /// for OK click
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
