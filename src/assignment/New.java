package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class New {
	WebDriver driver;
	
	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement webElement = driver.findElement(By.xpath("//a[.='Pendants ']"));
		Actions act = new Actions(driver);
		act.moveToElement(webElement).perform();
		Thread.sleep(2000);
		//prachi patil
		driver.findElement(By.xpath("//span[.='Mangalsutra']")).click();
		String price = driver.findElement(By.xpath("(//span[@id='bst-discounted-price' and @class='new-price'])[1]")).getText();
	    Reporter.log(""+price,true);
	   
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
