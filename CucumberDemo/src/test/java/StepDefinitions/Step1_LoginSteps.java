package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePageObjects;
import PageObjects.ProductListingObjects;
import PageObjects.CheckoutPageObjects;
import PageObjects.SignInPageObjects;
import Utils.driverUtility;
import Utils.emailUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step1_LoginSteps {
	
	WebDriver driver=driverUtility.getDriver();
    HomePageObjects homePageObj;
    SignInPageObjects signInObj;
    ProductListingObjects productListObj;
    String email=emailUtil.getNewEmail();
    
    

	@Given("User is on Homepage of Application")
	public void user_is_on_Homepage_of_Application()throws InterruptedException {
		driver=driverUtility.getDriver();
		  System.out.print("email1" +email);
		
		   email=(email==null||email=="")? emailUtil.getNewEmail():email;
		   System.out.print("email2" +email);

	}

	@When("I Click on Sign in")
	public void i_Click_on_Sign_in() {
		homePageObj = new HomePageObjects(driver);
 		homePageObj.Signin();
	}
//
	@And("I fill the email id for register user and click create account button")
	public void i_fill_the_email_id_for_register_user_and_click_create_account_button() throws InterruptedException {
		signInObj = new SignInPageObjects(driver); 
		signInObj.enter_Email(email);
        signInObj.CreateAccount();
        Thread.sleep(3000);
	}

	@Then("It should ask me for more details for registration and click save button")
	public void it_should_ask_me_for_more_details_for_registration_and_click_save_button() throws InterruptedException  {
		signInObj = new SignInPageObjects(driver); 
		signInObj.Select_Radiobtn();
		signInObj.enter_FirstName("Lisa");
		signInObj.enter_Lastname("Black");
		signInObj.enter_Passwd("testing");
		signInObj.SelectDay("11");
		signInObj.SelectMonth("8");
		signInObj.SelectYear("1998");
		signInObj.enter_Address("Street3");
		signInObj.enter_City("Illionis");
		signInObj.State("3");
		signInObj.enter_PostalCode("55555");
		signInObj.Country("21");
		signInObj.enter_Mobile("567899");
		signInObj.enter_Alias("home");
		signInObj.RegisterClick();
		Thread.sleep(3000);
		
	}
	
	@And("I should see firstname and lastname as username after account creation")
	public void i_should_see_firstname_and_lastname_as_username_after_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
		productListObj = new ProductListingObjects(driver);
		String userName=productListObj.getUserName();
	
		Assert.assertEquals("Validate First Name ","Lisa",userName.split(" ")[0]);
		Assert.assertEquals("Validate Last Name ","Black",userName.split(" ")[1]);
	}

	@Then("I should able to logout")
	public void i_should_able_to_logout() {
	    // Write code here that turns the phrase above into concrete actions
		homePageObj.Signout();
	}

    @Given("User is on home page,user fill the email id and password for login and click login button")
    public void user_is_on_home_page_user_fill_the_email_id_and_password_for_login_and_click_login_button() {
    	homePageObj = new HomePageObjects(driver);
 		homePageObj.Signin();
    	signInObj = new SignInPageObjects(driver); 
    	signInObj.enter_Emailsignin(email);

		signInObj.enter_Passwd("testing");
		signInObj.SignInClick();
    }

    @Then("I should see firstname and lastname as username after login")
    public void i_should_see_firstname_and_lastname_as_username_after_login() {
    	productListObj = new ProductListingObjects(driver);
    	String userName=productListObj.getUserName();
		Assert.assertEquals("Validate First Name ","Lisa",userName.split(" ")[0]);
		Assert.assertEquals("Validate Last Name ","Black",userName.split(" ")[1]);
    }
}
