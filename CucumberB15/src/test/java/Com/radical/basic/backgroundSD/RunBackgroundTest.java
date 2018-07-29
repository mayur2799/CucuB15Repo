package Com.radical.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,                            //used for remove the garbage space
					//dryRun=true,
					
					features= {"src/test/resources/backgroundFF/BackgroundFF.feature"},
					glue={"Com/radical/basic/backgroundSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
