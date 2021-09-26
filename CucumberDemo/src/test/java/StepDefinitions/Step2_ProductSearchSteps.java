package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePageObjects;
import PageObjects.ProductListingObjects;
import PageObjects.CheckoutPageObjects;
import PageObjects.SignInPageObjects;
import Utils.driverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Step2_ProductSearchSteps {

	WebDriver driver;
    HomePageObjects homePageObj;
    SignInPageObjects signInObj;
    ProductListingObjects ProductListObj;
    CheckoutPageObjects CheckoutPageObj;


@Given("User authenticated and is on Homepage of Application")
public void user_authenticated_and_is_on_Homepage_of_Application() {
	driver=driverUtility.getDriver();
//	File file = new File("D:/ews/driver/chromedriver.exe");
//    System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("http://automationpractice.com/index.php");
//	driver=driverUtility.getDriver();
//	homePageObj = new HomePageObjects(driver);
//	homePageObj.Signin();
//	
//	signInObj = new SignInPageObjects(driver); 
//	signInObj.enter_Emailsignin("testacct3@gmail.com");
//	signInObj.enter_Passwd("testing");
//	signInObj.SignInClick();
		
}

@Then("I should able to enter search text in search box")
public void i_should_able_to_enter_search_text_in_search_box() {
	 // Write code here that turns the phrase above into concrete actions
	ProductListObj = new ProductListingObjects(driver);
	ProductListObj.enter_Searchtext("dress");
	

}

@When("I click on Search buttom")
public void i_click_on_Search_buttom() {
    // Write code here that turns the phrase above into concrete actions
	
	ProductListObj.ClickSearch();
}

@Then("I should able to see list of products for my search")
public void i_should_able_to_see_list_of_products_for_my_search() throws InterruptedException  {
	Thread.sleep(2000);
	int productCount=ProductListObj.findProductCount();
	Assert.assertTrue(productCount>0);
	
}
}
