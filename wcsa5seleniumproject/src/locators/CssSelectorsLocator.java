package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("virat kohli");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("#chase_Master");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	}

}
