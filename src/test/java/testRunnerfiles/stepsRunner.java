package testRunnerfiles;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefile/Checkout.feature",
                 glue = {"stepDefinitionfile"},
                 dryRun = false,
                 monochrome = true,
                 plugin = {"pretty", "html:test-output.html"}
                )


public class stepsRunner {

}
