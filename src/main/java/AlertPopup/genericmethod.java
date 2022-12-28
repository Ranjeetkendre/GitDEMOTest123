package AlertPopup;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class genericmethod {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String, Integer> contentSetting =new HashMap<String, Integer>();
		HashMap<String, Object> profile =new HashMap<String, Object>();
		HashMap<String, Object> prefs =new HashMap<String, Object>();

		contentSetting.put("notifications",1);
		profile.put("managed_default_content_settings", contentSetting);
		prefs.put("Profile", profile);
		//option.setExperimentalOption("Prefs", prefs);
		
	//	option.addArguments("--disable-notifications");
		
		// option.addArguments("disable-notifications");
		
	//	 option.addArguments("disable-geolocation");

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
 
		  WebDriver driver = new ChromeDriver(option);
			option.setExperimentalOption("Prefs", prefs);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();		  
		  
		  //Location based popup
		//  driver.get("https://whatmylocation.com/");
	    driver.get("https://www.hdfcbank.com/");
		  
	
		  
		
	}

}
