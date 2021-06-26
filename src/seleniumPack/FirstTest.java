package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTest {

	public static void main(String[] args) {
		//set key and value - System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//String baseUrl = "https://www.facebook.com/";
		 //driver.get(baseUrl);
		// WebDriver driver = new InternetExplorerDriver();
		 
		 //WebDriver driver = new FirefoxDriver();
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.bing.com/");

		 driver.navigate().to("https:\\www.google.com");
		 driver.navigate().to("http://www.gmail.com");
		 driver.navigate().back();
		 
		 driver.getCurrentUrl(); 
		 
		 String utl= driver.getCurrentUrl();
		 
		 if(utl.contains("google")) {
			 System.out.println(utl);
			 System.out.printf("Back page loaded successfully",utl);
		 }
			 else {
				 
				 System.out.println("google page is not loaded");
		 }
		 //driver.close();
	}
}

























































