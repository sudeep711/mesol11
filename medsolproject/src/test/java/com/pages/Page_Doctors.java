package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.DatePicker;

public class Page_Doctors extends BaseTest{
	
	
	
	public Page_Doctors(WebDriver driver)
	{
		this.driver=driver;
	}
	public void doctorsTest() throws InterruptedException
	{
		WebElement doctor= driver.findElement(By.xpath(pr_loc.getProperty("doctor_module")));
		Actions act=new Actions(driver);
		act.moveToElement(doctor).click().build().perform();
		
		driver.findElement(By.id(pr_loc.getProperty("actions"))).click();
		driver.findElement(By.xpath(pr_loc.getProperty("new_doctor"))).click();
		driver.findElement(By.id(pr_loc.getProperty("first_name"))).sendKeys("Sudeep");
		driver.findElement(By.id(pr_loc.getProperty("last_name"))).sendKeys("Mankare");
		
		driver.findElement(By.xpath(pr_loc.getProperty("doctor_dept"))).click();
		WebElement department=driver.findElement(By.xpath(pr_loc.getProperty("dept_sbox")));
		department.sendKeys("gen");
		department.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath(pr_loc.getProperty("email"))).sendKeys("abcdeug@gmail.com");
		WebElement emailInput =driver.findElement(By.xpath("//input[@id='createAccountantEmail']"));
		
		String dynamicEmail= "user" + UUID.randomUUID().toString() + "@hms.com";
		//Enter the dynamic first_nameinto the input field
		emailInput.sendKeys(dynamicEmail);
		
		driver.findElement(By.xpath(pr_loc.getProperty("designation"))).sendKeys("General_doctor");
		driver.findElement(By.xpath(pr_loc.getProperty("qualification"))).sendKeys("MBBS");
	
		driver.findElement(By.xpath(pr_loc.getProperty("blood_group"))).click();
		WebElement bgroup=driver.findElement(By.xpath(pr_loc.getProperty("blood_sbox")));
		bgroup.sendKeys("B+");
		bgroup.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(pr_loc.getProperty("specialist"))).sendKeys("specialist_in_bones");
		driver.findElement(By.xpath(pr_loc.getProperty("password"))).sendKeys("123456");
		driver.findElement(By.xpath(pr_loc.getProperty("confirm_password"))).sendKeys("123456");
		
		DatePicker date=new  DatePicker(driver);
		date.datePick();
		
		
//		Thread.sleep(3000);
//		WebElement save=driver.findElement(By.xpath(pr_loc.getProperty("save_button")));
//		act.moveToElement(save).click().build().perform();
		
		
		
	}
	
	

}
