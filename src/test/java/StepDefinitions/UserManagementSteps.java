package StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Pages.LoginPage;
import Pages.UserManagement;
import Utils.ExntentManager;
import core.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class UserManagementSteps {

	WebDriver driver;

	@Before
	public void Browsersetup(Scenario scenario) {


		DriverManager.initiateDriver();
		driver = DriverManager.getDriver();
	}

	/*test = extent.createTest(scenario.getName(), "Scenario Description");

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



	@Given("User is on user management screen")

	public void user_is_on_user_management_screen() throws InterruptedException {

		//WebDriver driver = new ChromeDriver();
		
		UserManagement um = new UserManagement(driver);		
		um.AddUser();

	}

	@Given("Add user tab is clicked")
	public void add_user_tab_is_clicked() {


	}


	@When("user enters mandatory fields")
	public void user_enters_mandatory_fields() {


	}

	@When("user clicks on cancel button")
	public void user_clicks_on_cancel_button() {

	}

	@Then("user should be naviagted to usermanagement screen")
	public void user_should_be_naviagted_to_usermanagement_screen() {

	}

	//Edit User

	@Given ("user clicks on edit screen")
	public void user_clicks_on_edit_screen() throws InterruptedException {
		//driver.get("http://dev.licenserenewal.com/login");
		UserManagement um = new UserManagement(driver);	
		um.EditUser();	

	}
	@When ("user details are updated")
	public void user_details_are_updated() throws InterruptedException { 
   
		UserManagement um = new UserManagement(driver);	
		um.UserstatusAndfilter();
		
	}


	@When ("user clicks on submit tab")
	public void user_clicks_on_submit_tab() { 

	}

	@Then ("user should get updated") 
	public void user_should_get_updated() { 

	}


}
