package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDSolutionspage {

	@FindBy(xpath="//a[.='Solutions']/..")
	private WebElement Solution_icon;
	
	@FindBy(xpath="//h3[.='Discover Dollar Search']/..//a[.='Learn More']")
	private WebElement Search;
	
	@FindBy(xpath="//span[.='Click here to talk to an expert']")
	private WebElement expert;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
	public DDSolutionspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validateSolutions(WebDriver driver) {

		popup.click();
		//Navigate to solution icon
		Solution_icon.click();
		
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		  Search.click();
		
		expert.click();
	}
	
}
