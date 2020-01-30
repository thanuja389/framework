package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\suri\\eclipse-workspace\\parallel_testing\\src\\test\\resources\\features",glue= "C:\\Users\\suri\\eclipse-workspace\\parallel_testing\\src\\test\\java\\steps")

public class LoginRunner {
	
	

}
