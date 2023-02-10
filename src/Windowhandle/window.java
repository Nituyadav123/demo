package Windowhandle;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window {

	public static void main(String[] args) {
//
//		Set<String> listOBJ = new HashSet<String>();
//		listOBJ.add("abcd");
//		listOBJ.add("xyz");
//		listOBJ.add("mnop");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();

		WebDriver driver = new ChromeDriver(cp);
		String hndl = driver.getWindowHandle();

		driver.get("http://localhost:8888/");
		
		WebElement a = driver.findElement(By.name("user_name")); /// a - webELement object
		a.sendKeys("admin");
		By byPassword = By.name("user_password");
		WebElement pwdObj = driver.findElement(byPassword);
		pwdObj.sendKeys("admin");
		By byLogin = By.name("Login");
		WebElement loginButton = driver.findElement(byLogin);
		loginButton.click(); //// indexing

		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.linkText("About Us")).click();

		driver.findElement(By.linkText("Help")).click();

////		driver.findElement(By.name("description")).sendKeys(" It is a good application ");
//		Set<String> handleValueSet = driver.getWindowHandles();
//		for (String hndlValue: handleValueSet) {
//			driver.switchTo().window(hndlValue);
//			String title =driver.getTitle();
		Set<String> getValue=driver.getWindowHandles();
        for (String string:getValue) {
       	 driver.switchTo().window(string);///ek win
       	 String getTitle=driver.getTitle();
       	 System.out.println(getTitle);
       	 if(getTitle.equalsIgnoreCase(" ")) {
//       		 driver.findElement(By.name("description")).sendKeys("Hello this is good application");
//    	 }else 
//    		 if(getTitle.equalsIgnoreCase("Vtiger CRM -vtiger")) {
    		 break;
//       		 driver.close();
//       	 }else if(getTitle.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
//       		 driver.close();
//       	 }else if(getTitle.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
//       		 
//       		 driver.findElement(By.linkText("Marketing")).click();
       	 }
			
		}		
		

				
		

			
			
			
			
		}
	
	}


