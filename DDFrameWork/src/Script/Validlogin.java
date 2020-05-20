package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import Page.LoginPage;

public class Validlogin extends BaseTest {

	
	@Test
	public void testvalidlogin() {
		String un = Excel.GetValues(XL_PATH, "valid login", 1, 0);
		String pw=Excel.GetValues(XL_PATH, "valid login", 1, 1);
		Reporter.log(un+ " " +pw);
		LoginPage l=new LoginPage(d);
//		valid login
		l.login(un, pw);
		l.verifyerr("Username or Password is invalid. Please try again.");
		}

}
