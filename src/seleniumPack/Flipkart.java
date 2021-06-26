package seleniumPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {

	public static WebDriver driver;

	@BeforeTest
	public void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}

	@Test
	public void flipkartSearch() throws InterruptedException {

		 WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
		 searchbar.sendKeys("mobiles");

		 WebElement searchbutton =
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		 searchbutton.click();

		Thread.sleep(5000);

		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println("before loop="+mobiles);

		for (int i = 0; i < mobiles.size(); i++) {

			System.out.println("Mobile Names :");

			System.out.println(mobiles.get(i).getText());
		}

		/*
		 * @AfterTest
		 * 
		 * public void teardown() { driver.close(); }
		 */

	}
}
