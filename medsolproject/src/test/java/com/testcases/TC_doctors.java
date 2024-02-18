package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_Doctors;
import com.pages.Page_dEdit2;
import com.pages.Page_login;

public class TC_doctors {
	
	BaseTest base=new BaseTest();
	
	@BeforeTest(groups="smoke")
	public void url_open() throws IOException
	{
		base.setup();
	}
	
	@Test(priority=1)
	public void logintest()
	{
		Page_login log=new Page_login(base.getdriver());
		log.login();
	}
	
	@Test(priority=2,groups="smoke")
	public void doctorsTest() throws InterruptedException
	{
		Page_Doctors doc=new Page_Doctors(base.getdriver());
		doc.doctorsTest();
		
		
		
		
	}			
	
	
	
	
	//@AfterTest
	public void url_close()
	{
	base.teardown();	
	}

}
//userf992d792-9fd9-474b-a6d8-6fce9f3f95a8@hms.com
//user36460e0b-ebd4-4366-8943-533fb4b164e9@hms.com