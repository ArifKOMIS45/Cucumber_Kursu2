package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _12_JDBCSteps {
    @Then("^Send The query the databse \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabseAndControlMatch(String query)  {
        // DB den Gelen List
        List<List<String>> dbList= DBUtility.getListData(query);
        System.out.println("dbList = " + dbList);

        // UI (WEB) den gelen list
        DialogContent dc=new DialogContent();
        List<WebElement> uiList=dc.waitVisibleListAllElement(dc.nameList);
        for(WebElement e: uiList)
        {
            System.out.println("e.getText() = " + e.getText());
        }

        for(int i=0;i<dbList.size();i++)
        {
            System.out.println(dbList.get(i).get(1)+" "+ uiList.get(i).getText()); // kontrol
            Assert.assertEquals(dbList.get(i).get(1), uiList.get(i).getText());
        }


    }
}
