package URL;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.page.Page.GetAppIdResponse;

import graphql.PublicApi;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class godaddy {

	public static void main(String[] args) {
//		name();
		name1();
		name2();
		name3();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.godaddy.com");
//
//		driver.manage().window().maximize();
//		driver.close();
//	}
//
//	public static void name() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.godaddy.com");
//
//		driver.manage().window().maximize();
//		String objString= driver.getTitle();
//		System.out.println(objString);
//		
//		
//	  String obj=driver.getCurrentUrl();
//		System.out.println(obj);
//		driver.close();
//		
	}

	public static void name1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com");

		driver.manage().window().maximize();
//		String obj1 = driver.getTitle();
//		System.out.println(obj1);
//		if (obj1.equalsIgnoreCase("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN")) {
//			System.out.println("get title is  pass");
//		} else {
//			System.out.println(" get title is fail");
			
			String obj=driver.getCurrentUrl();
			System.out.println(obj);
			if (obj.equalsIgnoreCase("https://www.godaddy.com/en-in")) {
				System.out.println("Get URL Is pass");
			}else {
				System.out.println("get url is fail");
			}
		String obj3=	 driver.getPageSource();
		System.out.println(obj3);
	if (obj3.equalsIgnoreCase(obj3)) {
		
	} else {

		}
		
			driver.close();
		}
	public static void name2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com");
	}
		public static void name3() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.godaddy.com");
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}}

