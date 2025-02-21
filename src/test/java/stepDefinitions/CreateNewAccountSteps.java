package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.OpenNewAccount;
import static testComponents.BaseClassTest.driver;




public class CreateNewAccountSteps {

    OpenNewAccount newAccount;

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        newAccount = new OpenNewAccount(driver);
        newAccount.enterUsername("Bob.John");
        newAccount.enterPassword("Cheers1234");
    }
    @Then("user is able to click on the login button")
    public void user_clicks_login_button(){
        newAccount.clickLoginButton();
    }
    @Then("user should clicks on Open New Account")
    public void user_should_clicks_on_open_new_account() {
        newAccount.clickOpenNewAccount();
    }
    @And("user selects type of account from dropdown")
    public void user_selects_type_of_account_from_dropdown() {
        newAccount.selectAccountType();
    }
    @And("user selects an amount from dropdown")
    public void user_selects_an_amount_from_dropdown() {
        newAccount.selectAmountTYpe();
    }
    @And("finally user clicks Open New Account button")
    public void finally_user_clicks_open_new_account_button() {
        newAccount.clickNewAccountButton();
    }
    @And("a congratulations message would displays to verify the account created")
    public void a_congratulations_message_would_displays_to_verify_the_account_created() {
        newAccount.verifyAccount();
    }
}
