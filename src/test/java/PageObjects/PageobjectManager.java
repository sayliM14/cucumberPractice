package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	
	public LandingPageMethods landingpagemethods;
	public WebDriver driver;
	
	public PageobjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	public LandingPageMethods getLandingPage() {
		landingpagemethods =new LandingPageMethods(driver);
		return landingpagemethods;
		
	}
}
