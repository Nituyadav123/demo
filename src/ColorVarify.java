
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorVarify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\file\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Contacts")).click();
		String getColorofElement = driver.findElement(By.xpath("(//input[@value=\"Delete\"])"))
				.getCssValue("background-color");

		String getColorofText = driver.findElement(By.xpath("(//input[@value=\"Delete\"])[1]")).getCssValue("color");
		String color = Color.fromString(getColorofText).asHex();
		if (color.equals("#ffffff")) {
			System.out.println("Delete button Color is verified");
		} else {
			System.out.println("Delete button Color is not verified");
		}

	}

}
