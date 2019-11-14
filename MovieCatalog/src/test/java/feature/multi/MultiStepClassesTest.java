package feature.multi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		plugin = {"pretty", "html:target/report"},
		features = "src/test/resources/feature/multi",
		glue = "feature.multi",
		stepNotifications = true)
public class MultiStepClassesTest {
	
}
