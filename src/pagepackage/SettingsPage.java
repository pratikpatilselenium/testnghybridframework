package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	
	
	//declaration
	@FindBy(xpath = "//a[@class='content administration']") private WebElement settingsLink;
	@FindBy(xpath = "//select[@name='firstHierarchyLevelCode']")private WebElement Topgroupinglevel;
	@FindBy(xpath = "//select[@name='secondHierarchyLevelCode']") private WebElement Middlegroupinglevel;
	@FindBy(xpath = "//select[@name='thirdHierarchyLevelCode']")  private WebElement Timeentrylevel;
	
	
	//initialization

	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getSettingsLink() {
		return settingsLink;
	}
	public WebElement getTopgroupinglevel() {
		return Topgroupinglevel;
	}
	public WebElement getMiddlegroupinglevel() {
		return Middlegroupinglevel;
	}
	public WebElement getTimeentrylevel() {
		return Timeentrylevel;
	}
	
	
	
	public void clickOnSettingsLink()
	{
		
		settingsLink.click();
	}

}
