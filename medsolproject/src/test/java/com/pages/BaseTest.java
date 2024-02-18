package com.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public static WebDriver driver;
public static FileReader file;
public static Properties pr=new Properties();

public static FileReader file_loc;
public static Properties pr_loc=new Properties();

public static FileReader file_date;
public static Properties pr_date=new Properties();

public static FileReader file_data;
public static Properties pr_data=new Properties();


public WebDriver getdriver()
{
	return driver;
}

	public void setup() throws IOException
	{
		if(driver==null)
		{
			file=new  FileReader("C:\\Users\\sandeep\\eclipse-workspace\\sudeepa1234\\medsolproject\\src\\test\\resources\\config files\\configuration.properties");
			pr.load(file);
			
			file_loc=new  FileReader("C:\\Users\\sandeep\\eclipse-workspace\\sudeepa1234\\medsolproject\\src\\test\\resources\\config files\\locators.properties");
			pr_loc.load(file_loc);
			
			
			file_date=new FileReader("C:\\Users\\sandeep\\eclipse-workspace\\sudeepa1234\\medsolproject\\src\\test\\resources\\config files\\date.properties");
			pr_date.load(file_date);
			
//			file_data=new FileReader("");
//			pr_data.load(file_data);
		}
		
		if(pr.getProperty("broswer").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			
			driver.get(pr.getProperty("testurl"));
			driver.manage().window().maximize();
		}
		
		else if(pr.getProperty("browser").equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			
			driver.get(pr.getProperty("testurl"));
			driver.manage().window().maximize();
		}
	}
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
}