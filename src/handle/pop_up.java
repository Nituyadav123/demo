package handle;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up {

	public static void main(String[] args) {

		System.setProperty("", "");
		WebDriver D = new ChromeDriver();
		D.get("http://localhost:8888/");

		D.findElement(By.name("user_name")).sendKeys("admin");
		D.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		
		// "http://Atlassian.com/");
//driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

}
