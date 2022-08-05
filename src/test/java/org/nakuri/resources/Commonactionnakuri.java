package org.nakuri.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.nakuri.objectrepository.NakuriPageObj;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactionnakuri {
public static WebDriver driver;
	
	public void launch() {
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 options.addArguments("disable-popup-blocking");
		 driver = new ChromeDriver(options);
		 driver.get("https://www.naukri.com");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
	public void windowsHandling() {
		
		 String parent = driver.getWindowHandle();
			
			Set<String> child = driver.getWindowHandles();
			for (String x : child) {
				
				if(!x.equals(parent)){
					driver.switchTo().window(x);
					System.out.println("window switched");
			}
				}
 }
	public  void robokey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
