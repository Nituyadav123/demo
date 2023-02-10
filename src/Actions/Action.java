package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anshi\\eclipse-workspace\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		// WebElement weMarketingLink=
		// driver.findElement(By.xpath("//a[text()='Marketing']"));
		Actions actionsobj = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//b[contains(text(),'Top Accounts')]"));
		WebElement wb1 = driver.findElement(By.xpath("//b[contains(text(),'Pending Activities')]"));

		// first method with drag and drop

		actionsobj.dragAndDrop(wb, wb1).build().perform();

		// second method to drag ang droop with the move to element, and click and hold
		// actionsobj.moveToElement(wb).clickAndHold().moveToElement(wb1).release().build().perform();
		Actions objactions = new Actions(driver);
		WebElement weMarketing = driver.findElement(By.linkText("Marketing"));
		objactions.moveToElement(weMarketing).build().perform();
		// driver.findElement(By.linkText("")).click();
		driver.findElement(By.linkText("Leads")).click();
		List<WebElement> weLeadsTable = driver.findElements(By.xpath("//tr[@bgcolor='white']"));
		for (int i = 0; i < weLeadsTable.size(); i++) {
			weLeadsTable = driver.findElements(By.xpath("//tr[@bgcolor='white']"));
			WebElement table = weLeadsTable.get(i);
			String tab = table.getText();
			System.out.println(tab);
			if (tab.contains("smith")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[text()='del'])[1]")).click();
				Thread.sleep(2000);

				driver.switchTo().alert().accept(); /// for popup click or ok
				// driver.switchTo().alert().dismiss(); /// for popup cencle
			} else
				System.out.println(tab);
		}

	}

}
