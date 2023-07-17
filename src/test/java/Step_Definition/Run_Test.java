package Step_Definition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\balra\\eclipse-workspace\\Lime_road001\\src\\test\\resources\\feature\\RoadLime.feature", glue = {
		"Step_Definition" }, plugin = { "pretty", "junit:target/JunitReports/report.xml",
				"json:target/JSONRports/report.json", "html:target/HtmlReports" })


public class Run_Test {

}
