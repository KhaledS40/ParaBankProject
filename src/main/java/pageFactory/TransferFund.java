package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




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


}
