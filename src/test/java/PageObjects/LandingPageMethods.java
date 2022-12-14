package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPageMethods 
{
    public WebDriver driver;
	

	public LandingPageMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By searchbox=By.xpath("//input[@type='search']");  
	private By landingpageproductname=By.cssSelector("h4.product-name");
	
	public void searchProduct(String name) 
	{
		driver.findElement(searchbox).sendKeys(name);
		
	}
	public void getProductName() throws InterruptedException {
		String landingpageproduct=driver.findElement(landingpageproductname).getText().split("-")[0].trim();
		Thread.sleep(2000);
		System.out.println(landingpageproduct+" is extracted from home page");
	}
	
	
}
