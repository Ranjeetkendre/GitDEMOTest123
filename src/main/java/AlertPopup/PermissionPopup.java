package AlertPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {

	public static void main(String[] args) throws InterruptedException {
	
		 ChromeOptions option = new ChromeOptions();
		
		 option.addArguments("--disable-notifications");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	 
		 WebDriver driver = new ChromeDriver(option); 
		 
		 driver.manage().window().maximize();		 	  
	  
		  Thread.sleep(4000);
		  driver.get("https://www.hdfcbank.com/");
		 		
	}

}
