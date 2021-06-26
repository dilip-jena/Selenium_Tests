package Step_Definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue={"src", "test", "java", "Step_Definitions"}, // or you can give like "src/test/java/Step_Definitions"
		//plugin = { "pretty", "html:target/htmlreports" } //To create report under target folder
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber_POM_Pack1" },
		//tags= "@cyclos"
		//plugin = {"html:target/Report.html" } //*********
		dryRun = false, //generate snippet code for missing steps
		//strict=false,
		
		plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber"},
			tags="@regression"  //............feature
	    //tags= "@regression and not sanity" //..........scenario
	    //tags= "@regression and @sanity"
		//  tags= "@regression or @sanity"
		//	tags= "@sanity and not @regression"
		
)


public class test_runner {

}
