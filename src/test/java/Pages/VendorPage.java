package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import de.erichseifert.vectorgraphics2d.VectorHints.Key;

public class VendorPage {

	WebDriver driver = null;
    
	
	@FindBy(xpath = "//a[@id='vendor']")
	public WebElement Vendorsection;
	@FindBy(xpath = "(//button[@id='dropdownButton'])[1]")
	public WebElement Vendoroptions;
	@FindBy(xpath = "//div[@class='table-grid-container w-full overflow-x-auto custom-table table table-hover mt-4']")
	public WebElement Vendorslider;
	@FindBy(xpath = "(//button[@id='dropdownButton'])[1]//following-sibling::div//child::li[4]")
	public WebElement ClickeditVendor;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Submitvendor;
	@FindBy(xpath = "(//button[@id='dropdownButton'])[1]//following-sibling::div//child::li[3]")
	public WebElement Assigndepartment;
	@FindBy(xpath = "(//button[@id='dropdownButton'])[1]//following-sibling::div//child::li[2]")
	public WebElement Addadditional_fields;
	@FindBy(xpath = "(//input[@class='form-control input-styles w-2/3'])[1]")
	public WebElement fieldone;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement submitinfo;
	@FindBy(xpath = "(//button[@id='dropdownButton'])[1]//following-sibling::div//child::li[1]")
	public WebElement Addmappingoption;
	@FindBy(xpath = "//input[@id='customerName']")
	public WebElement Customername;
	@FindBy(xpath = "//input[@id='renewalDate']")
	public WebElement Renewaldate;
	@FindBy(xpath = "//input[@id='amount']")
	public WebElement Amount;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Submitfields;
	@FindBy(xpath = "//select[@class='input-styles']")
	public WebElement Filterdepartment;
	@FindBy(xpath = "//select[@class='input-styles']//child::option[2]")
	public WebElement FilterBSG;
	@FindBy(xpath = "//input[@type='text']")
	public WebElement Searchvendor;
	


	public VendorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}



	public void Editvendor() throws InterruptedException {
		
        
		Thread.sleep(10);
		driver.navigate().refresh();	
		Vendorsection.click();	
		Thread.sleep(15);
		Vendoroptions.click();
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(Vendorslider, 0, 34).perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ClickeditVendor);
		Submitvendor.click();


	}
	
	public void Assign_department() throws InterruptedException {
		
		Vendoroptions.click();
		Assigndepartment.click();
		Submitvendor.click();	
	
	}
	
     public void Add_additional_fields() throws InterruptedException {
		
		Vendoroptions.click();
		Thread.sleep(15);
		Addadditional_fields.click();
		fieldone.clear();
		fieldone.sendKeys("This is field 1");
		submitinfo.click();
	//	Actions actions = new Actions(driver);
 		//actions.dragAndDropBy(Vendorslider, 0, -34).perform();
		
	}
     
     public void Add_mappingfields() throws InterruptedException {
    	 
    	 Vendorsection.click();
    	 Vendoroptions.click();
    	 Addmappingoption.click();
    	 Thread.sleep(5);
    	 Customername.sendKeys(" ");	
    	 Renewaldate.sendKeys(" ");
    	 Amount.sendKeys(" ");
    	 Submitfields.click();
    	 Filterdepartment.click();
    	 FilterBSG.click();
    	 Searchvendor.sendKeys("tester 1");
    	 
    	 
     }
}