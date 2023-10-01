package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;


public class UserManagement {

	WebDriver driver = null;

	@FindBy(xpath = "//a[@href='http://dev.licenserenewal.com/users']")
	public WebElement ClickOnUsermanagement; 
	@FindBy(xpath ="//a[@href='/users/create']")
	public WebElement AdduserTab;
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement Firstname;
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement Lastname;
	@FindBy(xpath="//input[@id='email']")
	public WebElement Useremail;
	@FindBy(xpath="//input[@id='passwords']")
	public WebElement Userpassword;
	@FindBy(xpath="//select[@id='role']//child::option[@value='38']")
	public WebElement Userrole;
	@FindBy(xpath="//div[@id='assigned_vendors']")
	public WebElement Assignvendors;
	@FindBy(xpath="//div[@id='assigned_vendors']//ancestor::ul//child::li[17]")
	public WebElement Selectvendor;
	@FindBy(xpath="//button[@class='inline-flex btn-primary-license justify-center btn-secondary pull-left']")
	public WebElement Cancel;
	@FindBy(xpath="//div[@class='table-grid-container w-full overflow-x-auto custom-table table table-hover mt-4']")
	public WebElement Slider;
	@FindBy(xpath="(//button[@id='dropdownButton'])[1]")
	public WebElement Editoption;
	@FindBy(xpath = "(//span[@class='optionsList'])[1]")
	public WebElement Clickedit;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Submit;
	@FindBy(xpath = "(//input[@class='input-switch'])[1]")
	public WebElement Inactive;
	@FindBy(xpath = "//button[@class='inline-flex btn-primary-license justify-center pull-left']")
	public WebElement Changestatus;
	@FindBy(xpath = "(//input[@class='input-styles search-filter'])[3]")
	public WebElement Filteremail;
	@FindBy(xpath = "(//select[@class='input-styles'])[3]//child::option[2]")
	public WebElement Filterstatus;



	public UserManagement(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean AddUser() throws InterruptedException {

	try {
		Thread.sleep(5);
		ClickOnUsermanagement.click();
		AdduserTab.click();
		Firstname.sendKeys("Mahnoor");
		Lastname.sendKeys("Tester");
		Useremail.sendKeys("dummyuser@dummy.com");
		Userpassword.sendKeys("admin123");
		Userrole.click();
		Assignvendors.click();
		Selectvendor.click();
		Thread.sleep(5);
		Cancel.click();
		return true;
	} catch (Exception e) {
		
		System.out.println(e);
	}
	return false;
	}

	public void EditUser() throws InterruptedException {
        
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(Slider, 120, 0).perform();
		Editoption.click();
		Clickedit.click();
		Firstname.clear();
		Firstname.sendKeys("New John");
		Submit.click();
		
	}
	
	public void UserstatusAndfilter() throws InterruptedException { 
		
		
		Inactive.click();
		Changestatus.click();
        Filteremail.sendKeys("mahnoor.moosa@arpatech.com");
        Filterstatus.click();
		
		
	}
	
	//@After
	public void afterScenario() throws InterruptedException {
	
		driver.quit();
		
	
	}
}