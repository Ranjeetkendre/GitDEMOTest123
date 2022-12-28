package copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {

	
	public Kite_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class=\"user-id\"]")
	private WebElement UserID2;
	
	public void UserID(String UserID1) {
	
		String ActualTextID =UserID2.getText();
		
		if(UserID1.equals(ActualTextID)) {
			System.out.println("Valid UserID");
		}
		else
			System.out.println("Invalid user ID");
	}
}
