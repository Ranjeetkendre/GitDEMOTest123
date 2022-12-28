package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Rahul");
		
		driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		  String Text = alert.getText();
		  
		  if(Text.equals("Please enter your")) {
			  System.out.println("Correct alert mesaage");
		  }
		  else {
			  System.out.println("Incorrect alert mesaage");
		  }
		  alert.accept();
}

}