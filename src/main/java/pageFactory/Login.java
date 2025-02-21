package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;



public class Login {

    public WebDriver driver;
    public Login(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='username']")
    WebElement usernameField;

    @FindBy(css = "input[name='password']")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement loginButton;

    @FindBy(css = "td[colspan='3']")
    WebElement verificationText;


    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }
    public void getConfirmText(){
        SoftAssert softassert = new SoftAssert();
        String confirmText = verificationText.getText();
        String actualText = "*Balance includes deposits that may be subject to holds";

        softassert.assertEquals(actualText, confirmText);
    }
}
