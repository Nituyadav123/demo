package handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://localhost:8888/");
//		driver.findElement(By.xpath("")).sendKeys("");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anshi\\eclipse-workspace\\selenium\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/iframes/");
		 driver.manage().window().maximize();
				
				System.out.println(driver.findElement(By.xpath("//p[contains(text(),'I am an iframe.')]")).getText());
				driver.switchTo().frame("frame1");
//		   	    driver.switchTo().frame(0);
//				driver.switchTo().frame(null);
//				driver.switchTo().frame(null);
			
//				System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]")).getText());
//				
				System.out.println(driver.findElement(By.xpath("//p[contains(text(),'What you do with that power is entirely up to you.')]")).getText());
				
				System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Support the Selenium Project')]")).getText());
			
				
				driver.switchTo().defaultContent(); //back on main page
			    System.err.println(driver.findElement(By.xpath("//a[@rel=\"home\"]")).getText());

			}

		


	

		
		
	}


