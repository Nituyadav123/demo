package Windowhandle;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8888/");
////		String pageSourcecodeString=driver.getPageSource();
////		System.out.println(pageSourcecodeString);
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.name("Login")).click();
//
//		driver.findElement(By.xpath("//a[text()='Marketing']")).click();

//		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
//		List<WebElement> getText=driver.findElements(By.xpath("//td[contains(text(),'CAM')]"));
//		Set<String> setTree=new TreeSet<>();
//		for (int i = 0; i <getText.size(); i++) {
//			WebElement objw=getText.get(i);
//			System.out.println(objw.getText());
//			setTree.add(objw.getText());
//			
//		}
//		System.out.println("=====");
//		for(String string:setTree) {
//			System.out.println(string);
//		}
//		driver.findElement(By.linkText("Accounts")).click();
//
//		List<WebElement> AcNumber = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
//		TreeSet<String> AcNumberse = new TreeSet<String>();
//		for (int i = 0; i < AcNumber.size(); i++) {
//			WebElement objWeb = AcNumber.get(i);
//			String getpricevalue = objWeb.getText();
//			System.out.println(i + " = " + getpricevalue);
//			AcNumberse.add(getpricevalue);
//		}
//		for (String st : AcNumberse) {
//			System.out.println(st);
//
//			if (AcNumber.equals(AcNumberse)) {
//				System.out.println("pass");
//			} else {
//				System.out.println("failed");
//			}
//		}

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		WebElement webname = driver.findElement(By.name("user_name"));
		webname.clear();
		webname.sendKeys("admin");

		WebElement webpass = driver.findElement(By.name("user_password"));
		webpass.clear();
		webpass.sendKeys("admin");

		driver.findElement(By.name("Login")).click();

		driver.findElement(By.linkText("Marketing")).click();

		driver.findElement(By.linkText("Accounts")).click();

		List<WebElement> AcNumber = driver.findElements(By.xpath("//td[contains(text(),'ACC')]"));
		TreeSet<String> AcNumberse = new TreeSet<String>();
		for (int i = 0; i < AcNumber.size(); i++) {
			WebElement objWeb = AcNumber.get(i);
			String getpricevalue = objWeb.getText();
			System.out.println(i + "= " + getpricevalue);
			AcNumberse.add(getpricevalue);
			for (int j = 0; j < AcNumber.size(); j++) {
				WebElement objWeb1 = AcNumber.get(i);
				String getpricevalue1 = objWeb1.getText();
				int count = 0;
				for (String st : AcNumberse) {
					count++;
					if (count == (i + 1)) {
						if (st.equals(getpricevalue1)) {
							System.out.println(getpricevalue1);
							System.out.println("pass");
						} else {
							System.out.println(st);
							System.out.println("Failed");
						}
					}
				}
			}
		}

	}

}
