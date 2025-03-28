package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.FindTransaction;

import static testComponents.BaseClassTest.driver;


public class FindTransactionSteps {

    FindTransaction find;

    @Given("user clicks Find Transaction link")
    public void user_clicks_find_transaction_link() {
        find = new FindTransaction(driver);
        find.clickFindTransactionLink();
    }
    @When("user enters date of transaction")
    public void user_enters_amount() {
        find.entersTransactionDate();
    }
    @Then("user clicks find transaction button")
    public void user_clicks_find_transaction_button() {
        find.clickFindTransaction();
    }
}
