package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_step1{

	@Given("Display message for given keyword")
	public void display_message_for_given_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("from given keyword inside first feature file");
	}


	//Some other steps were also undefined:

	@When("Display message for when keyword")
	public void display_message_for_when_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("from when keyword  inside first feature file");
	}
	
	@Then("Display message for then keyword")
	public void display_message_for_then_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("from then keyword  inside first feature file");
	}


	

}
