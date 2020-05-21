package Generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseTest implements IAutoConst {
	public WebDriver d;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"ip","browser"})
	public void OpenApp(String ip,String browser) {
		String url = AutoUtil.GetProperty(CONFIG_PATH, "url");
		String ito = AutoUtil.GetProperty(CONFIG_PATH, "ito");
		
		long ito1 = Long.parseLong(ito);
		try {
			URL url1=new URL("http://"+ip+":4444/wd/hub");
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
			d=new RemoteWebDriver(url1,dc) ;
		} catch (Exception e) {
		}
		
		d.get(url);
		d.manage().timeouts().implicitlyWait(ito1, TimeUnit.SECONDS);
		
	}
	@AfterMethod(alwaysRun=true)
	public void CloseApp(ITestResult test) {
		String name = test.getName();
		int status = test.getStatus();
		if(status==1) {
			Reporter.log(name + " is passed ",true);
		}
		else {
			Reporter.log(name+ " is failed ",true);
			AutoUtil.GetPhoto(d, IMG_PATH,name);
		}
		d.close();
	}

}
