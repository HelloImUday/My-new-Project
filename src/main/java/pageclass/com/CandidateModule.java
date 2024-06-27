package pageclass.com;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilclass.BaseClass;

public class CandidateModule extends BaseClass {
	public CandidateModule(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='contentHeader']//b")
	WebElement headername;
	@FindBy(xpath ="//div[@class='search-textbox-group ng-star-inserted']//input")
	WebElement candidateModuleGlobalSearch;
	@FindBy(xpath = "//span[@class='ui-button-icon-left ui-clickable fas fa-plus']")
	WebElement createCandidateButton;
	@FindBy(xpath = "//label[text()='First Name']//ancestor::cpl-textbox//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']")
	WebElement salutation;
	@FindBy(xpath = "//li//div[@title='Mr']")
	WebElement salutationMr;
	@FindBy(xpath ="//label[text()='First Name']//ancestor::cpl-textbox//span//input")
	WebElement firstName;
	@FindBy(xpath ="//label[text()='Resume ']//ancestor::cpl-fileupload//input")
	WebElement resume;
	@FindBy(xpath ="//p-autocomplete[@id='21005']//input")
	WebElement jobTitle;
	@FindBy(xpath ="//input[@id='attachmentName021063']")
	WebElement attachmentName;
	@FindBy(xpath = "//label[text()='Bill Rate']//ancestor::app-ratetype//input[@id='21028']")
	WebElement billRate;
	@FindBy(xpath = "//label[text()='Pay Rate']//ancestor::app-ratetype//input[@id='21027']")
	WebElement payRate;
	@FindBy(xpath = "//label[text()=' Date Of Birth']//ancestor::cpl-date//input")
	WebElement dateOfBirth;
	@FindBy(xpath = "(//span[text()='Years']//ancestor::div//p-spinner//input)[1]")
	WebElement expYears;
	@FindBy(xpath = "(//span[text()='Years']//ancestor::div//p-spinner//input)[2]")
	WebElement expMonths;
	@FindBy(xpath = "//button//span[text()='Save']")
	WebElement saveButton;
	@FindBy(xpath = "//p-toastitem//p")
	WebElement toastMesg;
	
	
	
	
	
	public CandidateModule verifyHeader(String headerName) throws InterruptedException {
		
		Thread.sleep(2000);
		String header = headername.getText();
		Assert.assertEquals(header, headerName);
		
		return this;
		
	}
	public void candidateModuleGlobalSearch(String value) throws InterruptedException {
		Thread.sleep(1000);
		candidateModuleGlobalSearch.sendKeys(value);
	}
	public void clickCreateButton() {
		createCandidateButton.click();
	}
	public void fillCandidateForm() throws InterruptedException {
		Thread.sleep(5000);
		salutation.click();
		salutationMr.click();
		firstName.sendKeys("Uday");
		commonTextXpath("Last Name", "Gurram");
		commonDropdown("Supplier Name","Abi");
		commonTextXpath("Email ID" , "teeesting6+automation@gmail.com");
		jobTitle.sendKeys("Selenium Automation");
		dateOfBirth.sendKeys("01-Jan-1960");
		expYears.click();
		expYears.sendKeys("4");
		expMonths.sendKeys("5");
		
		commonTextXpath("Mobile", "958657889");
		scrollDownByVisibleElementIntomid(resume);
		resume.sendKeys("C:\\Users\\udayc\\OneDrive\\Desktop\\Uday.txt");
		commonTextXpath("Fax", "faxing");
		commonTextXpath("Address 1", "G-2");
		commonTextXpath("Address 2", "faxing");
		commonTextXpath("Phone", "257280");
		commonTextXpath("City", "Anantapur");
		commonTextXpath("Zip", "8998");
		commonTextXpath("Notes", "Im Uday");
		//commonTextXpath("Professional page link", "link");
		scrollDownByVisibleElementIntomid(billRate);
		billRate.sendKeys("5000");
		
		
		
		
		
	}
	public void commonTextXpath(String labelName,String value) {
		
		driver.findElement(By.xpath("//label[text()='"+labelName+"']//ancestor::cpl-textbox//input")).sendKeys(value);
		
		
		
	}
	public void commonDropdown(String labelName,String value) throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='"+labelName +"']//ancestor::cpl-picklist//span[contains(@class,'icon')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'filter-container')]//input")).sendKeys(value);
		driver.findElement(By.xpath("//li/div[contains(text(),'"+value+"')]")).click();
		
	}
	
	public static void scrollDownByVisibleElementIntomid(WebElement element) {

        // Create a JavascriptExecutor instance
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Calculate the Y-coordinate to scroll the element to the middle of the screen
        // int yOffset = (element.getLocation().getY() -
        // (driver.manage().window().getSize().getHeight() / 2));

        // Scroll the element to the middle of the screen using JavaScript
        jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", element);
    }
	public void clickSaveButton() {
		
		scrollDownByVisibleElementIntomid(saveButton);

		saveButton.click();
		
	}
	public void verifyToastMesg(String expectedValue) {
		String toast = toastMesg.getText();
		Assert.assertEquals(toast, expectedValue);
		
	}
}

