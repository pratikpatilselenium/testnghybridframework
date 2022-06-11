package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	
	@Test
	public void actitimeLogout() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib=new Flib();
		String username = flib.readPropFile(PROP_PATH, "username");
		String password = flib.readPropFile(PROP_PATH, "password");
		lp.actitimeValidLogin(username, password);
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.actitimeLogout();
	}

}
