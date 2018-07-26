package BDDTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Optional;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {"BDDTests"}, format = {"pretty", "html:cucumbertest.html"})
public class CucumberRunner {

}
