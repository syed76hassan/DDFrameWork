package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDNewspage;

public class TC06_ValidateDiscoverDollar_News extends BaseTest {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Test
	public void Validate_Newspageheader() {
          DDNewspage nw=new DDNewspage(driver);
          nw.Validate_News("NEWS UPDATES");
          }
	}
