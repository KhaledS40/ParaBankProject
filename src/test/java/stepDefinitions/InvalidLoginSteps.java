package stepDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Login;
import java.util.Map;
import static testComponents.BaseClassTest.driver;




public class InvalidLoginSteps {

    Login login;

    @When("user enters set of username and password")
    public void user_enters_set_of_and(DataTable credentials) {
        // using Hashmap to extract data into a map and iterate over map
        for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
            // Parse map into local variables
            String username = data.get("username");  // the username inside argument comes from feature file and same as password
            String password = data.get("password");

            login = new Login(driver);
            login.enterUsername(username);
            login.enterPassword(password);
            login.clickLogin();
        }
    }
    @Then("user should be able to view the account balance")
    public void user_should_be_able_to_view_the_account_balance() {

        login.getConfirmText();
    }
}
