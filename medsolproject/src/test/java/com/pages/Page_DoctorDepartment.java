package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_DoctorDepartment extends BaseTest {
	

	public Page_DoctorDepartment(WebDriver driver) {
this.driver=driver;
	}
	BaseTest base=new BaseTest();
	
	public void doctordepartmentTest() throws InterruptedException {
		WebElement doctor = driver.findElement(By.xpath(pr_loc.getProperty("doctor_module")));
		Actions act = new Actions(driver);
		act.moveToElement(doctor).click().build().perform();
		
		
		Thread.sleep(2000);
		WebElement d_department = driver.findElement(By.xpath("//span[@class='menu-title']"));
		//Actions act = new Actions(driver);
		act.moveToElement(d_department).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='New Doctor Department']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Dental");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("new dental doctor");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='doctorDepartmentSave']")).click();
	}
  
  }

  
	  
  
	  
	
	
		
	

	

