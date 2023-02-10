package handle;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		try {

			driver.findElement(By.name("username")).sendKeys("admin");
		} catch (NoSuchElementException e) {
			System.out.println("plz check the code");
			driver.findElement(By.name("user_name")).sendKeys("admin");
		}
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//		driver.findElement(By.name("Campaigns")).click();
//
//		driver.findElement(By.xpath("//tr[@id=\"row_124\"]")).click();
//		driver.findElement(By.xpath("(//input[@value=\"Delete\"])[1]")).click();
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//input[@value=\"Delete\"])[1]")).click();
		driver.switchTo().alert().accept();
	}

}
