package stepDefinitions;

import io.cucumber.java.en.*;
import pageFactory.Login;

import static testComponents.BaseClassTest.driver;

public class LoginSteps {

    Login login;

    @When("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) {

        login = new Login(driver);
        login.enterUsername(username);
        login.enterPassword(password);
//        WebElement usernameFIELD = driver.findElement(By.cssSelector("input[name='username']"));
//        usernameFIELD.sendKeys(username);
//        WebElement PASS = driver.findElement(By.cssSelector("input[name='password']"));
//        PASS.sendKeys(password);


    }
    @Then("user can clicks on the login button")
    public void user_can_clicks_on_the_login_button() {

        //driver.findElement(By.cssSelector("input[value='Log In']")).click();
        login.clickLogin();
    }
    @And("user should be navigate to login page")
    public void user_should_be_navigate_to_login_page() {

    }
}
