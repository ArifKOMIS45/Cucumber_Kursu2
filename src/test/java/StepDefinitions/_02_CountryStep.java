package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class _02_CountryStep {

    @Then("^Navigate to country page$")
    public void navigate_to_country_page() {
        LeftNav ln = new LeftNav();

        ln.findAndClick("setupOne");//Setup click
        ln.findAndClick("parameters");//Parameter Click
        ln.findAndClick("Countries");//Country Click
    }

    @When("^Create a country$")
    public void create_a_country() {
String randomName= RandomStringUtils.randomAlphabetic(8);
String randomCode=RandomStringUtils.randomAlphabetic(4);
        DialogContent dc = new DialogContent();
        dc.waitnumberOfElementsToBeMoreThan(By.xpath("//tbody/tr"),3);
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", randomName);
        dc.findAndSend("codeInput", randomCode);
        dc.findAndClick("saveButton");
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
        DialogContent dc=new DialogContent();
        dc.findAndContainsText("successMessage","success");}


    @When("^Create a country name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void create_a_country_name_as_code_as(String name, String code) {
        DialogContent dc = new DialogContent();
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("codeInput", code);
        dc.findAndClick("saveButton");
    }

}
