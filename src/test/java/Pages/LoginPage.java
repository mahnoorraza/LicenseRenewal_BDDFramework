package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	
	WebDriver driver = null;
	
	
	@FindBy(xpath = "//a[@href='http://dev.licenserenewal.com/forgot-password']")
    public WebElement forgotpassword;
	@FindBy(xpath="//input[@class='input-styles mt-1 block w-full']")
	public WebElement resetpassword;
	@FindBy(xpath="//button[@class='inline-flex btn-primary-license btn-primary-license justify-center w-[100%]']")
	public WebElement send_resetpassword;
	@FindBy(xpath = "(//input[@class='input-styles mt-1 block w-full bg-white input-styles-login'])[1]")
    public WebElement email;
	@FindBy(xpath = "(//input[@class='input-styles mt-1 block w-full bg-white input-styles-login'])[2]")
	public WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
    public WebElement login;
	@FindBy(xpath = "//span[@class='text-left text-white text-xs font-light']")
	public WebElement GotoMyProfile;
	@FindBy(xpath = "(//a[@class='hover:bg-gray-100 py-2 px-4 block text-sm'])[1]")
	public WebElement ClickonMyProfile;
	
	
	 public LoginPage(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver, this);

	    }
	 
	   public boolean ForgotPassword(String p) throws InterruptedException {
   	   
	   try {	   
	   Thread.sleep(5);
   	   forgotpassword.click();
   	   resetpassword.sendKeys(p);
   	   send_resetpassword.click(); 
   	   Thread.sleep(15);
   	   return true;
	   } catch (Exception e)
	   {
		   System.out.println(e);
		   return false;
		   
	   }
   	   
      }
	 
	   public void enterUsername(String username) throws InterruptedException {

	     Thread.sleep(5);   
		 email.sendKeys(username);
	    }

	    public void enterPassword(String userpassword) {
 
	    password.sendKeys(userpassword);
	        
	    }

	    public void ClickonLogin() {

	    login.click();

	    }
     
	    public void UserProfile() throws InterruptedException {
	    
	    Thread.sleep(5);
	    //Actions actions = new Actions(driver);
		//actions.moveToElement(GotoMyProfile);
	    GotoMyProfile.click();
	    ClickonMyProfile.click();    
	    }
	    
	    
	    

}
