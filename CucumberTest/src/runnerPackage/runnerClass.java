package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\SumitKumar\\eclipse-workspace\\Sumit_Workspace\\CucumberTest\\Feature\\Test.feature"}, 
		//features = "Features",
		glue= {"stepDefinition"}
		)
public class runnerClass {

	
	
}
