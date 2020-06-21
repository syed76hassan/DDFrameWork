package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DDTeampage {
	
	@FindBy(xpath="//a[.='Team']/..")
	private WebElement team_icon;
	
	@FindBy(xpath="//span[.='Founder & CEO']/..")
	private WebElement Team_Profile;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
     public DDTeampage(WebDriver driver) {
    	 
    	 PageFactory.initElements(driver, this);
    	 
     }
     
     public void Validate_team() {
    	 
    	 popup.click();
    	 
    	 team_icon.click();
    	 
    	 Team_Profile.click();
    	 
    	 if(Team_Profile.isDisplayed()) {
    		 Reporter.log("Team Member linkedin profile should be displayed",true);
    	 }
    	 else {
    		 Reporter.log("Team Member linkedin profile not displayed",true);
    	 }
     }

}
