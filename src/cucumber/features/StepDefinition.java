package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^this is my first step$")
	public void this_is_my_first_step() throws Throwable {
	   
	    System.out.println("This is my third step ");
	    throw new PendingException();
	}

	@When("^thin is my second step$")
	public void thin_is_my_second_step() throws Throwable {
	    System.out.println("this is my secomnd step");
	}

	@Then("^this is my final step$")
	public void this_is_my_final_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is my third step ");
	}


}
