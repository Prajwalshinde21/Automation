package DataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public class Flib{
		
		
		//read the data from excel file and test the login page  
	 public String readExcelData(String excelpath, String sheetName,int rowCount,int cellCount) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.netflix.com/in/login");
			Thread.sleep(2000);
			
			Flib flib = new Flib();
			
			
			// to identify webelement we use loactors 
			driver.findElement(By.id("id_userLoginId")).sendKeys("tanmay@123gmail.com");// Username Textbox
			driver.findElement(By.id("id_password")).sendKeys("Automation");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
			return sheetName;
			
			
	      
	      
	      
		}

	}

}
