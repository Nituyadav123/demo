package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesIMP {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement namebox = driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean jkh = namebox.isDisplayed();

		if (jkh == true) {
			System.out.println("User name box is visibal");
		} else {
			System.out.println("User name box is not  visibal");
		}

		WebElement driver2 = driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean KK = driver2.isEnabled();
		if (KK == true) {
			System.out.println("User name box is enable");
		} else {
			System.out.println("User name box is not  enable");
		}

	}

}
