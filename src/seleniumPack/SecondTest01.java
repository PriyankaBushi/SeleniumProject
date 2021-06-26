package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("https:demo.actitime.com");
		 driver.navigate().to("https://www.seleniumeasy.com/test/");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 //Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 //Thread.sleep(1000);
		 //driver.findElement(By.xpath("//a[@id='loginButton']/div)
		 
		 //https://www.seleniumeasy.com/test/
	}

}
