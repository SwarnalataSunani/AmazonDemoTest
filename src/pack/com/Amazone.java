package pack.com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.BasePage.BaseClass;
import in.amazon.properties.Constants;

public class Amazone {

	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver","D:\\OTA_Folder\\chromedriver.exe");
        driver = new ChromeDriver();
        
        Login l = new Login();
        l.login(driver);
        
    	
    	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
    	//Mouse hover menuOption 'Music'
    	searchbox.sendKeys("oppo f17 pro");
    	
    	WebElement searchbtn=driver.findElement(By.id("nav-search-submit-text"));
    	//Mouse hover menuOption 'Music'
    	searchbtn.click();
    	String window=driver.getWindowHandle();
    	WebElement item=driver.findElement(By.linkText("OPPO F17 Pro (Matte Black, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers"));
    	//Mouse hover menuOption 'Music'
    	item.click();
    	
    	String lastWindow = null;
    	 Set<String> handles = driver.getWindowHandles();
    	    for (String aux : handles) {
    	        lastWindow = aux;
    	    }
    	    driver.switchTo().window(lastWindow);
    	    
    		WebElement mobileDesc=driver.findElement(By.id("productTitle"));
        	//Mouse hover menuOption 'Music'
        	String s=mobileDesc.getText();
        	System.out.println(s);
        	
        	WebDriverWait wait2= new WebDriverWait(driver,30);
        	WebElement addtocart=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        	addtocart.click();
    	
    	WebElement addtocart2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("attach-sidesheet-view-cart-button-announce")));
    	//Mouse hover menuOption 'Music'
    	addtocart2.submit();
    	
    	WebElement mobileDesc2=driver.findElement(By.xpath("//a[@href=\"/gp/product/B089MV6MGW/ref=ox_sc_act_title_1?smid=A14CZOWI0VEHLG&psc=1\"]/span[contains(text(),\"OPPO F17 Pro (Matte Black, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers\")]"));
    	//Mouse hover menuOption 'Music'
    	String s2=mobileDesc2.getText();
    	System.out.println(s2.trim());
    	
    	WebElement subtotal=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("sc-subtotal-label-activecart")));
    	String subtotalNoOfItem=subtotal.getText();
    	System.out.println(subtotalNoOfItem.trim());
    	
    	WebElement delete=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label=\"Delete OPPO F17 Pro (Matte Black, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers\"]")));
    	//Mouse hover menuOption 'Music'
    	delete.click();
    	
    	WebElement afterdeelete=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),\" Your Amazon Cart is empty.\")]")));
    	String afterdeeleteText=afterdeelete.getText();
    	System.out.println(afterdeeleteText.trim());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    */	
	

}
