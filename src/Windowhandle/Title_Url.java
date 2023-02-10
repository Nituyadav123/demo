package Windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
//		String pageSourcecodeString=driver.getPageSource();
//		System.out.println(pageSourcecodeString);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='Feedback']")).click();

		driver.findElement(By.xpath("//a[text()='Help']")).click();
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		Set<String> handleValue = driver.getWindowHandles();
		System.out.println(handleValue);
		for (String handle : handleValue) {
			WebDriver matchValue = driver.switchTo().window(handle);
			String getTitel = driver.getTitle();
			// System.out.println(getTitel);
			if (getTitel.equalsIgnoreCase("wiki.vtiger.com") || getTitel.equalsIgnoreCase("www.vtiger.com")) {
				driver.close();
			}
		}
	}

}
