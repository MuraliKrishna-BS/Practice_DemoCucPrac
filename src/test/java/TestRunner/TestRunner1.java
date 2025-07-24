package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue="StepDefinition"
//		plugin = {"progress", "html:target/cucumber-report.html", 
//				"json: json_output/cucumber.jason", 
//				"junit: junit_xml_output/cucumber.xml",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"rerun:target/rerun.txt"}
		)

	
public class TestRunner1 {

}
