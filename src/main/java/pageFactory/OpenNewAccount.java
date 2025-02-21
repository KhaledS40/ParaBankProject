package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class OpenNewAccount {

    public WebDriver driver;

    public OpenNewAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='username']")
    WebElement usernameField;

    @FindBy(css = "input[name='password']")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement loginButton;

    @FindBy(linkText = "Open New Account")
    WebElement openNewAccountLink;

    @FindBy(css = "#type")
    WebElement accountTyp;

    @FindBy(css = "#fromAccountId")
    WebElement amountSelect;

    @FindBy(css = "input[value='Open New Account']")
    WebElement openNewAccountButton;

    @FindBy(xpath = "//p[normalize-space()='Congratulations, your account is now open.']")
    WebElement confirmMessage;


    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
        public void clickOpenNewAccount(){
        openNewAccountLink.click();
    }
    public void selectAccountType(){
        accountTyp.click();
        Select s = new Select(accountTyp);
        s.selectByVisibleText("SAVINGS");
    }
    public void selectAmountTYpe(){
        amountSelect.click();
        Select s = new Select(amountSelect);
        s.selectByVisibleText("13677");
    }
    public void clickNewAccountButton(){
        openNewAccountButton.click();
    }
    public void verifyAccount(){
        //String actual = "[]";
        //String expected  = confirmMessage.getText();
        //Assert.assertTrue(true);
        //Assert.assertEquals(actual, expected);
        System.out.println(confirmMessage.getText());
    }
}
