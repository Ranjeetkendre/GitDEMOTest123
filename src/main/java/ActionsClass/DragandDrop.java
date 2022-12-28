package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		//http://demo.automationtesting.in/Register.html
		WebElement Source = driver.findElement(By.id("box3"));
		WebElement Target = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		//act.dragAndDrop(Source, Target).build().perform();
		
		//Build(). perform() is used to compile and execute the actions class.
		
	}

}
