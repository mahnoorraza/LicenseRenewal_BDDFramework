package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.Uploadfile;
import core.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Uploadfile_steps {
	
	
	WebDriver driver;
	@Before
	public void Browsersetup(Scenario scenario)
	{ 

		DriverManager.initiateDriver();
		driver = DriverManager.getDriver();


	} 
	
	@Given("user is on upload customer data screen")
	public void user_is_on_upload_customer_data_screen() throws InterruptedException {
		
		Uploadfile uf = new Uploadfile(driver);
		uf.UploadCustomer_data();
		
	    
	}

	@When("departments and assigned vendors are selected")
	public void departments_and_assigned_vendors_are_selected() {
	    
	}

	@When("customer data file is uploaded")
	public void customer_data_file_is_uploaded() {
	  
	}

	@Then("file should get uploaded successfully")
	public void file_should_get_uploaded_successfully() {
	 
	}
	
	

}
