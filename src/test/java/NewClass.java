
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class NewClass {
  @Test
  public void f() 
  {
	  	System.setProperty("webdriver.gecko.driver", "D:\\Automation_Workspace\\Drivers & Jars\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  	FirefoxOptions firefoxOptions = new FirefoxOptions();
 	 	firefoxOptions.setCapability("moz:useNonSpecCompliantPointerOrigin", false);
 	 	WebDriver driver=new FirefoxDriver(firefoxOptions);
 	 	driver.get("https://www.google.com/");
  }
}

