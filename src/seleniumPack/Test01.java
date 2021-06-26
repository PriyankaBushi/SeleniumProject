package seleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 
	} 
	@Test
	public void loginPositive() throws InterruptedException {
		 
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("admin");
		
		 WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		 password.sendKeys("manager");
		 
		 WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		 login.click();
		 
		 Thread.sleep(5000);
		//a[contains(@class,'userProfileLink username ')]
		 
		 WebElement loginName =driver.findElement(By.xpath("//a[@class='userProfileLink username ']"));
		 
		 String actualText = loginName.getText();
		 String expectedText = "John Doe";
		 
		 Assert.assertEquals(actualText, expectedText, "Failure - Login failed");
		 
	}
	@Test
	public void loginPositive1() throws InterruptedException {
		 
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("trainee");
		
		 WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		 password.sendKeys("trainee");
		 
		 WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		 login.click();
		 
		 Thread.sleep(5000);
		//a[contains(@class,'userProfileLink username ')]
		 
		 WebElement loginName =driver.findElement(By.xpath("//a[@class='userProfileLink username ']"));
		 
		 String actualText = loginName.getText();
		 String expectedText = "Michelle Long";
		 
		 Assert.assertEquals(actualText, expectedText, "Failure - Login failed");
		 
	}
		
	@Test
	public void loginNegative() throws InterruptedException {
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("trainee");
		
		 WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		 password.sendKeys("Priya");
		 
		 WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		 login.click();
		 
		 Thread.sleep(5000); ////span[@class='errormsg']
		 WebElement errorMessage = driver.findElement(By.xpath("//span[@class='errormsg']"));
		 
		 String errorMessageText = errorMessage.getText();
		
		 String expectederrorMessageText = "Username or Password is invalid. Please try again.";
		 
		 Assert.assertEquals(errorMessageText, expectederrorMessageText);
		 
	}
	
	@Test
	public void loginNegative1() throws InterruptedException {
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("Priya");
		
		 WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		 password.sendKeys("Trainee");
		 
		 WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		 login.click();
		 
		Thread.sleep(5000);
		 WebElement errorMessage = driver.findElement(By.xpath("//span[@class='errormsg']"));
		 
		 String errorMessageText = errorMessage.getText();
		
		 String expectederrorMessageText = "Username or Password is invalid. Please try again.";
		 
		 Assert.assertEquals(errorMessageText, expectederrorMessageText);
		 
	}
	
	@AfterTest
	
	public void teardown() {
		driver.quit();
	}                          
	                    
}
















































