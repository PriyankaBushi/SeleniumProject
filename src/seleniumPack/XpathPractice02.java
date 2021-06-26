package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractice02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fatcow.com/");	
		
		
		/*WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Select sel= new Select(checkbox);
		sel.selectByIndex(2);
			  deselectByIndex(2);
		sel.deselectAll();*/
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//sel.selectByIndex(4);
		//sel.deselectByIndex(3);
		/*Thread.sleep(5000);
		
		 sel.selectByValue("AUD");
		 sel.deselectByValue("CAD");
		 Thread.sleep(5000);*/
		
		 
		
		 
		 sel.selectByVisibleText("Canada");
		 Thread.sleep(5000);
		sel.deselectByVisibleText("Europe");
		 Thread.sleep(5000);
		 //sel.selectByValue("AUD");
		// sel.deselectByValue("CAD");


	}

}
