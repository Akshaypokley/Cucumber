package cucumberTest;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
/**
 * Created by AKSHAY on 30/05/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue={"stepDefinition"}
)
public class TestRunner {
}
