package utilclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static WebDriver launchApplication(){

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\udayc\\eclipse-workspace\\Procurewise\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://dev.procurewise.com/vmsweb/login");
		return driver;
	}
}
