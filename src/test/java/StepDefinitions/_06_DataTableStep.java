package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _06_DataTableStep {
   LeftNav ln=new LeftNav();
   DialogContent dc=new DialogContent();
    @And("^Click on the element in the left Nav$")
    public void clickOnTheElementInTheLeftNav(DataTable elemenets) {
        List<String> listElements=elemenets.asList(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
            ln.findAndClick(listElements.get(i));
        }

    }

    @And("^Click on the element in the Dialog$")
    public void clickOnTheElementInTheDialog(DataTable elemenets) {
        List<String> listElements=elemenets.asList(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
           dc.findAndClick(listElements.get(i));
        }
    }

    @When("^User sending the keys in dailog content$")
    public void userSendingTheKeysInDailogContent(DataTable elemenets) {

       List<List<String>> listElements=elemenets.asLists(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }
}
