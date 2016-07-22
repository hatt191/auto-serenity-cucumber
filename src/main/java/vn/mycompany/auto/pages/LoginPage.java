package vn.mycompany.auto.pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://login.skype.com/login")
public class LoginPage extends PageObject{

	@FindBy(id="username")
	WebElement usernameField; 
	
	@FindBy(id="password")
	WebElement passwordField; 
	
	@FindBy(id="signIn")
	WebElement signInBtn;
	
	@FindBy(xpath="//*[contains(@class, 'message_error')][1]//span")
	WebElement errMsg;
	
	
	public void enterUsername(String username) {
		usernameField.sendKeys(username);	
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);	
	}

	public void clickSignInBtn() {
		signInBtn.click();
	}

	public String getErrMsg() {
		return errMsg.getText();
	}

}
