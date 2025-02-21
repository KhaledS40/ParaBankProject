package stepDefinitions;
import io.cucumber.java.en.*;
import pageFactory.HomePageUpperLinks;
import static testComponents.BaseClassTest.driver;




public class HomeLinksSteps {

    HomePageUpperLinks home;

    @When("user clicks About Us link")
    public void user_clicks_about_us_link() {
        home = new HomePageUpperLinks(driver);
        home.clickAboutUsLink();
    }
    @When("user clicks Services link")
    public void user_clicks_services_link() {
        home.clickServicesLink();
    }
    @When("user clicks Products link")
    public void user_clicks_products_link() throws InterruptedException {
        home.clickProductsLink();
    }
    @When("user clicks Locations link")
    public void user_clicks_locations_link() throws InterruptedException {
        home.clickLocationsLink();
    }
    @When("user clicks Admin Page link")
    public void user_clicks_admin_page_link() {
        home.clickAdminPageLink();
    }
    @Then("user selects soap checkbox")
    public void user_selects_soap_checkbox() {
        home.checkSoap();
    }
    @Then("user clicks clean button")
    public void user_clicks_clean_button() {
        home.clickCleanBtn();
    }
    @Then("user enters soap endpoint")
    public void user_enters_soap_endpoint() {
        home.enterSoapEndpoint();
    }
    @Then("user enters rest endpoint")
    public void user_enters_rest_endpoint() {
        home.enterRestEndpoint();
    }
    @Then("user enters endpoint")
    public void user_enters_endpoint() {
        home.enterEndpoint();
    }
    @Then("user enters initial balance")
    public void user_enters_initial_balance() {
        home.enterInitialBalance();
    }
    @Then("user enters mini balance")
    public void user_enters_mini_balance() {
       home.enterMiniBalance();
    }
    @Then("user selects loan provider")
    public void user_selects_loan_provider() {
        home.selectLoanProvider();
    }
    @Then("user selects loan processor and enters threshold amount")
    public void user_selects_loan_processor_and_enters_threshold_amount() throws InterruptedException {
        home.selectLoanProcessor();
        home.enterThreshold();
    }
    @Then("finally user clicks submit button and get confirmation text")
    public void finally_user_clicks_submit_button_and_get_confirmation_text() {
        home.clickSubmitButton();
        home.getConfirmText();
    }
}
