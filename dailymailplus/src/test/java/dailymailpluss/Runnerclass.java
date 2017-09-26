package dailymailpluss;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format="html:target/cucumber",
        features="src/resources", tags="@uploadimage")

public class Runnerclass {
}
