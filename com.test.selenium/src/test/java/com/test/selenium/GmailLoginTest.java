package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginTest {
	
	WebDriver driver;

	@Test
	public void logintest() {
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		String expectedtitle = "Sign in - Google Accounts";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Test case is passed");
}

}