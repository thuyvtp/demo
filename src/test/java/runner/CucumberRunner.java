package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions 
(features ="src/test/java/features",
plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-  report.json"},
monochrome = true,
glue={"stepDefinitions"})
public class CucumberRunner extends AbstractTestNGCucumberTests{
}



