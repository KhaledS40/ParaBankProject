package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RequestLoan {

    private static final Logger log = LoggerFactory.getLogger(RequestLoan.class);
    public WebDriver driver;
    public RequestLoan(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='updateprofile.htm']")
    WebElement updateInfo;

    @FindBy(css = "a[href='requestloan.htm']")
    WebElement requestLoan;

    @FindBy(css = "#amount")
    WebElement loanAmount;

    @FindBy(css = "#downPayment")
    WebElement downPayment;

    @FindBy(css = "input[value='Apply Now']")
    WebElement applyNow;

    @FindBy(css = "div[id='loanRequestApproved'] p:nth-child(1)")
    WebElement confirmText;

    @FindBy(css = "a[href='logout.htm']")
    WebElement logout;


    public void clickUpdateInfo(){
        updateInfo.click();
    }
    public void clickRequestLoan(){
        requestLoan.click();
    }
    public void enterAmount(){
        loanAmount.sendKeys("90");
        downPayment.sendKeys("80");
    }
    public void clickApplyButton(){
        applyNow.click();
        System.out.println(confirmText.getText());
    }
    public void LogoutApp(){
        logout.click();
    }
}
