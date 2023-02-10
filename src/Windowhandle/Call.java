package Windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\projectfile\\file\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	driver.get("https://flipkart.com/");
	driver.navigate().to("http://localhost:8888/");
	

	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
	driver.findElement(By.name("Login")).click();		
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
