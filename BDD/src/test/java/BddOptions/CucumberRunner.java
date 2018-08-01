package BddOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        format = {"json:target/cucumber/Ria.json", "html:target/cucumber/Ria.html", "pretty"},
        tags = {"@Run"})
public class CucumberRunner {

}
