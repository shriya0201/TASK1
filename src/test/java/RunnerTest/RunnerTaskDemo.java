package RunnerTest;

import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="StepDefinitions",
		tags= "@SearchHotel",
		monochrome=true,
				dryRun=true,
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)
//plugin={"pretty","html:target/cucumberReports","json:target/cucumberReports.json","junit:target/cucumberJUnitReports/junitreport.xml"}

		//plugin="usage"
public class RunnerTaskDemo {
	
			

}
