package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
//	ChromeDriver driver=new ChromeDriver();
//	
//	driver.get("http://localhost:8888");
//	
//	driver.findElement(By.name("username")).sendKeys("admin");
//	driver.findElement(By.name("userpassword")).sendKeys("admin",Keys.ENTER);
//
	WebDriver driver = new ChromeDriver();

	driver.get("http://localhost:8888/");

	WebElement webname = driver.findElement(By.name("user_name"));
	webname.sendKeys("admin");

	WebElement webpass = driver.findElement(By.name("user_password"));
	webpass.sendKeys("admin");

	driver.findElement(By.name("Login")).click();

	List<WebElement> link = driver.findElements(By.tagName("a"));
	System.out.println(link.size());

	List<WebElement> link1 = driver.findElements(By.xpath("//a"));
	System.out.println(link1.size());

	List<WebElement> frame = driver.findElements(By.xpath("//frame"));
	System.out.println(frame.size());

	List<WebElement> frame1 = driver.findElements(By.tagName("frame"));
	System.out.println(frame1.size());
		
	}

}
