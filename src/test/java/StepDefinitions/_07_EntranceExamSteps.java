package StepDefinitions;

import Pages.FormContent;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class _07_EntranceExamSteps {
   FormContent fc=new FormContent();
    @And("^Click on the element in the Form Content$")
    public void clickOnTheElementInTheFormContent(DataTable elemenets) {
        List<String> listElements=elemenets.asList(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
            fc.findAndClick(listElements.get(i));
        }
    }

    @Then("^User delete the \"([^\"]*)\" from Form content$")
    public void userDeleteTheFromFormContent(String deleteString)  {
        fc.findAndSend("searchInput", deleteString);
        fc.findAndClick("searchBtn");
       fc. waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        fc.findAndClick("deleteBtn");
        fc.findAndClick("deleteDialog");

    }

    @When("^User sending the infos in Form content$")
    public void userSendingTheInfosInFormContent(DataTable elemenets) {
        List<List<String>> listElements=elemenets.asLists(String.class);
        for (int i = 0; i <listElements.size() ; i++) {
            fc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }


      @Then("^Delete the user \"([^\"]*)\" from Form Content$")
    public void deleteTheUserFromFormContent(String deleteString) {
          fc.findAndClick("dashButton");
        fc.findAndSend("searchInput2", deleteString);
        fc.findAndClick("searchBtn");
        fc. waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 2);

        fc.findAndClick("deleteBtn");
        fc.findAndClick("deleteDialog");

    }
}
