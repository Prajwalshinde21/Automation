package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException, InterruptedException {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.manage().window().maximize();
	cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	cdriver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	
	File src = cdriver.getScreenshotAs(OutputType.FILE);
	File desctination = new File("./ScreenShot/ScreenShot1.png");
	
	Files.copy(src, desctination);
	
	
	
	
	

	}

}
