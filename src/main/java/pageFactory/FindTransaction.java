package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FindTransaction {

    public WebDriver driver;
    public FindTransaction(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='findtrans.htm']")
    WebElement findTransactionLink;

    @FindBy(css = "#transactionDate")
    WebElement transactionDate;

    @FindBy(css = "#findByDate")
    WebElement findTransactionButton;

    @FindBy(css = "div[id='resultContainer'] h1[class='title']")
    WebElement confirmText;


    public void clickFindTransactionLink(){
        findTransactionLink.click();
    }
    public void entersTransactionDate(){
        transactionDate.sendKeys("12-20-2024");
    }
    public void clickFindTransaction(){
        findTransactionButton.click();
        System.out.println(confirmText.getText());
    }
}
