package PeopleNTech.Automationtraning;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Ibrowesernetworking {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1) how to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\talkt\\eclipse-workspace\\Automationtraning\\src\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
	    driver.navigate().refresh();
	    Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String windowhandle= driver.getWindowHandle();
		System.out.println(windowhandle);
		String urlofbrowser= driver.getCurrentUrl();
		System.out.println(urlofbrowser);
		driver.close();
		
	}

}
