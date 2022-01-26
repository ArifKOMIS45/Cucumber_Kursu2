package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApachePOISteps {
    DialogContent dc = new DialogContent();

    @When("^User Create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {

        List<List<String>> Liste = ExcelUtility.getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx",
                "testCitizen", 2);

        for (int i = 0; i < Liste.size(); i++) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", Liste.get(i).get(0));
            dc.findAndSend("shortName", Liste.get(i).get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage", "success");
        }

    }

    @Then("^User Delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String>> Liste = ExcelUtility.getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx",
                "testCitizen", 1);

        for (int i = 0; i < Liste.size(); i++) {
            dc.findAndDelete(Liste.get(i).get(0));
        }

    }
}
