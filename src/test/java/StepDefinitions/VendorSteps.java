package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.VendorPage;
import core.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VendorSteps {


	WebDriver driver;
	@Before
	public void Browsersetup(Scenario scenario)
	{ 

		DriverManager.initiateDriver();
		driver = DriverManager.getDriver();


	} 

	@Given("User is on vendor screen")
	public void User_is_on_vendor_screen()  {
		//	driver.get("http://dev.licenserenewal.com/login");

	}

	@Given ("edit vendor option is clicked")
	public void edit_vendor_option_is_clicked() throws InterruptedException {

		VendorPage vp = new VendorPage(driver);
		vp.Editvendor();

	}

	@When("vendor is updated")

	public void vendor_is_updated() {


	}

	@When ("submit is clicked")
	public void submit_is_clicked() {


	}
	@Then("vendor should get updated")
	public void vendor_should_get_updated() {


	}

	//Assign department

	@Given("assign  department option is clicked")
	public void assign_department_option_is_clicked() throws InterruptedException {


		VendorPage vp = new VendorPage(driver);
		vp.Assign_department();

	}

	@When("department is assigned")
	public void department_is_assigned() {

	}

	@Then("vendor should be assigned to your selected department")
	public void vendor_should_be_assigned_to_your_selected_department() throws InterruptedException {

	}

	//Add additional information/fields

	@Given("add additional information option is clicked")
	public void add_additional_information_option_is_clicked() throws InterruptedException {
		VendorPage vp = new VendorPage(driver);
		vp.Add_additional_fields();

	}

	@When("information is filled")
	public void information_is_filled() {

	}

	@Then("information should be saved successfully")
	public void information_should_be_saved_successfully() {

	}


	//Add mapping fields

	@Given("user is on vendor screen")
	public void user_is_on_vendor_screen() throws InterruptedException {
	    
		VendorPage vp = new VendorPage(driver);
		vp.Add_mappingfields();
		
		
	}

	@When("add mapping field option is clicked")
	public void add_mapping_field_option_is_clicked() {
	  
	}

	@Then("mapping fields should be added successfully")
	public void mapping_fields_should_be_added_successfully() {
	   
	}




















}
