package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;

public class TestActitimeToGetSettingsDropdown extends BaseTest {
	
	@Test
	public void getAllTheDropdownsOfSettings() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib=new Flib();
		String username = flib.readPropFile(PROP_PATH, "username");
		String password = flib.readPropFile(PROP_PATH, "password");
		lp.actitimeValidLogin(username, password);
		Thread.sleep(3000);
		
		SettingsPage st = new SettingsPage(driver);
		st.clickOnSettingsLink();
		
		WebDriverCommonLib lib = new WebDriverCommonLib();
		lib.getAllOptions(st.getMiddlegroupinglevel());
		lib.getAllOptions(st.getTopgroupinglevel());
		lib.getAllOptions(st.getTimeentrylevel());
	}

}
