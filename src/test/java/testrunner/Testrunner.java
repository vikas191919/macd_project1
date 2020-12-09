package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
features = "resources"
,glue={"stepdefinition"}
,tags={"@login"}
//,tags={"@invalidlocation"}
//,tags={"@test"}
)


public class Testrunner extends AbstractTestNGCucumberTests {

}

