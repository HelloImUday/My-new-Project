package pageclass.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilclass.BaseClass;

public class TimesheetModule extends BaseClass{

	
	public  TimesheetModule() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[text()=' Missing Timesheets ']//parent::div//div)[1]")
	public WebElement missingTimesheetCountButton1;
	
	@FindBy(xpath="//div[text()='Select Worker']//parent::div//div[contains(@class,'ht')]")
	WebElement selectWorkerDropdown;
	@FindBy(xpath="(//span[text()='active one']//ancestor::tr//grid-column//span[@id='gridColumnsummary'])[6]")
	WebElement missingTimesheetCount;
	
	
	public void missingTimesheetCountButton() throws InterruptedException {
		try {
			Thread.sleep(3000);
	//		driver.findElement(By.xpath("(//div[text()=' Missing Timesheets ']//parent::div//div)[1]")).click();
		missingTimesheetCountButton1.click();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void selectWorkerDropdown() {
		selectWorkerDropdown.click();
	}
	public void missingTimesheetCount() throws InterruptedException {
		Thread.sleep(2000);
		missingTimesheetCount.click();
	}
	
}

