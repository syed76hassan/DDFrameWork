package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDFeedback;

public class TC03_ValidateDiscoverDollar_feedback extends BaseTest {

	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Test
	public void Validate_Feedbackpage() {
		
		DDFeedback fb=new DDFeedback(driver);
		
		fb.ValidateFeedback("i want to know more about company", "abcd@gmail.com");
	}
}
