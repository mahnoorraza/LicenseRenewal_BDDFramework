package StepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Pages.LoginPage;
import io.cucumber.java.Scenario;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.ExntentManager;
import core.DriverManager;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {

	WebDriver driver;
	private ExtentReports extent = ExntentManager.getInstance();
	private ExtentTest test;


	 @Before
	 public void Browsersetup(Scenario scenario)
	{ 
		
		DriverManager.initiateDriver();
	    driver = DriverManager.getDriver();
		
	  
	} 
	
	/*{
		test = extent.createTest(scenario.getName(), "Scenario Description");

		System.out.println("I am in browserSetup ");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahnoor.moosa\\eclipse-workspace\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
		driver.manage().window().maximize();
		driver.get("http://dev.licenserenewal.com/login");
	} */

	@Given("User is on forgot password screen")
	public void user_is_on_forgot_password_screen() throws InterruptedException {

	//	driver.get("http://dev.licenserenewal.com/login");
	//	WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.ForgotPassword("momerel158@eimatro.com");
        Assert.assertTrue(lp.ForgotPassword(null));

	}

	@When("email is entered")
	public void email_is_entered() {

	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {

	}

	@Then("reset password email should be received to the user")
	public void reset_password_email_should_be_received_to_the_user() throws InterruptedException {
    

	}

	// login functionality 

	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
       
		System.out.println("Inside - login page is open");
		driver.get("http://dev.licenserenewal.com/login");


	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {


		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("momerel158@eimatro.com");
		lp.enterPassword("admin123");


	}

	@When("clicks on login button")
	public void clicks_on_login_button() {

		LoginPage lp = new LoginPage(driver);
		lp.ClickonLogin();

	}

	@Then("user is navigated to the Dashboard")
	public void user_is_navigated_to_the_home_page() {

	}


	//User profile screen

	@When("user is on dashboard screen")
	
	public void user_is_on_dashboard_screen() throws InterruptedException {
		
	//driver.get("http://dev.licenserenewal.com/login"); 

	}

	@When("user clicks on My profile")
	public void user_clicks_on_my_profile() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.UserProfile();

	}

	@Then("user is navigated to the User profile screen")
	public void user_is_navigated_to_the_user_profile_screen() {

	}



//	@After
	public void afterScenario() throws InterruptedException {
	// Update the Extent test status based on scenario result
	//if (scenario.isFailed()) {
		//test.fail("Scenario Failed");
	//} else {
	//	test.pass("Scenario Passed");
	//	}

	 //Flush the Extent report to save the results
		//extent.flush();
	//	Thread.sleep(50);
		driver.quit();
	}


}
