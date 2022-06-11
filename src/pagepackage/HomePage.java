package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//declaration
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTasks;
	@FindBy(xpath = "//div[.='Settings']") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	
	
	
	//initialization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getCreateNewTasks() {
		return createNewTasks;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}
	
	//operational Methods
	
	
	public void actitimeLogout()
	{
		
		logoutLink.click();
	}

}
