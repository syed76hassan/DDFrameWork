package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.DDSolutionspage;

public class TC04_ValidateDiscoverDollar_Solutionspage extends BaseTest {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Test
	public void Validate_Solutionpage() {
		
		DDSolutionspage s=new DDSolutionspage(driver);
		s.validateSolutions(driver);
	}
}
