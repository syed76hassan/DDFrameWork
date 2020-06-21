package Script;

import org.testng.annotations.Test;

import Generic.AutoUtil;
import Generic.BaseTest;
import Generic.Excel;
import Page.DDContactpage;

public class TC07_ValidateDiscoverDollarContact_page extends BaseTest {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Test
	public void Validate_Contactpage() {
		
		String name = Excel.GetValues(XL_PATH, "valid contact", 1, 0);
		
		String email = Excel.GetValues(XL_PATH, "valid contact", 1, 1);
		String phone = Excel.GetValues(XL_PATH, "valid contact", 1, 2);
		String desig = Excel.GetValues(XL_PATH, "valid contact", 1, 3);
		String com = Excel.GetValues(XL_PATH, "valid contact", 1, 4);
		String msg = Excel.GetValues(XL_PATH, "valid contact", 1, 5);
		
		
		DDContactpage cc=new DDContactpage(driver);
	cc.validate_Contact(name, email, phone, desig, com, msg);
	}
}
