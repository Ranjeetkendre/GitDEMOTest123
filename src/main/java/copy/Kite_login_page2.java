package copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page2 {

	public Kite_login_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="pin")
	WebElement Pin;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Continue;
	
	public void Pinpage(String UserPIN) {
		Pin.sendKeys(UserPIN);
	}
	public void Continuebutton() {
		Continue.click();
	}
	
}
