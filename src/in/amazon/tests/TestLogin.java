package in.amazon.tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.BasePage.BaseClass;
import in.amazon.Pages.CartPage;
import in.amazon.Pages.LoginPage;
import in.amazon.Pages.ProductSearchPage;
import in.amazon.Pages.ProductViewPage;



public class TestLogin extends BaseClass {


BaseClass baseclass;

LoginPage loginObj;
ProductSearchPage productsearch;
ProductViewPage productView;
CartPage myCart;

	@BeforeMethod()
	public void checkRunMode() {

		baseclass=new BaseClass();
		baseclass.browserStart();


	}
	
	@Test(priority=1)
	public void deleteItemFromCart() throws InterruptedException
	{
		  log.info("Delete product Test");
		Thread.sleep(5000);
		productsearch=new ProductSearchPage();
		productsearch.searchProduct();
		productView=new ProductViewPage();
		productView.viewProduct();
		myCart=new CartPage();
		myCart.deletproduct();
		Assert.assertEquals(myCart.afterProductDelete(), "Your Amazon Basket is empty","Deletion of item from cart is verified");
	
	}
	
	@Test(priority=2)
	public void afterProductAddedToCart() throws InterruptedException
	{
		Thread.sleep(5000);
		  log.info("Add product Test");
		productsearch=new ProductSearchPage();
		productsearch.searchProduct();
		productView=new ProductViewPage();
		productView.viewProduct();
		myCart=new CartPage();
		
		Assert.assertEquals(myCart.myCartAfterProductAdd(), "Subtotal (1 item):","product added ");
	}
	
		@Test(priority=3)
		public void verifySubTotal() throws InterruptedException
		{
			Thread.sleep(5000);
			log.info("Increases product Qty in cart");
			productsearch=new ProductSearchPage();
			productsearch.searchProduct();
			productView=new ProductViewPage();
			productView.viewProduct();
			myCart=new CartPage();
		
			String Productedadded=myCart.saveForLater();
			Assert.assertEquals(Productedadded, "Subtotal (4 items):","Purchase quantity increased");
			
		}
		
		@AfterMethod()
		public void quiteBrowser() {

			baseclass.quiteBrowser();
	
		}
	
}
