package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class tolaunchchromebrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	new ChromeDriver();
}
}
