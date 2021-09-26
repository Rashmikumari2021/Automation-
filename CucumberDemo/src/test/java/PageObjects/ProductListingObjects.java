package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class ProductListingObjects {
	
	public WebDriver driver;
	public Actions action;
	
	public ProductListingObjects(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	    
	    
	    
	    
	}
	
	@FindBy(xpath ="//input[@id='search_query_top']")
	WebElement txt_searchbox;

	@FindBy(xpath="//button[@name='submit_search']")
	WebElement ClickSearch;
	
	@FindBy(xpath="//a[@class='account']/span")
	WebElement userName;
	
	@FindAll(@FindBy(xpath="//div[@class='product-container']"))
	List<WebElement> productList;
  
		
   
	public void enter_Searchtext(String text) {
		txt_searchbox.sendKeys(text);
	}
	
	public String getUserName() { 
		return userName.getText();
	}
	public void ClickSearch() { 
		ClickSearch.click();
	}
	
	public int findProductCount() { 
		return productList.size();
	}
}
	
	