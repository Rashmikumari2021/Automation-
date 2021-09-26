package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"StepDefinitions"},
monochrome=true,
plugin= {"pretty", "html:target/HtmlReports"}

)


public class TestRunner {

}

	

