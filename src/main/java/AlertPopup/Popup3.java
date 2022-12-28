package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

		Thread.sleep(4000);
		
		Alert Text = driver.switchTo().alert();
		
		//System.out.println("Alert message :"+Text);
		
		Text.sendKeys("Welcome");
		
		Thread.sleep(3000);
		
		Text.accept();
		
		
	}
}
