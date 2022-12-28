package copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {

	public Kite_Login_Page1(WebDriver driver) {// Constructor
		
		//PageFactory.initElements(driver1, this);
		PageFactory.initElements(driver, this);
	}
	
      @FindBy(id="userid")	
      WebElement Username;
      
      @FindBy(xpath="//input[@id=\"password\"]")
      WebElement Password;
      
      @FindBy(xpath="//button[@type=\"submit\"]") 
      WebElement LoginButton;
      
      public void UserID(String Userinformation) {
    	  Username.sendKeys(Userinformation);
      }
    
      public void Pass(String UserPassword) {
    	  Password.sendKeys(UserPassword);
      }
      public void LoginBton() {
    	  LoginButton.click();
      }
  
}
