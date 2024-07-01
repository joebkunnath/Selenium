package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/joe/Selenium/eclipse-workspace/POMFramework/DataDriven/"
					+ "src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void Initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/joe/drivers/chromedriver");
			driver = new ChromeDriver();
		}else if (browserName.contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/joe/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.MICROSECONDS);
		driver.get(prop.getProperty("url"));
	}

}
