package URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
				driver.get("https://meesho.com/");
			driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("shirt");	
				driver.findElement(By.xpath("(//div[@class=\"SingleLine__SingleLineStyled-xjyutt-0 eWepTT\"])[1]")).click();
				
				
		
		
		
		
		
		
	}

}
