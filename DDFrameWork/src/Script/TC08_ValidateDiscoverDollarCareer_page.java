package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import Page.DDCareerPage;

public class TC08_ValidateDiscoverDollarCareer_page extends BaseTest {

	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Test
	public void validate_CareerPage() {
        String Name = Excel.GetValues(XL_PATH, "valid career", 1, 0);
		
		String emailad = Excel.GetValues(XL_PATH, "valid career", 1, 1);
		String contactno = Excel.GetValues(XL_PATH, "valid career", 1, 2);
		String position = Excel.GetValues(XL_PATH, "valid career", 1, 3);
		String message = Excel.GetValues(XL_PATH, "valid career", 1, 4);
		String fileupload = Excel.GetValues(XL_PATH, "valid career", 1, 5);
		
		DDCareerPage cp=new DDCareerPage(driver);
		cp.Validate_CareerPage(Name, emailad, contactno, position, message, fileupload);
		
		
	}
}
