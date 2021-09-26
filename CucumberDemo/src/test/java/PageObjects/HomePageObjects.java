package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects  {

public WebDriver driver;
public HomePageObjects(WebDriver driver) {
    PageFactory.initElements(driver, this);

}
@FindBy(xpath ="//a[@class='login']")
WebElement Signin;

@FindBy(xpath ="//a[@class='logout']")
WebElement Signout;


public void Signin() {
	Signin.click();
}
public void Signout() {
	Signout.click();
}

}