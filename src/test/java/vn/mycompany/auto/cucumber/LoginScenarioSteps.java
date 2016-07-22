package vn.mycompany.auto.cucumber;


import java.util.List;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;

import vn.mycompany.auto.pages.LoginPage;
import vn.mycompany.auto.steps.LoginSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioSteps {

@Steps

LoginSteps loginStep;
LoginPage loginPage;

@Given("^Open Login skype page$")
public void open_Login_skype_page() throws Throwable {
	loginStep.open_login_page();

}

@When("^\"(.*?)\" logged in with password is \"(.*?)\"$")
public void logged_in_with_password_is(String username, String password) throws Throwable {
	loginStep.input_username(username);
	loginStep.input_password(password);

}

@Then("^I verify page title is \"(.*?)\"$")
public void i_verify_page_title_is(String pageTitle) throws Throwable {
	Assert.assertEquals(loginPage.getTitle(),pageTitle);

}

@When("^I am input username is \"(.*?)\"$")
public void i_am_input_username_is(String username) throws Throwable {
    loginStep.input_username(username);
}

@When("^I am input password is \"(.*?)\"$")
public void i_am_input_password_is(String password) throws Throwable {
    loginStep.input_password(password);
}

@When("^user click Signin button$")
public void user_click_Signin_button() throws Throwable {
	loginStep.click_on_signIn_btn();
}

@Then("^I verify the error message is \"(.*?)\"$")
public void i_verify_the_error_message_is(String errorMsg) throws Throwable {
	Assert.assertEquals(loginStep.getAlertMsg(), errorMsg);
}


@When("^I fill the login from$")
public void i_fill_the_login_from(DataTable accTable) throws Throwable {
	List<List<String>> lists = accTable.raw();
	loginStep.input_username(lists.get(1).get(0));
	loginStep.input_password(lists.get(1).get(1));
}

}