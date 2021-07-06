package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_CitizenshipStep {
    DialogContent dc = new DialogContent();

    @And("^Navigate to Citizenship page$")
    public void navigateToCitizenshipPage() {
        LeftNav ln = new LeftNav();
        ln.findAndClick("setupOne");//Setup click
        ln.findAndClick("parameters");//Parameter Click
        ln.findAndClick("citizenShip");//Country Click

    }

    @When("^User a Citizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userACitizenshipNameAsShortNameAs(String name, String shortName) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("saveButton");

    }


    @Then("^Already exist message should be displayed$")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExist", "Already exist");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dc.findAndClick("closeDialog");
    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String element) {
        dc.findAndDelete(element);

    }

    @When("^User edit The given \"([^\"]*)\" account to \"([^\"]*)\"$")
    public void userEditTheGivenAccountTo(String old, String newOne)  {
       dc.findAndEdit(old,newOne);
    }
}
