package utility;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.pages.BaseTest;

public class DatePicker extends BaseTest   {
	
	public DatePicker(WebDriver driver)
	{
		this.driver=driver;
	}
	public void datePick() throws InterruptedException
	{
		driver.findElement(By.xpath(pr_date.getProperty("dob_field"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_date.getProperty("year_field"))).clear();
		driver.findElement(By.xpath(pr_date.getProperty("year_field"))).sendKeys(pr_date.getProperty("year_value"));
		
		Thread.sleep(2000);
		WebElement mt= driver.findElement(By.xpath(pr_date.getProperty("month_field")));
		Select slt=new Select(mt);
		slt.selectByVisibleText(pr_date.getProperty("month_value"));
		
		java.util.List<WebElement> dates=driver.findElements(By.xpath(pr_date.getProperty("date_field")));
		
		for(WebElement elem:dates)
		{
			
			String dt=elem.getText();
			if(dt.equals(pr_date.getProperty("date_value")))
			{
				elem.click();
				break;
			}
			
		}
		
	}
	

}
