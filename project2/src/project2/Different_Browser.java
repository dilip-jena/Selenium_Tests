package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Different_Browser {
	
	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		
		// TODO Auto-generated method stub
		
		Different_Browser.call_Firefox();
		Different_Browser.get_Google();
		Different_Browser.close_browser();
		
//		Different_Browser.call_chrome();
//		Different_Browser.get_Google();
//		Different_Browser.close_browser();
	}
	
	
	public static void call_Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Jars\\Lib\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Firefox browser is opened");
		}
	
	public static void get_Google() throws Exception
	{
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
	}
	
	
	public static void close_browser()
	{
		driver.quit();
	}
	
	public static void call_chrome()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Jars\\Lib\\NewDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Chrome browser is opened");
		}
	

}
