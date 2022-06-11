package pagepackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Flib;

public class LoginPage extends BaseTest {
	
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckbox;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenceLink;
	
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckbox() {
		return keepMeLoggedInCheckbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenceLink() {
		return licenceLink;
	}
	
	//generic reusable methods
	
	public void actitimeValidLogin(String username,String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
		
	}
	
	public void actitimeInvalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib=new Flib();
		int rc = flib.getLastRowNumber(EXCEL_PATH,"invalidcreds" );
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			usn.sendKeys(username);
			pass.sendKeys(password);
			loginBtn.click();
			Thread.sleep(2000);
			usn.clear();
			
		}
		
	}


}
