package PageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;


public class CheckoutPageObjects {

	public WebDriver driver;
	public CheckoutPageObjects(WebDriver driver) {
		
	
		    PageFactory.initElements(driver, this);
	}	    
		    
		   	    
		

		@FindBy(xpath="//a[@data-id-product='7']")
		WebElement addToCart;
		
		@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
		WebElement proceedToCheckout2;
		
		 @FindBy(xpath="//li[@id='list']")
		 WebElement listView;
		
		@FindBy(xpath="//a[@title='Proceed to checkout']")
	    WebElement proceedToCheckout;
			
		@FindBy(xpath="//button[@name='processAddress']")
		 WebElement proceedToCheckout3;
			@FindBy(xpath="//button[@name='processCarrier']")
			 WebElement proceedToCheckout4;
			
			
			@FindBy(xpath="//input[@id='cgv']")
			 WebElement terms;
			@FindBy(xpath="//span[@id='layer_cart_product_title']")
			WebElement productName;
			
			@FindBy(xpath="//span[@id='layer_cart_product_attributes']")
			WebElement productVariant;
			
			@FindBy(xpath="//span[@id='layer_cart_product_quantity']")
			WebElement productQuantity;
			
			
			@FindBy(xpath="//p[@class='product-name']")
			WebElement productNameAtCart;
			
			@FindBy(xpath="//td[@class='cart_quantity text-center']/span")
			WebElement quantityAtCart; 
		
		
	  
	public void addToCart() throws InterruptedException {	
	
	  listView.click();		 
  	  addToCart.click();
  	  Thread.sleep(3000);
     
  }




public String getProductName() throws InterruptedException {
	Thread.sleep(2000);
	  return productName.getText();
	 
}

public String getQuantity() throws InterruptedException {
	Thread.sleep(2000);
	return productQuantity.getText();
}

public String getCartProductName() throws InterruptedException {
	return productNameAtCart.getText();
	
}

public String getCartQuantity() throws InterruptedException {
	return quantityAtCart.getText();
}


public void proceed() throws InterruptedException {	
	
	 
		  proceedToCheckout.click();
		  Thread.sleep(3000);
		  
		  Thread.sleep(3000);
		  proceedToCheckout2.click();
		  Thread.sleep(3000);
		  proceedToCheckout3.click();
		  Thread.sleep(3000);
		  terms.click();
		  proceedToCheckout4.click();
		  Thread.sleep(3000);
		
		}
}



