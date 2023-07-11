package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		// handle hidden division POP UP
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		// identify frame by using xpath
		 
		// handle the frame by switch to control by
		driver.switchTo().frame(5);
		//driver.findElement(By.id("chat-icon")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		
		
		
		
		
		
		
		


	}

}
