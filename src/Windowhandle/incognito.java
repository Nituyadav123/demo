package Windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class incognito {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions driver = new ChromeOptions();
		driver.addArguments("incognito");
		driver.setExperimentalOption("excludeSwitches", new String[] { "enable - automation" });
		driver.setHeadless(false);
		ChromeDriver objChrome = new ChromeDriver(driver);
		objChrome.get("http://localhost:8888/");
		objChrome.findElement(By.name("user_name")).sendKeys("admin");
		objChrome.findElement(By.name("user_password")).sendKeys("admin");
		objChrome.findElement(By.name("Login")).click();
		objChrome.findElement(By.linkText("Marketing")).click();
		objChrome.findElement(By.xpath("//a[text()='Documents']")).click();
		objChrome.findElement(By.xpath("img[@title=\"Create Document...\"]")).click();
		new Select(objChrome.findElement(By.name("filelocationtype"))).selectByValue("I");
		objChrome.findElement(By.xpath("//input[@id=\"filename_I__\"]"))
				.sendKeys("C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file");

	}

}
