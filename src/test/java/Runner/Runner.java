package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		         plugin={"html:target/cucumber_html_report"},
		         features= {"features"},
		         glue= {"stepDefination"}
		     
		       


		)
public class Runner {
	
	

}
