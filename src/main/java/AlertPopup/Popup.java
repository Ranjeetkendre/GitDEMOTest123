package AlertPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {


		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(4000);
		
		//	Thread.sleep(4000);
			
			driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abc");
			
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Qwe123");
			
		    driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	}

}
