package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import PageObjects.PageobjectManager;
import stepDefinations.Hooks;


public class TestContextSetup {
	
	public WebDriver driver;
    public PageobjectManager pageobjectmanager;
    public testbase Testbase;
  
	
	public TestContextSetup() throws IOException	
	{
		Testbase=new testbase();
		pageobjectmanager=new PageobjectManager(Testbase.WebDriverManager());
		
		
	}
	
}
