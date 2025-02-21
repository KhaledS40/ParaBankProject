package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class HomePageUpperLinks {

    public WebDriver driver;
    public HomePageUpperLinks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='headerPanel']/ul[1]/li[2]/a")
    WebElement aboutUs;

    @FindBy(linkText = "Services")
    WebElement services;

    @FindBy(linkText = "Products")
    WebElement products;

    @FindBy(linkText = "Locations")
    WebElement locations;

    @FindBy(linkText = "Admin Page")
    WebElement AdminPage;

    @FindBy(css = "//a[normalize-space()='home']")
    WebElement homeSign;

    @FindBy(css = "//a[normalize-space()='about']")
    WebElement aboutSign;

    @FindBy(css = "//a[normalize-space()='contact']")
    WebElement contactSign;

    @FindBy(css = "#accessMode1")
    WebElement soapCheckBox;

    @FindBy(name = "action")
    WebElement cleanButton;

    @FindBy(css = "div[id='rightPanel'] p b")
    WebElement cleanConfirmText;  //

    @FindBy(name = "accessMode")
    WebElement restCheckBox;

    @FindBy(name = "soapEndpoint")
    WebElement soapEndpointField; //

    @FindBy(css = "#restEndpoint")
    WebElement restEndPointField;

    @FindBy(css = "#endpoint")
    WebElement endPointField;

    @FindBy(id = "initialBalance")
    WebElement initialBalanceField;

    @FindBy(id = "minimumBalance")
    WebElement miniBalanceField;

    @FindBy(id = "loanProvider")
    WebElement loanProviderSelect; // Local

    @FindBy(id = "loanProcessor")
    WebElement loanProcessorSelect;  // Combined

    @FindBy(css = "#loanProcessorThreshold")
    WebElement thresholdField;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//b[normalize-space()='Settings saved successfully.']")
    WebElement submissionConfirm;  //

    @FindBy(css = "input[value='Startup']")
    WebElement startUpButton;

    @FindBy(css = "input[value='Shutdown']")
    WebElement shutDownButton;


    public void clickAboutUsLink() {
        aboutUs.click();
    }
    public void clickServicesLink() {
        services.click();
    }
    public void clickProductsLink() throws InterruptedException {
        products.click();
        driver.navigate().back();
        //Thread.sleep(5000);
    }
    public void clickLocationsLink() throws InterruptedException {
        locations.click();
        driver.navigate().back();
        //Thread.sleep(5000);
    }
    public void clickAdminPageLink() {
        AdminPage.click();
    }
    public void clickHomeIcon() {
        homeSign.click();
    }
    public void clickAboutSign() {
        aboutSign.click();
    }
    public void clickContactSign() {
        contactSign.click();
    }
    public void checkSoap() {
        soapCheckBox.isSelected();
    }
    public void clickCleanBtn() {
        cleanButton.click();
        String actualText = "Database Initialized";
        String cleanText = cleanConfirmText.getText();
        System.out.println(cleanText);
        Assert.assertEquals(actualText, cleanText, "Database Initialized");
    }
    public void enterSoapEndpoint() {
        soapEndpointField.sendKeys("https://www.google.com");
    }
    public void enterRestEndpoint() {
        restEndPointField.sendKeys("https://www.google.com");
    }
    public void enterEndpoint() {
        endPointField.sendKeys("https://www.google.com");
    }
    public void enterInitialBalance() {
        initialBalanceField.clear();
        initialBalanceField.sendKeys("500");
    }
    public void enterMiniBalance() {
        miniBalanceField.clear();
        miniBalanceField.sendKeys("200");
    }
    public void selectLoanProvider() {
        loanProviderSelect.click();
        Select s = new Select(loanProviderSelect);
        s.selectByVisibleText("Local");
    }
    public void selectLoanProcessor() throws InterruptedException {
        loanProcessorSelect.click();
        Select s = new Select(loanProcessorSelect);
        s.selectByVisibleText("Down Payment");
        Thread.sleep(4000);
    }
    public void enterThreshold() {
        thresholdField.clear();
        thresholdField.sendKeys("100");
    }
    public void clickSubmitButton() {
        submitButton.click();
    }
    public void getConfirmText() {
        String actualText = "Settings saved successfully.";
        String cleanText = submissionConfirm.getText();
        Assert.assertEquals(actualText, cleanText, "Settings saved successfully.");
    }
    public void clickStartUpButton() {
        startUpButton.click();
    }
    public void clickShutDownButton() {
        shutDownButton.click();
    }
}
