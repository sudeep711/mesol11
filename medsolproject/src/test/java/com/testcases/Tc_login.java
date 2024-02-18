package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_login;

public class Tc_login extends BaseTest {

	BaseTest base=new BaseTest();
	@BeforeTest(groups="smoke") 
	
	public void  url_open() throws IOException
	{
		base.setup();
	}
	@Test(groups="smoke")
	public void loginTest() 
	{
		Page_login log=new Page_login(base.getdriver());
		log.login();
	}
	
	@AfterTest(groups="smoke")
	public void url_close()
	{
		base.teardown();
	}
	
}
