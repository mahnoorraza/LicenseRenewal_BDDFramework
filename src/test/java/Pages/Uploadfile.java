package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uploadfile {
	
	

	WebDriver driver = null;
	
	
	@FindBy(xpath = "//a[@id='upload']")
	public WebElement Uploaddatasection;
	@FindBy(xpath = "(//div[@id='vendorName'])[1]")
	public WebElement Clickdepart;
	@FindBy(xpath = "//div[@id='vendorName']//child::li[1]")
	public WebElement Selectdepart;
	@FindBy(xpath = "(//div[@id='vendorName'])[2]")
	public WebElement Clickvendor;
	@FindBy(xpath = "(//div[@id='vendorName'])[2]//child::li[2]")
	public WebElement Selectvendor;
	@FindBy(xpath = "//button[@class='justify-center pull-left downloadText']")
	public WebElement Downloadcsv;
	@FindBy(xpath = "//input[@id='uploadFile']")
	public WebElement Choosefile;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Uploadfile;
	
	
	public Uploadfile(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	
	public void UploadCustomer_data() throws InterruptedException {
		
		Thread.sleep(7);
		Uploaddatasection.click();
		Clickdepart.click();
		Selectdepart.click();
		Clickvendor.click();
		Selectvendor.click();
		Downloadcsv.click();
		Choosefile.sendKeys("C:\\Users\\mahnoor.moosa\\Downloads\\Autofile.csv");
		Uploadfile.click();
		
	}
	
}