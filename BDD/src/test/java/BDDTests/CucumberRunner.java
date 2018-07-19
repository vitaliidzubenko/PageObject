package BDDTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Optional;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/BDDTests", glue = {"BDDTests"}, format = {"pretty", "html:test-outout"})
public class CucumberRunner {

}
