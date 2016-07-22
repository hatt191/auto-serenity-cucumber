package vn.mycompany.auto.steps;


import vn.mycompany.auto.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class LoginSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginPage loginPage;
	
	//Open Login page
	@Step
	public void open_login_page() {
		loginPage.open();
	}
	
	//input User Name
	@Step
	public void input_username(String username) {
		loginPage.enterUsername(username);	
	}
	
	//input Password
	@Step
	public void input_password(String password) {
		loginPage.enterPassword(password);
	}
	
	//click sign in button
	@Step
	public void click_on_signIn_btn() {
		loginPage.clickSignInBtn();	
	}
	
	//get Error message
	@Step
	public String getAlertMsg() {	
		return loginPage.getErrMsg();
	}


	

}
