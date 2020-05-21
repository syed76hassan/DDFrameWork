package Script;

import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class Runmulti {

	@Parameters({"ip","browser"})
	public void data(String ip,String browser){
		Reporter.log(ip+" "+browser,true);
		
	}
	}


