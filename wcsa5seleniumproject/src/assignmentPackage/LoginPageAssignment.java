package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		// to identify webelement we use loactors 
		driver.findElement(By.id("id_userLoginId")).sendKeys("tanmay@123gmail.com");// Username Textbox
		driver.findElement(By.id("id_password")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		
		
		
	}

}
