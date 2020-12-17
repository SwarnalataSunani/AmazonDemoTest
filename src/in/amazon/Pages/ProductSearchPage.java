package in.amazon.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

import in.amazon.BasePage.BaseClass;
import in.amazon.properties.Constants;

public class ProductSearchPage extends BaseClass {



	public ProductSearchPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = Constants.SearchBox)
	public WebElement SearchBox;
	
	@FindBy(id = Constants.Searchbtn)
	public WebElement Searchbtn;
	
	public void searchProduct() {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).sendKeys("oppo f17 pro");
		   log.info("oppo f17 pro entered");
		Searchbtn.click();
		   log.info("searching oppo f17 pro");
	}
	
	
	

}
