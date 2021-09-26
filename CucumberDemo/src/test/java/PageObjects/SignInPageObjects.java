package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignInPageObjects  {
	WebDriver driver;
	public SignInPageObjects(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements(driver, this);

	}
	@FindBy(xpath ="//input[@id='email_create']")
	WebElement Email;

	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement CreateAccount;
	
	@FindBy(xpath="//input[@type='radio']")
	WebElement Radiobtn;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Passwd;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement DayDropDown;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement MonthDropDown;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement YearDropDown;
	
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//select[@name='id_state']")
	WebElement StateDropDown;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@name='id_country']")
	WebElement CountryDropDown;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement Mobile;
	
	@FindBy(xpath="//input[@value='My address']")
	WebElement Alias;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement Register;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement SignIn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailSignin;
	

	
	
	public void enter_Email(String email) {
		Email.sendKeys(email);
	}
	public void CreateAccount() {
		CreateAccount.click();
	}
	
	public void Select_Radiobtn() {
		Radiobtn.click();
	}
	public void enter_FirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}
	
	public void enter_Lastname(String lastname) {
		LastName.sendKeys(lastname);
	}

	
	public void enter_Passwd(String passwd) {
		Passwd.sendKeys(passwd);
	}
	public void SelectDay(String Day) {
		Select DropDown = new Select(DayDropDown);
		DropDown.selectByValue(Day);
	}
	
	public void SelectMonth(String Month) {
		Select DropDown = new Select(MonthDropDown);
		DropDown.selectByValue(Month);
	}
	
	public void SelectYear(String Year) {
		Select DropDown = new Select(YearDropDown);
		DropDown.selectByValue(Year);
	}

	
	public void enter_Address(String address) {
		Address.sendKeys(address);
	}
	
	public void enter_City(String city) {
		City.sendKeys(city);
	}
	
	public void State(String state) {
		Select DropDown = new Select(StateDropDown);
		DropDown.selectByValue(state);
	}
	
	public void enter_PostalCode(String Code) {
		postcode.sendKeys(Code);
	}
	
	public void Country(String country) {
		Select DropDown = new Select(CountryDropDown);
		DropDown.selectByValue(country);
	}
	
	public void enter_Mobile(String number) {
		Mobile.sendKeys(number);
	}
	
	public void enter_Alias(String alias) {
		Alias.sendKeys(alias);
	}
	public void RegisterClick() {
		Register.click();
	}
	public void SignInClick() {
		SignIn.click();
	}
	public void enter_Emailsignin(String emailsignin) {
		EmailSignin.sendKeys(emailsignin);
	}
}
