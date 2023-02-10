package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

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
		boolean jkp = namebox.isEnabled();
		if (jkp == true) {
			System.out.println("User name box is enable");
		} else {
			System.out.println("User name box is not enable");
		}

		WebElement nameboxx = driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean jkhh = nameboxx.isDisplayed();
		if (jkhh == true) {
			System.out.println("password box is visibal");
		} else {
			System.out.println("password box is not visibal");
		}
		boolean jko = nameboxx.isEnabled();
		if (jko == true) {
			System.out.println("password box is enable");
		} else {
			System.out.println("password  box is not enable");
		}

		WebElement colourbox = driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
		boolean j = colourbox.isDisplayed();
		if (j == true) {
			System.out.println("colour box is visibal");
		} else {
			System.out.println("colour box  is not visibal");
		}
		boolean jku = colourbox.isEnabled();
		if (jku == true) {
			System.out.println("colour box is enable");
		} else {
			System.out.println("colour box  is not enable");
		}

		WebElement language = driver.findElement(By.xpath("//select[@name=\"login_language\"]"));
		boolean jj = language.isDisplayed();
		if (jj == true) {
			System.out.println("language box is visibal");
		} else {
			System.out.println("lauguage box  is not visibal");
		}
		boolean jk = language.isEnabled();
		if (jk == true) {
			System.out.println("lauguage box is enable");
		} else {
			System.out.println("lauguage box  is not enable");
		}
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name=\"Login\"]"));
		boolean login = loginbutton.isDisplayed();
		if (login == true) {
			System.out.println("loginbutton box is visibal");
		} else {
			System.out.println("loginbutton box  is not visibal");
		}
		boolean loginbox = namebox.isEnabled();
		if (loginbox == true) {
			System.out.println("loginbutton box is enable");
		} else {
			System.out.println("loginbutton box  is not enable");
		}
		WebElement nmElement = driver.findElement(By.xpath("//input[@name='user_name']"));
		nmElement.sendKeys("admin");
		String namevalue = nmElement.getAttribute("value");
		if (namevalue.equalsIgnoreCase(namevalue)) {
			System.out.println("user name is success");
		} else {
			System.out.println("user name is not success");
		}
		WebElement passElement = driver.findElement(By.name("user_password"));
		passElement.sendKeys("admin");
		String evalue = passElement.getAttribute("value");
		if (evalue.equalsIgnoreCase(evalue)) {
			System.out.println("pass name is success");
		} else {
			System.out.println("pass name is not success");
		}
		driver.findElement(By.name("Login")).click();
		String ttlString = driver.getTitle();
		System.out.println(ttlString);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("t");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("f");
		driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();

		String popupString = driver
				.findElement(By.xpath("//font[contains(text(),'You must specify a valid username and password.')]"))
				.getText();
		if (popupString.contains("Y ou must specify a valid username and password.")) {
			System.out.println("popup is correct");
		} else {
			System.out.println("popup is not correct");

		}

	}
}
