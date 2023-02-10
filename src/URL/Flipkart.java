package URL;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nituy\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Shirt");
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		List<org.openqa.selenium.WebElement> shirtname = driver
//				.findElements(By.xpath("(//div[@class=\"_2WkVRV\"])[1]"));
//
//		List<WebElement> shirtprice = (List<WebElement>) driver
//				.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]"));
////		List<org.openqa.selenium.WebElement> shirtname = driver
////				.findElements(By.xpath("(//div[@class=\"_2WkVRV\"])[1]"));
//		
//		
//		
//		for (int i = 0; i <shirtname.size(); i++) {
//		WebElement productName=(WebElement) shirtname.get(i); 
//		WebElement productprice=(WebElement) shirtprice.get(i);
//		 ((org.openqa.selenium.WebElement) productName).getText();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(" Sumsung Mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		
////	List<WebElement> MobileName=driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]")) ;
//	List<WebElement>Mobileprice=driver.findElements(By.xpath("(//div[@class=\"_30jeq3 _1_WHN1\"])[1]"))	; 
//for (int j = 0; j <Mobileprice.size(); j++) {
////		WebElement	productName=MobileName.get(j);	
//		WebElement productprice=Mobileprice.get(j);
////		String MoblieText = productprice.getText();
//		String  MolilePriceText = productprice.getText();
//		System.out.println();
////		}
//	}
	List <WebElement> mobileprice= driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
for (int i = 0; i < mobileprice.size(); i++) {
	driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
	WebElement productprice=mobileprice.get(i);
	System.out.println( productprice.getText());
}
}}
