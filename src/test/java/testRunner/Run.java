package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//Features/Online_Login.feature"},
				glue="stepDefinitions",
				dryRun=false,
				monochrome=true,
				tags="@Smoke or @Sanity",
				plugin= {"pretty","html:target/Cucumber_Reports/HTML_Report.html",
						"json:target/Cucumber_Reports/JSON_Report.json",
						"junit:target/Cucumber_Reports/XML_Report.xml",
						"pretty:target/Cucumber_Reports/TEXT_Report.txt"})
public class Run {

}
