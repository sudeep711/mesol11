package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_login extends BaseTest {
	
	
	public Page_login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login()
	{
		driver.findElement(By.id(pr_loc.getProperty("user_field"))).sendKeys(pr.getProperty("user"));
		driver.findElement(By.id(pr_loc.getProperty("pass_field"))).sendKeys(pr.getProperty("password"));
		driver.findElement(By.xpath(pr_loc.getProperty("button"))).click();
	}

}
