package stepDefinitions;

import io.cucumber.java.en.*;
import pageFactory.Registration;
import testComponents.BaseClass;

import java.io.IOException;

public class RegistrationSteps {

	BaseClass base = new BaseClass();
	Registration reg;

	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws IOException {

		base.initializeDriver();
	}
	@When("user click on {string} link")
	public void user_click_on_link(String register) {

	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String firstname, String lastname) {

	}
	@When("user enter address and city")
	public void user_enter_address_and_city() {

	}
	@When("user enter state and zipCode")
	public void user_enter_state_and_zip_code() {

	}
	@When("user enter phone number and SSN")
	public void user_enter_phone_number_and_ssn() {

	}
	@When("now user should create username")
	public void now_user_should_create_username() {

	}
	@When("user also should create password and confirm password")
	public void user_also_should_create_password_and_confirm_password() {

	}
	@Then("user can click {string} link to register ot the site")
	public void user_can_click_link_to_register_ot_the_site(String registerButton) {

	}
	@Then("a confirmation message should be created {string}")
	public void a_confirmation_message_should_be_created(String confirmText) {

	}
}
