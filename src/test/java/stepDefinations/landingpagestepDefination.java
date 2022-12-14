package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPageMethods;
import PageObjects.PageobjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class landingpagestepDefination{

	public WebDriver driver;
	TestContextSetup testcontextsetup;

	public landingpagestepDefination(TestContextSetup testcontextsetup) 
	{
		this.testcontextsetup=testcontextsetup;
	}

	@Given("^User is on Greenkart landing page$")
	public void User_is_on_Greenkart_landing_page()
	{
//		System.setProperty("webdriver.chrome.driver", "C://Users//Sayli//Downloads//chromedriver_win32//chromedriver.exe");
//		testcontextsetup.driver= new ChromeDriver();	
//		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
    
		LandingPageMethods landingpagemethods= testcontextsetup.pageobjectmanager.getLandingPage();
		landingpagemethods.searchProduct(shortname);
		Thread.sleep(2000);
		landingpagemethods.getProductName();
	}

}
