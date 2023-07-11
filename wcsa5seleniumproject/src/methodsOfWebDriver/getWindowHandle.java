package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);

	String parenthandle = driver.getWindowHandle();
	System.out.println("adress of parenthandle:"+parenthandle);
	//launch the child window 
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Thread.sleep(2000);
	//get the address of child window 
	String childhandle = driver.getWindowHandle();
	System.out.println("adress of child handle:"+childhandle);
	
	// get the address of child window only 
	Set<String> allHandles = driver.getWindowHandles();
	
	//read address by using looping statements 
	for(String al:allHandles)
	{
		System.out.println(al);
	
	}
		
		

	}

}
