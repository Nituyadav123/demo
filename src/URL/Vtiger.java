package URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
//		String pageSourcecodeString=driver.getPageSource();
//		System.out.println(pageSourcecodeString);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("My Home Page")).click();
		driver.findElement(By.linkText("")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
