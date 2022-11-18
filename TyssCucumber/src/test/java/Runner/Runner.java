package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\Features"},
		glue = {"Step_DefinationFile"},
		dryRun = false,
		tags = "@arshad",
		
plugin = {"pretty",
		
		"html:cucumber.html",
		"json:cucumber.json"
},
monochrome = true

	)


public class Runner extends AbstractTestNGCucumberTests{

}
