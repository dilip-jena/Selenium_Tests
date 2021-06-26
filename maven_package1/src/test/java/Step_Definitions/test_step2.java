package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_step2 {
	
	@Given("Display message for given keyword from second feature file")
	public void display_message_for_given_keyword_from_second_feature_file() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("from given keyword inside second feature file");
	}

	@When("Display message for when keyword from second feature file")
	public void display_message_for_when_keyword_from_second_feature_file() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("from when keyword inside second feature file");
	}

	@Then("Display message for then keyword from second feature file")
	public void display_message_for_then_keyword_from_second_feature_file() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("from then keyword inside second feature file");
	}

	@Then("Display message for this keyword from second feature file")
	public void display_message_for_this_keyword_from_second_feature_file() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("from But keyword inside second feature file");
	}

}
