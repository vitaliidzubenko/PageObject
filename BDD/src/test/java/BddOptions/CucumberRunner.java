package BddOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/RiaUI.feature"},
        glue = {"BddOptions"},
        format = {"json:target/cucumber/Ria.json", "html:target/cucumber/Ria.html", "pretty"},
        tags = {"@RunLast"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
