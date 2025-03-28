package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PayBill {

    public WebDriver driver;
    public PayBill(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='billpay.htm']")
    WebElement payBillLink;

    @FindBy(css = "input[name='payee.name']")
    WebElement payeeName;

    @FindBy(css = "input[name='payee.address.street']")
    WebElement address;

    @FindBy(css = "input[name='payee.address.city']")
    WebElement city;

    @FindBy(css = "input[name='payee.address.state']")
    WebElement state;

    @FindBy(css = "input[name='payee.address.zipCode']")
    WebElement zipCode;

    @FindBy(name = "payee.phoneNumber")
    WebElement phoneNumber;

    @FindBy(css = "input[name='payee.accountNumber']")
    WebElement accountNumber;

    @FindBy(css = "input[name='verifyAccount']")
    WebElement verifyAccount;

    @FindBy(css = "input[name='amount']")
    WebElement amount;

    @FindBy(css = "input[value='Send Payment']")
    WebElement sendButton;

    @FindBy(xpath = "//h1[normalize-space()='Bill Payment Complete']")
    WebElement billConfirm;


    public void clickPayBill(){
        payBillLink.click();
    }
    public void enterBillInfo() {
        payeeName.sendKeys("John");
        address.sendKeys("4600 fairfox drive");
        city.sendKeys("arlington");
        state.sendKeys("Va");
        zipCode.sendKeys("22304");
        phoneNumber.sendKeys("78956789054");
        accountNumber.sendKeys("67890");
        verifyAccount.sendKeys("67890");
        amount.sendKeys("600");
    }
    public void submitPayment(){
        sendButton.click();
        System.out.println(billConfirm.getText());
    }
}
