package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDExternal_Links;
import Page.DDHomepage;

public class TC02_ValidateDiscoverDollar_External_links extends BaseTest {

		static {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			System.setProperty(GECKO_KEY, GECKO_VALUE);
		}
		@Test
		public void ValidateExternallink() {
			DDExternal_Links elinks=new DDExternal_Links(driver);
			
//			validating facebook external link
			elinks.ValidateFBlink();
			
//			validating twitter external link
			elinks.ValidateTwitterLink();
			
//			validating linkedin external Link
			elinks.ValidateLinkedin();
		}

}
