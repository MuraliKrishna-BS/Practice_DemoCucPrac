package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	 static WebDriver Driver;
	
	
	public static WebDriver LunchBrowser() {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--Start-Maximized");
		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		Driver = new ChromeDriver(op);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return Driver;
	}
	public static WebDriver getDriver() {
		return Driver;
	}
	
	public void TearDown() {
		
		Driver.quit();
		
	}

}
