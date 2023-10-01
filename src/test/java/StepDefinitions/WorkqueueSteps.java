package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.WorkqueueScreen;
import core.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkqueueSteps {

	WebDriver driver;
	@Before
	public void Browsersetup(Scenario scenario)
	{ 

		DriverManager.initiateDriver();
		driver = DriverManager.getDriver();


	} 



	@Given("user is on work queue screen")
	public void user_is_on_work_queue_screen() throws InterruptedException {
		WorkqueueScreen wq = new WorkqueueScreen(driver);
		wq.AddManual_entry();


	}

	@When("Manual entry tab is clicked")
	public void manual_entry_tab_is_clicked() throws InterruptedException {

	}

	@When("mandatory fields are filled")
	public void mandatory_fields_are_filled() {

	}

	@Then("entry should be added on submit button")
	public void entry_should_be_added_on_submit_button() {

	}

	//Edit workqueue
	@Given("user navigates to edit screen")
	public void user_navigates_to_edit_screen() throws InterruptedException {
		WorkqueueScreen wq = new WorkqueueScreen(driver);
		wq.Editworkqueue_screen();
		

	}

	@When("fields are updated")
	public void fields_are_updated() {

	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {

	}

	@Then("data should get saved successfully")
	public void data_should_get_saved_successfully() {

	}
	//Filter and view additional info 


	@Given("user navigates to view additional information screen")
	public void user_navigates_to_view_additional_information_screen() throws InterruptedException {
     
		WorkqueueScreen wq = new WorkqueueScreen(driver);
		wq.Viewadditional_screen();
	}

	@When("information is verified")
	public void information_is_verified() {

	}

	@When("User filters the data")
	public void user_filters_the_data() {

	}

	@When("Export the customer data")
	public void export_the_customer_data() {

	}

	@Then("data should get exported")
	public void data_should_get_exported() {

	}

	@Then("Data should get filtered correctly")
	public void data_should_get_filtered_correctly() {

	}


}