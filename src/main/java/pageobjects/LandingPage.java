package pageobjects;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LandingPage {

	public WebDriver driver;
	

	By signin=By.cssSelector("a[herf*='sign_in']");
		
	
	/*By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navbar=By.cssSelector("#navbar");*/
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public WebElement getLogin() {
		
		return driver.findElement(signin);
		
	}
	
/*public WebElement getTitle() {
		
		return driver.findElement(title);
		
	}
	
public WebElement geNavigationbar() {
	
	return driver.findElement(navbar);
	
}
	*/
	
	
	
	

	
	
	
	
	
}
