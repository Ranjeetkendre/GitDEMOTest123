package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement Button = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
       
		act.contextClick(Button).perform(); //Right click on the elemet.
		
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();//Clicked the copy option
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
	 
	}

}
