package in.amazon.Pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.BasePage.BaseClass;
import in.amazon.properties.Constants;

public class ProductViewPage extends BaseClass{
	

	public ProductViewPage() {
	
		PageFactory.initElements(driver, this);

	}
		
	@FindBy(id = Constants.ProductDesc)
	public WebElement ProductDesc;
	
	@FindBy(linkText = Constants.Product)
	public WebElement Product;
	
	@FindBy(id = Constants.AddToCart)
	public WebElement AddToCart;
	
	@FindBy(id = Constants.AddtoCartOnSideBar)
	public WebElement AddtoCartOnSideBar;
	
	public void viewProduct()
	{
		String window=driver.getWindowHandle();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Product)).click();
		   log.info("clicked on  oppo f17 pro");
		
    	
    	String lastWindow = null;
    	 Set<String> handles = driver.getWindowHandles();
    	    for (String aux : handles) {
    	        lastWindow = aux;
    	    }
    	    driver.switchTo().window(lastWindow);
    	    log.info("opening in new tab");
    	   

		wait.until(ExpectedConditions.visibilityOf(AddToCart)).click();
		  log.info("Add to cart");
   	   
		
		
		wait.until(ExpectedConditions.visibilityOf(AddtoCartOnSideBar)).submit();
		  log.info("confirming add to cart");
		

	
	}

	

}