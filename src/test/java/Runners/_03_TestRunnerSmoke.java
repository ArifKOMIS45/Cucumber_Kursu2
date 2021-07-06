package Runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
 * Aşağıdaki seçenekde tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
 * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
 * olanlar çalışacak
 *
 *
 * SmokeTest: En temel manada ana unsurlari test etmek
 * Regression test: butun birimlerin uyumlu sekilde calisma test etme
 *
 */


@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/FeatureFiles"},  // buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"})

public class _03_TestRunnerSmoke extends AbstractTestNGCucumberTests{



}


