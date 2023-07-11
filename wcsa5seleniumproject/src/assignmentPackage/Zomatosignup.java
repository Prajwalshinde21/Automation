package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatosignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		// to click on signup link
		driver.findElement(By.linkText("sign up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("virat kohli");
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("indian");
		
		

	}

}
