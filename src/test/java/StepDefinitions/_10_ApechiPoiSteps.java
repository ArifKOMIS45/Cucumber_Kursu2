package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApechiPoiSteps {
    DialogContent dc = new DialogContent();
    @When("^User Create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String>> liste= ExcelUtility.getListData("src/test/java/ApachiPOI/resourse/ApacheExcel2.xlsx","Sheet1",2);
        for (int i = 0; i < liste.size() ; i++) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", liste.get(i).get(0));
            dc.findAndSend("shortName", liste.get(i).get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage","success");}

        }





    @Then("^User Delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String>> liste= ExcelUtility.getListData("src/test/java/ApachiPOI/resourse/ApacheExcel2.xlsx","Sheet1",1);
        for (int i = 0; i < liste.size() ; i++) {
            dc.findAndDelete(liste.get(i).get(0));
        }
    }
}
