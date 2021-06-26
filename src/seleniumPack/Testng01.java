package seleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng01 {
	
	@Test
	public void isHomePageisDisplayed() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.fatcow.com/");	
		 
		 WebElement homepageicon = driver.findElement(By.xpath("//a[text()='FatCow Web Hosting & Domain Names']"));
		 
		 boolean actualcondition= homepageicon.isDisplayed();
		 
		 Assert.assertTrue(actualcondition, "element is not present");
		 


		 driver.close();
		 
	}

}













































