package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DDNewspage {

	@FindBy(xpath="//a[.='News']/..")
	private WebElement News_icon;
	
	@FindBy(xpath="//h2[.=\"News updates\"]")
	private WebElement News_header;
	
	@FindBy(xpath="//a[.='I Accept!']")
	private WebElement popup;
	
	public DDNewspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Validate_News(String expected) {
		
		popup.click();
		News_icon.click();
		
		String actual = News_header.getText();
		Assert.assertEquals(actual, expected);
	}
}
