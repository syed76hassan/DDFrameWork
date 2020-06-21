package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DDContactpage {
	
	@FindBy(xpath="//a[.='Contact']/..")
	private WebElement Contact_icon;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement Nametextbox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailtextbox;
	  
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phonetextbox;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement Desigtextbox;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companytextbox;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement Msgtextbox;
	
	@FindBy(xpath="//button[@id='form-submit']")
	private WebElement sendbtn;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
	public DDContactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validate_Contact(String name,String email,String phone, String desig,String com,String msg) 
	{
		popup.click();
		
		Contact_icon.click();
        Nametextbox.sendKeys(name);
        emailtextbox.sendKeys(email);
        phonetextbox.sendKeys(phone);
        Desigtextbox.sendKeys(desig);
        companytextbox.sendKeys(com);
        Msgtextbox.sendKeys(msg);
        sendbtn.click();
        
        if(sendbtn.isDisplayed()) {
        	Reporter.log("test case failed",true);
        }
        else {
        	Reporter.log("test case pass",true);
        }
        
        
        
	}
}
