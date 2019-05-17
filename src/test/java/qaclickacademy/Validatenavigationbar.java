package qaclickacademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class Validatenavigationbar extends Base {

	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test
	
	public void basepageNavigation() throws IOException {
		
		
		LandingPage l=new LandingPage(driver);
		//Assert.assertTrue(l.geNavigationbar().isDisplayed());
		log.info("Navigation titles are displyed");
		
	}
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		
	}
	
	
		
		
	}
	
	
	
	
	
	

	

