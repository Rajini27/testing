
package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/feature/postSteps.feature"},glue={"StepsDefination"},dryRun= false)

public class LoginRunner {
}

