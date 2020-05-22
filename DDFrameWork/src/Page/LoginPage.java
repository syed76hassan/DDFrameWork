package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement untb;
	
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pwtb;
	
	@FindBy(xpath="//input[@id='u_0_4']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement err;
	
	
	public LoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void login(String un,String pw) {
		untb.sendKeys(un);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		pwtb.sendKeys(pw);
		loginbtn.click();
	}
	
	public void verifyerr(String expected) {
		String actual = err.getText();
		Assert.assertEquals(actual, expected);
		
	}

}
