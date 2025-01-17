package stepDefinitions;

import io.cucumber.java.en.*;
import pageFactory.Registration;
import testComponents.BaseClass;
import java.io.IOException;

import static testComponents.BaseClass.driver;


public class RegistrationSteps {

	BaseClass base = new BaseClass();
	Registration reg;

	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws IOException {

		base.initializeDriver();
	}
	@When("user click on {string} link")
	public void user_click_on_link(String register) {
		reg = new Registration(driver);
        reg.clickRegistration();
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String firstname, String lastname) {
		reg.enterFirstname();
		reg.enterLastname();
	}
	@When("user enter address and city")
	public void user_enter_address_and_city() {
		reg.enterAddress();
		reg.enterCity();
	}
	@When("user enter state and zipCode")
	public void user_enter_state_and_zip_code() {
		reg.enterState();
		reg.enterZipCode();
	}
	@When("user enter phone number and SSN")
	public void user_enter_phone_number_and_ssn() {
		reg.enterPhone();
		reg.enterSSN();
	}
	@When("now user should create username")
	public void now_user_should_create_username() {
		reg.enterUsername();
	}
	@When("user also should create password and confirm password")
	public void user_also_should_create_password_and_confirm_password() {
		reg.enterPassword();
		reg.enterConfirmPassword();
	}
	@Then("user can click {string} link to register ot the site")
	public void user_can_click_link_to_register_ot_the_site(String registerButton) {
		reg.clickRegisterButton();
	}
	@Then("a confirmation message should be created {string}")
	public void a_confirmation_message_should_be_created(String confirmText) {
		reg.getText();
	}
	@And("finally browser should be closed")
	public void close_browser(){
		base.tearDown();
	}
}
