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

public class FlipkartLogin {

	public static WebDriver driver; 
	
	@BeforeTest
	public static void init(){
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
		 
		 
	 }
	
	@Test
	public static void flipkartLogin() {
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();
		
		//a[@class='_1_3w1N']
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginbutton.click();
		
		//input[@class='_2IX_2- VJZDxU']
		WebElement enteremailid = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		enteremailid.sendKeys("stevepaul263@gmail.com");
		
		//input[@class='_2IX_2- _3umUoc _3mctLh VJZDxU']
		WebElement enterpassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _3mctLh VJZDxU']"));
		enterpassword.sendKeys("Chopperz1!");
		
				
		WebElement submit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		submit.click();
		
		/*
		 * WebElement flipkartAfterLoginLogo =
		 * driver.findElement(By.xpath("//div[text()='Flipkart']")); boolean condition =
		 * flipkartAfterLoginLogo.isDisplayed(); Assert.assertTrue(condition,
		 * "Login Failure");
		 */
		
		/*
		 * @AfterTest public void teardown() { driver.quit();
		 * 
		 * }
		 */
		 
		
		
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

