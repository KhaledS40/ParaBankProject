package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TransferFund {

    public WebDriver driver;
    public TransferFund(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='overview.htm']")
    WebElement accountOverviewLink;

    @FindBy(css = "a[href='transfer.htm']")
    WebElement transferFundsLink;

    @FindBy(css = "#amount")
    WebElement amountField;

    @FindBy(css = "#fromAccountId")
    WebElement fromAccount;  // 13566

    @FindBy(css = "#toAccountId")
    WebElement toAccount; // 13566

    @FindBy(css = "input[value='Transfer']")
    WebElement transferButton;

    @FindBy(xpath = "//h1[normalize-space()='Transfer Complete!']")
    WebElement confirmText; // Transfer Complete!
//    @FindBy(css = "")
//    WebElement ;

    public void clickAccountOverview(){
        accountOverviewLink.click();
    }
    public void clickTransferFunds(){
        transferFundsLink.click();
    }
    public void enterAmount(){
        amountField.sendKeys("500");
    }
    public void selectFromAccount(){
        fromAccount.click();
        Select select = new Select(fromAccount);
        select.selectByVisibleText("13455");
    }
    public void selectToAccount(){
        toAccount.click();
        Select s = new Select(toAccount);
        s.selectByVisibleText("13455");
    }
    public void clickTransferButton(){
        transferButton.click();
    }
    public void getConfirmText(){
        System.out.println(confirmText.getText());
    }
}
