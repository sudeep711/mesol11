package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_dDelete extends BaseTest {
	
	WebDriver driver;
	public Page_dDelete(WebDriver driver) {
		
		this.driver=driver;
	}
	public void dDelete() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_option"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("delete_ok"))).click();
		
		
			
	}


	

}
