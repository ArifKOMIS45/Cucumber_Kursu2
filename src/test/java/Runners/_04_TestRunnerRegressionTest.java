package Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},  // buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"})

public class _04_TestRunnerRegressionTest extends AbstractTestNGCucumberTests{



}


