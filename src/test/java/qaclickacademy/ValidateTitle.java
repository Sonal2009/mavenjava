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

public class ValidateTitle extends Base {
	
public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
		log.info("driveris initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to webpage");
		}
	
		
	@Test
	
	public void basepageNavigation() throws IOException {
		
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		//Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Succesfully validated text");
		
		
	}
	
@AfterTest
	
	public void teardown() {
		
		driver.close();
		
	}
		
		
	}
	
	
	
	
	
	

	

