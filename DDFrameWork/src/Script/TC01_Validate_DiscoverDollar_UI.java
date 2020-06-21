package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDHomepage;

public class TC01_Validate_DiscoverDollar_UI extends BaseTest {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

	@Test
	public void ValidateHomepage() {
		DDHomepage dd=new DDHomepage(driver);
		dd.VerifyTitle(driver,"Discover Dollar");
	}
}
