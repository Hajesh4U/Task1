package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // the path of the feature files
		glue = { "Stepdefinitions" }, // the path of the step definition files
		monochrome = true, // display the console output in a proper readable format
		plugin = { "pretty", "html:target/HtmlReports/reports.html" } // to generate Html reports
// tags = {"~@SmokeTest" , "~@RegressionTest"}
)
public class Testrunner {

}
//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
