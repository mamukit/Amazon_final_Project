package com.BaseAmazonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.AmazonPFMaster.AmazonPFMaster;

public class BaseAmazonLogin {

	WebDriver driver;
	AmazonPFMaster apf;

	public void geturl() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/macmini/eclipse-workspace/Amazon_Final/Driver/chromedriver");
		
		
		
		driver = new ChromeDriver();
		apf = PageFactory.initElements(driver, AmazonPFMaster.class);
		driver.navigate().to(apf.getURL());
		driver.manage().window().maximize();
	}

	public void getlogin() {
		apf.getSignInBox().click();
		apf.getEmailAdd().sendKeys(apf.getUserName());
		apf.getPassBox().sendKeys(apf.getPassWord());
		apf.getSignInTab().click();
	}

	public void loginValidation() {
		System.out.println(apf.getTextValedation().getText());

		if (apf.getTextValedation().getText().equalsIgnoreCase("Hi, Akija")) {

			System.out.println("Login Test Pass");
		}
		else {
			System.out.println("Test failed ");
		}
	}

	public void teardown() {
		driver.quit();
	}

}
