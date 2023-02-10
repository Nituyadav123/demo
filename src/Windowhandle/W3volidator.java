package Windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import net.bytebuddy.asm.Advice.This;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class W3volidator {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		
////		driver.get("https://W3validator.com");
//		driver.get("https://validator.w3.org/#validate_by_input");
//		String pageSourchCode=driver.getPageSource();
//		System.out.println(pageSourchCode);
////		driver.findElement(By.xpath("//textarea[@id=\"fragment\"]")).sendKeys("This is good application ");
//		String textToType="this is good application";
//		JavascriptExecutor obJ=(JavascriptExecutor)driver;
//		WebElement boxElement=driver.findElement(By.xpath("//textarea[@id=\"fragment\"]"));
//	obJ.executeScript("arguments[0].value='"+boxElement+"'",boxElement);
////		driver.quit();
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		WebElement webname = driver.findElement(By.name("user_name"));
		webname.click();
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.click();
		webpass.sendKeys("admin");

		driver.findElement(By.name("Login")).click();
		String textToType = driver.getPageSource();
		System.out.println(textToType);

		driver.get("https://validator.w3.org/");

		driver.findElement(By.xpath("//a[@href=\"#validate_by_input\"]")).click();
		driver.findElement(By.xpath("//textarea[@id=\"fragment\"]")).sendKeys(
				"<script type=\"text/javascript\" src=\"include/js/clock.js\"></script><div id=\"theDate\" class=\"datestyle\" style=\"color: rgb(0, 0, 0); top: 142px; left: 0px;\">November 28");
		driver.findElement(By.xpath("(//a[text()='Check'])[3]")).click();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].value='" + textToType + "'", text);
		String hhString = driver.findElement(By.xpath("//strong[text()='Error']")).getText();
		System.out.println(hhString);
	}

}
