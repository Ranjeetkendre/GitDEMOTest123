package AlertPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	 // https://usename: password
		Thread.sleep(4000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
