package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkqueueScreen {
	
	WebDriver driver = null;
	
	@FindBy(xpath = "//a[@id='customer']")
	public WebElement Workqueue;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement Ametab;
	@FindBy(xpath = " //div[@id='departments']")
	public WebElement Clickdept;
	@FindBy(xpath = "//div[@id='departments']//child::li[1]")
	public WebElement Selectdept;
	@FindBy(xpath = "//div[@id='vendors']")
	public WebElement Clickvendor;
	@FindBy(xpath = "//div[@id='vendors']//child::li[1]")
	public WebElement Selectvendors;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Next;
	@FindBy(xpath = "//input[@id='customerName']")
	public WebElement Customername;
	@FindBy(xpath = "//input[@id='renewalDate']")
	public WebElement Renewaldate;
	@FindBy(xpath = "//input[@id='amount']")
	public WebElement Amount;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Submitfields;
	@FindBy(xpath="//div[@class='table-grid-container w-full overflow-x-auto custom-table table table-hover mt-4']")
	public WebElement Slider;
	@FindBy(xpath="(//button[@id='dropdownButton'])[1]")
	public WebElement Workqueueoptions;
	@FindBy(xpath = "(//span[@class='optionsList'])[2]")
	public WebElement Viewadditional;
	@FindBy(xpath = "(//span[@class='optionsList'])[1]")
	public WebElement Clickedit;
	@FindBy(xpath = "//textarea[@id='sales_rep']")
	public WebElement salesRep;
	@FindBy(xpath = "//textarea[@id='comment']")
	public WebElement comment;
	@FindBy(xpath = "//input[@type='text']")
	public WebElement Searchvendor;
	@FindBy(xpath = "(//button[@type='button'])[1]")
	public WebElement Exporttab;
	
	
	public WorkqueueScreen(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);


}
	
	public void AddManual_entry() throws InterruptedException{
		
		Thread.sleep(6);
		Workqueue.click();
		Ametab.click();
		Clickdept.click();
		Selectdept.click();
		Clickvendor.click();
		Selectvendors.click();
		Next.click();
		Customername.sendKeys("mahnoor");
		Renewaldate.sendKeys("09/11/2023");
		Amount.sendKeys("2000");
		Submitfields.click();
		Thread.sleep(5);
		
		
	}
	
	
	public void Editworkqueue_screen() throws InterruptedException {
		
		Actions actions1 = new Actions(driver);
		actions1.dragAndDropBy(Slider, 120, 0).perform();
	    Workqueueoptions.click();
		Clickedit.click();
		salesRep.sendKeys("abc@dummy.com");
		comment.sendKeys("hello");
		Submitfields.click();
		Thread.sleep(5);
		
	}
	
	public void Viewadditional_screen() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(Slider, 120, 0).perform();
	    Workqueueoptions.click();
		Viewadditional.click();
		Workqueue.click();
		Searchvendor.sendKeys("tester 1");
		Thread.sleep(5);
		Exporttab.click();
		
	}
}