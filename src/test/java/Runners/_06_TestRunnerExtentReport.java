package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = {"@Regression"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor.
        }
)
public class _06_TestRunnerExtentReport extends AbstractTestNGCucumberTests {

       @AfterClass
       public static void afterClass() {
           Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReportSet.xml");

           Reporter.setSystemInfo("User Name", "İsmet Temur");
           Reporter.setSystemInfo("Application Name", "Basqar");
           Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
           Reporter.setSystemInfo("Department", "QAr");
           Reporter.setSystemInfo("Ek Satır", "Açıklamas");

           Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
       }
}
