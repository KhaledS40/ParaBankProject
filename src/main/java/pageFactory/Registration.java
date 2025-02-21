package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Registration {

	WebDriver driver;
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registrationLink;

	@FindBy(css = "input[id='customer.firstName']")
	WebElement firstName;

	@FindBy(css = "input[id='customer.lastName']")
	WebElement lastName;

	@FindBy(css = "input[id='customer.address.street']")
	WebElement address;

	@FindBy(css = "input[id='customer.address.city']")
	WebElement city;

	@FindBy(css = "input[id='customer.address.state']")
	WebElement state;

	@FindBy(css = "input[id='customer.address.zipCode']")
	WebElement zipCode;

	@FindBy(css = "input[id='customer.phoneNumber']")
	WebElement phoneNumber;

	@FindBy(css = "input[id='customer.ssn']")
	WebElement socialNumber;

	@FindBy(css = "input[id='customer.username']")
	WebElement userName;

	@FindBy(css = "input[id='customer.password']")
	WebElement password;

	@FindBy(css = "#repeatedPassword")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerButton;

	@FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
	WebElement confirmationText;


	public void clickRegistration() {
		registrationLink.click();
	}
	public void enterFirstname() {
		firstName.sendKeys("Bob1");
	}
	public void enterLastname() {
		lastName.sendKeys("John");
	}
	public void enterAddress() {
		address.sendKeys("124 King Street");
	}
	public void enterCity() {
		city.sendKeys("Alexandria");
	}
	public void enterState() {
		state.sendKeys("VA");
	}
	public void enterZipCode() {
		zipCode.sendKeys("22304");
	}
	public void enterPhone() {
		phoneNumber.sendKeys("202 345 5679");
	}
	public void enterSSN() {
		socialNumber.sendKeys("456567880");
	}
	public void enterUsername() {
		userName.sendKeys("Bob.John");
	}
	public void enterPassword() {
		password.sendKeys("Cheers1234");
	}
	public void enterConfirmPassword() {
		confirmPassword.sendKeys("Cheers1234");
	}
	public void clickRegisterButton() {
		registerButton.click();
	}
	public void getText() {

		String text = confirmationText.getText();
		System.out.println("this method is passed" + text);
	}
}
