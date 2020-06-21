package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDCareerPage {

	
	@FindBy(xpath="//a[.='Careers']/..")
	private WebElement Contact_icon;
	
	
	@FindBy(xpath="//input[@name='form-name']")
	private WebElement nametb;
	
	@FindBy(xpath="//input[@name='form-email']")
	private WebElement emailtb;
	
	@FindBy(xpath="//input[@name='form-phone']")
	private WebElement phonetb;
	
	@FindBy(xpath="//input[@name='form-position']")
	private WebElement positiontb;
	
	@FindBy(xpath="//textarea[@name='form-message']")
	private WebElement msgtb;
	
	@FindBy(xpath="//button[.='Post →']")
	private WebElement postbtn;
	
	@FindBy(xpath="//input[@name='fileToUpload']")
	private WebElement fileupload;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
	
	public DDCareerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Validate_CareerPage(String name, String email, String phone, String position, String message, String filepath) {
		popup.click();
		Contact_icon.click();
		nametb.sendKeys(name);
		emailtb.sendKeys(email);
		phonetb.sendKeys(phone);
		positiontb.sendKeys(position);
		msgtb.sendKeys(message);
		fileupload.sendKeys(filepath);
		postbtn.click();
		
		
	}
	
}
