package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class _05_ItemCategories {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("^Navigate to Item Category page$")
    public void navigateToItemCategoryPage() {
        ln.findAndClick("inventory");
        ln.findAndClick("setup");
        ln.findAndClick("itemCategory");

    }


    @When("^User create an item categories name as \"([^\"]*)\" shortName as \"([^\"]*)\"$")
    public void userCreateAnItemCategoriesNameAsShortNameAs(String name, String userType) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.ChooseListElement("userTypeAllOptions",userType);
        dc.findAndClick("saveButton");

    }
}
