package Com.radical.basic.B15Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/B15Demo/CucumberPathFile.feature","src/test/resources/B15Demo/CucumberPathFile2.feature" },
		glue={"Com/radical/basic/B15Demo/"}
		)






public class RunCucumberPathStepDefTest {
	

}
