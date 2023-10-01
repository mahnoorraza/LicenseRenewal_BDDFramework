package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.Emailthreshold;
import core.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Emailthreshold_steps {
	
	
	WebDriver driver;
	@Before
	public void Browsersetup(Scenario scenario)
	{ 

		DriverManager.initiateDriver();
		driver = DriverManager.getDriver();


	} 
	@Given("User is on Email threshold screen")
	public void user_is_on_email_threshold_screen() {
		
		Emailthreshold et = new Emailthreshold(driver);
		et.Email_notification();
	    
	}

	@When("email notification settings are set")
	public void email_notification_settings_are_set() {
	    
	}

	@Then("Email notification details should be saved successfully")
	public void email_notification_details_should_be_saved_successfully() {
	    
	}
	

}
