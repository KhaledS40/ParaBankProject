package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.PayBill;
import static testComponents.BaseClassTest.driver;


public class PayBillSteps {

    PayBill payBill;

    @Given("user clicks Bill pay link")
    public void user_clicks_bill_pay_link() {
        payBill = new PayBill(driver);
        payBill.clickPayBill();
    }
    @When("user can enters all Bill payment information")
    public void user_can_enters_all_bill_payment_information() {
        payBill.enterBillInfo();
    }
    @Then("user can click send payment to complete transaction")
    public void user_can_click_send_payment_to_complete_transaction() {
        payBill.submitPayment();
    }
}
