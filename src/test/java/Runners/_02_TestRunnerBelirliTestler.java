package Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature","src/test/java/FeatureFiles/_09_Employee.feature"},  // buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"})

public class _02_TestRunnerBelirliTestler extends AbstractTestNGCucumberTests{



}


