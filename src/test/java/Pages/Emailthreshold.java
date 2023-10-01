package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailthreshold {
	
	WebDriver driver = null;
	
	@FindBy(xpath = "//a[@id='setting']")
	public WebElement Emailthreshold;
	@FindBy(xpath = "//div[@id='department']")
	public WebElement clickdept;
	@FindBy(xpath = "//div[@id='department']//child::li[1]")
	public WebElement Selectdept ;
	@FindBy(xpath = "(//div[@id='vendors'])[1]")
	public WebElement clickvendor ;
	@FindBy(xpath = "(//div[@id='vendors'])[1]//child::li[1]")
	public WebElement Selectvendor;
	@FindBy(xpath = "//input[@id='new_threshold']")
	public WebElement Newthreshold;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Submitsettings ;
	
	
	
	public Emailthreshold(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	public void Email_notification() {
		
		
		Emailthreshold.click();
		clickdept.click();
		Selectdept.click();
		clickvendor.click();
		Selectvendor.click();
		Newthreshold.sendKeys("6000");
        Submitsettings.click();		
	}	
	
}