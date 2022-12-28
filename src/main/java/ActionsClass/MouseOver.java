package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	    Actions act = new Actions(driver);
	    
	 WebElement Admin=	driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"));
	 WebElement USerManage=	driver.findElement(By.xpath("//a[@id=\"menu_admin_UserManagement\"]"));
	 WebElement Users= driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]"));
	  
	 act.moveToElement(Admin).build().perform();  // Mouseover to admin tab
	 act.moveToElement(USerManage).build().perform(); // Mouseover to UM tab
	 act.moveToElement(Users).click().build().perform(); 
	 
	//instead of writing three statement we can write in one statement.
	// act.moveToElement(Admin).moveToElement(USerManage).moveToElement(Users).click().build().perform();
	 

 

	}

}
