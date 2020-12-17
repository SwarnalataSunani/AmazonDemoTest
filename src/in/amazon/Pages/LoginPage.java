package in.amazon.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.BasePage.BaseClass;
import in.amazon.properties.Constants;

public class LoginPage extends BaseClass{
	

	public LoginPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = Constants.SignInMenuBtn)
	public WebElement SignInMenuBtn;
	
	@FindBy(xpath = Constants.SignInBtn)
	public WebElement SignInBtn;
	
	@FindBy(id = Constants.EmailID)
	public WebElement EmailID;
	
	@FindBy(id = Constants.Continuebtn)
	public WebElement Continuebtn;
	
	@FindBy(id = Constants.Password)
	public WebElement Password;
	
	@FindBy(id = Constants.SignInSubmit)
	public WebElement SignInSubmit;
	
	public void Logintoamazon()
	{
	SignInMenuBtn.click();
	
	EmailID.sendKeys("7207199947");

	Continuebtn.click();
	Password.sendKeys("Tester12!@");
	SignInSubmit.click();
	}

}


