package BddOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/RiaUI.feature"},
        glue = {"BddOptions"},
        format = {"json:target/cucumber/Ria.json", "html:target/cucumber/Ria.html", "pretty"},
        tags = {"@Run"})
public class CucumberRunner {

}
