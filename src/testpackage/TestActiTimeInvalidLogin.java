package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import pagepackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {
	
	
	@Test
	public void actitimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.actitimeInvalidLogin();
		
	}

}
