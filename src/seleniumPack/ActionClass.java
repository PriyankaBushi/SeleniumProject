package seleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		//driver.get("https://www.browserstack.com/");
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	}
	
	@Test
	public void mouseAndKeyboardEvents() {
		//unable to click on the get started button 
		//WebElement ele = driver.findElement(By.xpath("//a[text()='Get started free']"));
		
	//LIVE
		
		//WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Contact us')] /following::a[@title='Live']"));
		
		
		//Actions action = new Actions(driver);
		//action.moveToElement(ele).build().perform();
		
		
		//double click free trail
		
		//WebElement ele = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		//Actions action = new Actions(driver);
		//action.doubleClick(ele).build().perform();
		
		//Drag and drop
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 Actions action = new Actions(driver);
		 action.dragAndDrop(bank, account).build().perform();
			
		
		
		
		
		

		
		}
	
	
	
	
}
