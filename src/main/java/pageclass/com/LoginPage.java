package pageclass.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="pwusername")
	WebElement userTxtBox;
	
	@FindBy(id="pwpassword")
	WebElement passTxtBox;
	
	@FindBy(id="signInId")
	WebElement loginBtn;
	
	
	
	public void login(String userName, String passWord) {
		userTxtBox.sendKeys(userName);
		passTxtBox.sendKeys(passWord);
		loginBtn.click();
	}
}
