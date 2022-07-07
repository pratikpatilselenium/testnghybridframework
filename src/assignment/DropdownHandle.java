package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://carbondesignsystem.com/components/select/usage/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='select-1']"));
		dropdownElement.click();
		WebElement element = driver.findElement(By.xpath("//label[.='Select']"));
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(2000);
		
		Select sel = new Select(dropdownElement);
		List<WebElement> opt = sel.getOptions();
		for (int i=0;i<=opt.size()-1;i++)
		{
			
			WebElement list = opt.get(i);
			String options = list.getText();
			System.out.println(options);
		}
		
		

	}

}
