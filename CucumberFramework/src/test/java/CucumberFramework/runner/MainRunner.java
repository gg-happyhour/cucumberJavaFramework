//Runner Class

package CucumberFramework.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/java/CucumberFramework/featureFile/"},
		glue = {"CucumberFramework.steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter: target/report.html"}
		)

public class MainRunner {
	
}
