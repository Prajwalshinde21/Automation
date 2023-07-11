package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;



public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// By using EventFiringWebDriver 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
	    EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	    File src1 = efw.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./ScreenShot/ScreenShotWay5.png");
        Files.copy(src1, destination);
        

	}

}
