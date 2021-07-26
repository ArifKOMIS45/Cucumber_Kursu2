package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;


import java.io.File;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_10_CountryCreateEditDelete.feature"},
        glue = {"StepDefinitions"},

        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport1.html"
               }
)

public class _06_TestRunnerExtendReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig(new File("src/test/java/XMLFiles/extendReportSet.xml"));

        Reporter.setSystemInfo("User Name", "Arif KOMIS");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QAr");
        Reporter.setSystemInfo("Location", "Turkey");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}

