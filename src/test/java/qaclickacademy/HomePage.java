package qaclickacademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	
	
	@Test 
	
	public void basePageNavigation() throws IOException {
		
		driver=InitializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
	}
	
	
	
		
	
	
	/*public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
		
		
	}
	
	
	@Test(dataProvider="getData")
	
	public void basepageNavigation(String username, String  password ) throws IOException, InterruptedException {
		driver.get("http://qaclickacademy.com");
	


		//driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		data[0][0]="nonRestricted";
		data[0][1]="1234";
		
		
		data[1][0]="nonrestricted123";
		data[1][1]="45678";
		
		
		return data;
		
		
		
	}
@AfterTest
	
	public void teardown() {
		
		driver.close();
		*/
	
	
	
	
	}
	
	
	
	
	
	
	

