package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.out.println("welcome to java");
		LissMariya a = new LissMariya();
		
//		System.setProperty("webdriver.chrome.driver", "//Users//joe//drivers//chromedriver");
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "//Users//joe//drivers//geckodriver");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		//div/input[@name="pass"]
		driver.quit();
	}

}
