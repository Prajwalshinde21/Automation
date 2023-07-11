package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Login']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1965698858");
    
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prajwal@123");
   
    
    
    
    
    
	}

}
