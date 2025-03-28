package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.RequestLoan;

import static testComponents.BaseClassTest.driver;


public class RequestLoanSteps {

    RequestLoan request;

    @Given("user clicks Update Contact Info")
    public void user_clicks_update_contact_info() {
        request = new RequestLoan(driver);
        request.clickUpdateInfo();
    }
    @When("user clicks Request Loan link")
    public void user_clicks_request_loan_link() {
        request.clickRequestLoan();
    }
    @Then("user is able to enter Loan amount and down payment")
    public void user_is_able_to_enter_loan_amount_and_down_payment() {
        request.enterAmount();
    }
    @And("finally user clicks Apply button")
    public void finally_user_clicks_apply_button() {
        request.clickApplyButton();
    }
    @And("user logout the application")
    public void user_logout_the_app(){
        request.LogoutApp();
    }
}
