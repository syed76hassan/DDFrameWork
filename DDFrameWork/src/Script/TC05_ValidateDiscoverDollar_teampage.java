package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDTeampage;

public class TC05_ValidateDiscoverDollar_teampage extends BaseTest {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

	@Test
	public void Validate_TeamPage() {
		DDTeampage t=new DDTeampage(driver);
		t.Validate_team();
	}
}
