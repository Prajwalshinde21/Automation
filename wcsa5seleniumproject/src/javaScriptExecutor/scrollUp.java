package javaScriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    // to launch the web app
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(3000);
	    
	    // to perform scrolling operations
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
          Thread.sleep(2000);
          
          // to perform scroll down 
          jse.executeScript("window.scrollBy(0,550)");
          Thread.sleep(2000);
          
          // to perform scroll up
          jse.executeScript("window.scrollBy(0,-550)");
          
          
	}

}
