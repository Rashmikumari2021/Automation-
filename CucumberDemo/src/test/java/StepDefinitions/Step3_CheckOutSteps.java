package StepDefinitions;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.HomePageObjects;
import PageObjects.ProductListingObjects;
import PageObjects.CheckoutPageObjects;
import PageObjects.SignInPageObjects;
import Utils.driverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Step3_CheckOutSteps {
	
	WebDriver driver;
    HomePageObjects homePageObj;
    SignInPageObjects signInObj;
    ProductListingObjects ProductListObj;
    CheckoutPageObjects CheckoutPageObj;
    String selectedProductName;
	String selectedProductQuantity;
	String cartProductName;
	String cartProductQuantity;
    
    @Given("User is authenticated and have product list in search list")
    public void user_is_authenticated_and_have_product_list_in_search_list() {
        // Write code here that turns the phrase above into concrete actions
   	driver=driverUtility.getDriver();
//    	File file = new File("D:/ews/driver/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
//    	driver = new ChromeDriver();
//    	driver.manage().window().maximize();
//    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    	driver.get("http://automationpractice.com/index.php");
//    	
//    	homePageObj = new HomePageObjects(driver);
//    	
//    	homePageObj.Signin();
//    	
//    	signInObj = new SignInPageObjects(driver); 
//    	signInObj.enter_Emailsignin("testacct3@gmail.com");
//    	signInObj.enter_Passwd("testing");
//    	signInObj.SignInClick();
//    	ProductListObj = new ProductListingObjects(driver);
//    	ProductListObj.enter_Searchtext("dress");
//    	ProductListObj.ClickSearch();
    
    	
		
    }

    @Then("I should able to add the item in cart and navigate successfully till payment page")
    public void i_should_able_to_add_the_item_in_cart_and_navigate_successfully_till_payment_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(2000);
      	CheckoutPageObj =new CheckoutPageObjects(driver);	
      	CheckoutPageObj.addToCart();
    	 selectedProductName= CheckoutPageObj.getProductName();
    	 selectedProductQuantity= CheckoutPageObj.getQuantity();
    	CheckoutPageObj.proceed();
    	Thread.sleep(2000);
    	 cartProductName= CheckoutPageObj.getCartProductName();
    	 cartProductQuantity= CheckoutPageObj.getCartQuantity();
    	
    }

    @Then("Validate product details in payment page")
    public void validate_product_details_in_payment_page() throws InterruptedException {
    	Assert.assertEquals("Validate ProductName ",selectedProductName,cartProductName);
    	Assert.assertEquals("Validate Quantity ",cartProductQuantity,cartProductQuantity);
        
    	Thread.sleep(10000);
    	driverUtility.tearDown();
        
    }


}
