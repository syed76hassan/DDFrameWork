package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DDHomepage {
	
	
	public DDHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyTitle(WebDriver driver,String expected) {
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
}
