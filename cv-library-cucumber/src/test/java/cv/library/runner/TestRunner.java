package cv.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "cv/library",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class TestRunner {
}
