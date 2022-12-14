package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
//	public WebDriver driver;
//	
//	public WebDriver WebDriverManager()
//	{
//		System.setProperty("webdriver.chrome.driver", "C://Users//Sayli//Downloads//chromedriver_win32//chromedriver.exe");
//		driver= new ChromeDriver();	
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		return driver;
//
//	}
//	
	
public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream("src//test//resources//global.properties");
		Properties prop=new Properties(); 
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		if(driver==null) {
				System.setProperty("webdriver.chrome.driver", "C://Users//Sayli//Downloads//chromedriver_win32//chromedriver.exe");
				driver= new ChromeDriver();	
			    driver.get(url);		   
		}
		
		return driver;
	}
}