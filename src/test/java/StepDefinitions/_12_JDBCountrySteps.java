package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _12_JDBCountrySteps {
    @Then("^Send Database The Query \"([^\"]*)\" And Check Match$")
    public void sendDatabaseTheQueryAndCheckMatch(String query) {

        List<List<String>> dbList= DBUtility.getDataList(query);
        System.out.println("dbList = " + dbList);
        DialogContent dc = new DialogContent();

       // dc.getWindowSizeSmall(2);

        List<WebElement> uiList=dc.waitVisibleListOfAllElements(dc.nameList);
        for(WebElement e: uiList)
        {
            System.out.println("e.getText() = " + e.getText());
        }


        for (int i = 0; i <dbList.size() ; i++) {
            System.out.println(dbList.get(i).get(1)+" "+uiList.get(i).getText());
            Assert.assertEquals(dbList.get(i).get(1),uiList.get(i).getText());

        }





    }
}
