package Runners;

import Utilities.BaseDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport6.html"
               }
)

public class _07_TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser){
        BaseDriver.threadBrowserName.set(browser);
    }


    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig(new File("src/test/java/XMLFiles/extendReportSet.xml"));

        Reporter.setSystemInfo("User Name", "Arif KOMIS");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QAr");
        Reporter.setSystemInfo("Ek Satir", "Aciklamasi");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}

