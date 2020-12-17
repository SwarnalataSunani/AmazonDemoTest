package in.amazon.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.BasePage.BaseClass;
import in.amazon.properties.Constants;

public class CartPage extends BaseClass{

	public CartPage() {
		
		PageFactory.initElements(driver, this);

	}
	
		
	@FindBy(xpath = Constants.ProductDescription)
	public WebElement ProductDescription;
	
	@FindBy(id = Constants.SubTotal)
	public WebElement SubTotal;
	
	@FindBy(css = Constants.DeleteBtn)
	public WebElement DeleteBtn;
	
	@FindBy(xpath = Constants.EmptyCart)
	public WebElement EmptyCart;
	
	@FindBy(xpath = Constants.SavForLater)
	public WebElement SavForLater;
	
	@FindBy(xpath = Constants.TextAfterSaveLaterFor)
	public WebElement TextAfterSaveLaterFor;
	
	@FindBy(id = Constants.Quantity)
	public WebElement Quantity;
	
	@FindBy(id = Constants.Quantity4Taken)
	public WebElement Quantity4Taken;
	
	@FindBy(id = Constants.IncreasedSubtotal)
	public WebElement IncreasedSubtotal;

	
	
	
	public String myCartAfterProductAdd()
	{
   	
    	String subtotalNoOfItem=SubTotal.getText();
    	System.out.println(subtotalNoOfItem.trim());
		return subtotalNoOfItem.trim();
	}
    	
	
	
	
	public void deletproduct()
	{
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(DeleteBtn)).click();
	  log.info("Delete item from cart");
	}
	
	public String afterProductDelete() throws InterruptedException
	{
	Thread.sleep(5000);
	
	String afterdeleteText=EmptyCart.getText();
	System.out.println(afterdeleteText.trim());
	return afterdeleteText.trim();
	
	}
	
	public String saveForLater() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(Quantity)).click();
        log.info("Add more Item to cart");
        wait.until(ExpectedConditions.visibilityOf(Quantity4Taken)).click();
        log.info("Add 4 more Item to cart");
        Thread.sleep(5000);
	
		return IncreasedSubtotal.getText().trim();
		
	}
}
