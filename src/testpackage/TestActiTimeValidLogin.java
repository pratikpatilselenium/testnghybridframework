package testpackage;

import java.io.IOException;



import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {
	
	@org.testng.annotations.Test
	public void actitimeValidLogin() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib=new Flib();
		String username = flib.readPropFile(PROP_PATH, "username");
		String password = flib.readPropFile(PROP_PATH, "password");
		lp.actitimeValidLogin(username, password);
	}

}
