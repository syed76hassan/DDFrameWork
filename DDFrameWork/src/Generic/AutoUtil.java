package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoUtil {

	public static String GetPhoto(WebDriver d,String folder, String name) {
		String path="";
		try {
			String dd = new Date().toString();
			String datetime = dd.replaceAll(":", "-");
			path=folder+datetime+name+ " .png";
			TakesScreenshot t=((TakesScreenshot)d);
			File srcfile = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File(path));
		}
		catch(Exception e) {}
		return path;
	}
	
	public static String GetProperty(String path,String key) {
		String v="";
		try {
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e) {
		}
		return v;
	}
	
	
}
