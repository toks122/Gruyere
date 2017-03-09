import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"com.gruyere.cucumber.stepdefs"},
		features = "classpath:"//path to the features
		)
public class TestRunner {
}
