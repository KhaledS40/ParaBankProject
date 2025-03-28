package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.TransferFund;
import static testComponents.BaseClassTest.driver;


public class TransferFundSteps {

    TransferFund transfer;

    @Given("user clicks on accounts review")
    public void user_clicks_on_accounts_review() {
        transfer = new TransferFund(driver);
        transfer.clickAccountOverview();

    }
    @When("user clicks on transfer funds")
    public void user_clicks_on_transfer_funds() {
        transfer.clickTransferFunds();

    }
    @Then("user can enters amount")
    public void user_can_enters_amount() {
        transfer.enterAmount();

    }
    @Then("user selects amount from both accounts to transfer")
    public void user_selects_amount_from_both_accounts_to_transfer() {
        transfer.selectFromAccount();
        transfer.selectToAccount();

    }
    @Then("user now clicks transfer button")
    public void user_now_clicks_transfer_button() {
        transfer.clickTransferButton();

    }
    @Then("and now user should get confirmation message transfer complete")
    public void and_now_user_should_get_confirmation_message_transfer_complete() {
        transfer.getConfirmText();

    }
}
