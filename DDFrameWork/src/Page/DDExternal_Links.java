package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class DDExternal_Links {
	
	@FindBy(xpath="//a[@target=\"blank\"]/./i[@class=\"fa fa-facebook\"]/..")
	private WebElement Fblink;
	
	@FindBy(xpath="//a[@target=\"blank\"]/./i[@class=\"fa fa-twitter\"]/..")
	private WebElement twitterlink;
	
	
	@FindBy(xpath="//a[@target=\"blank\"]/./i[@class=\"fa fa-linkedin\"]/..")
	private WebElement linkedinlink;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
	public DDExternal_Links(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ValidateFBlink() {
		Fblink.click();
		
		if(Fblink.isDisplayed()) {
			Reporter.log("Discover Dollar facebook page displayed",true);
		}
		else {
			Reporter.log("Discover Dollar facebook page Not displayed",true);
		}
		
	}

	public void ValidateTwitterLink() {
		twitterlink.click();	
	if(twitterlink.isDisplayed()) {
		Reporter.log("Twitter Discover Dollar page Displayed",true);
	}
	else {
		Reporter.log("Twitter Discover Dollar page not Displayed",true);
	}
	}
	
	public void ValidateLinkedin() {
		linkedinlink.click();
		
		Reporter.log("Discover Dollar page not found",true);
		
	}
		
		
	}

