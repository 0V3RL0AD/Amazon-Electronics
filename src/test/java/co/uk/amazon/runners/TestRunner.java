package co.uk.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/amazon/features"},
        glue = {"co/uk/amazon/hooks", "co/uk/amazon/stepDefinitions"},
        publish = true,
        tags = "not @ignore"
)
public class TestRunner {
}
