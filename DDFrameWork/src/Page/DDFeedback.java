package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class DDFeedback {


	@FindBy(xpath="//div[.='                                Feedback                            ']/..//div[1]")
    private WebElement Feedback;
	
	@FindBy(xpath="//span[.='Like']")
	private WebElement like;
	
	@FindBy(xpath="//textarea[@placeholder='Tell us about your experience...']")
	private WebElement Msgbox;
	
	@FindBy(xpath="//input[@placeholder=\"email@domain.com\"]")
	private WebElement emailbox;
	
	@FindBy(xpath="//button[.='Send']")
	private WebElement sendbtn;
	
	@FindBy(xpath=" //span[.='Thank you for sharing your feedback with us!']/../parent::div")
	private WebElement feedbackmsg;

    @FindBy(xpath="//button[.='Skip']")
    private WebElement Skipbtn;
    
    @FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
    
    public DDFeedback(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void ValidateFeedback(String msg, String mail) {
    	
    	popup.click();
    	
//    	click on feedback
    	Feedback.click();
    	
//    	select the ratings
    	like.click();
    	
    	
    	
//    	enter the feedback
    	Msgbox.sendKeys(msg);
    	
    	if(sendbtn.isEnabled()) {
    		Reporter.log("send button enabled",true);
    	}
    	else {
    		Reporter.log("send button disabled",true);
    	}
//  click on send button
    	sendbtn.click();
    	
//    	enter the email id
    	emailbox.sendKeys(mail);
    	
    
    }
}


