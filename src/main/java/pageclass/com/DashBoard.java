package pageclass.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilclass.BaseClass;

public class DashBoard extends BaseClass {

	public DashBoard() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fas fa-times popup_savecloseIcon']")
	WebElement popupCloseIcon;
	@FindBy(id = "topbar-menu-text")
	WebElement clickMenuBar;
	@FindBy(id = "tabName21")
	WebElement clickCandidate;
	@FindBy(id = "tabName27")
	WebElement clickTimesheet;

	public void popupClose() {
		try {
			Thread.sleep(5000);
			boolean status = true;
			while (status) {
				List<WebElement> elements = driver
						.findElements(By.xpath("//i[@class='fas fa-times popup_savecloseIcon']"));
				if (elements.size() != 0) {
					popupCloseIcon.click();
				} else {
					status = false;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickMenuBar() {
        
		clickMenuBar.click();

	}

	public void clickCandidate() {
		try {
			Thread.sleep(2000);
		//	WebElement element = driver.findElement(By.xpath("//div[@id='main-menu-list']//span[normalize-space()='" + menuName + "']"));
			//WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Assignments']"));
			//element.click();
			clickCandidate.click();
			
			System.out.println("click sub menu candidate successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
			
		}
	public void clickTimesheet() throws InterruptedException {
	
		Thread.sleep(2000);
		clickTimesheet.click();
		
		System.out.println("Click sub menu timesheet successfully");
	}
}
	

