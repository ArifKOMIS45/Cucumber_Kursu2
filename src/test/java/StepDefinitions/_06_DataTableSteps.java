package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _06_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("^Click on the element in the left Nav$")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {  //clickOnTheElementInTheLeftNav(List<String> elements)
        // elements i String formatında List e çevir
        List<String> listElement= elements.asList(String.class);

        for(int i=0;i<listElement.size();i++)
        {
            //System.out.println(e);
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("^Click on the element in the Dialog$")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement= elements.asList(String.class);
        for(int i=0;i<listElement.size();i++)
        {
            dc.findAndClick(listElement.get(i));
        }
    }


    @When("^User sending the keys in dailog content$")
    public void userSendingTheKeysInDailogContent(DataTable elements) {
        List< List<String> > listElement= elements.asLists(String.class);
        for(int i=0;i<listElement.size();i++)
        {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            // her bir satır için yukarıdaki fonksiyon çalıştı.
        }
    }
}
