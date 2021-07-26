package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement dashboard;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'error')]")
    public WebElement errorMessage;
    @FindBy(css = "button[class='consent-give']")
    public WebElement cokies;
    @FindBy(xpath = "//div[contains(text(),'already exist')]")
    public WebElement alreadyExist;
    WebElement myElement;
    List<WebElement> myList;
    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//span[contains(.,'LOGIN')]")
    private WebElement loginButton;
    @FindBy(css = "ms-add-button>div>button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteBtn;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialog;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> userTypeAllOption;

    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles']//input")
    private WebElement userType;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;


    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editBtn;


    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "priorityCode":
                myElement = priorityCode;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;
            case "cokies":
                myElement = cokies;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchBtn":
                myElement = searchBtn;
                break;
            case "deleteBtn":
                myElement = deleteBtn;
                break;

            case "deleteDialog":
                myElement = deleteDialog;
                break;
            case "editBtn":
                myElement = editBtn;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String elementName, String msg) {
        switch (elementName) {
            case "successMessage":
                myElement = successMessage;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;

            case "alreadyExist":
                myElement = alreadyExist;
                break;

        }

        verifyContainsText(myElement, msg);
    }

    public void findAndDelete(String deleteString) {
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", deleteString);
        findAndClick("searchBtn");
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteBtn");
        findAndClick("deleteDialog");
    }


    public void ChooseListElement(String listName, String option) {
        switch (listName) {
            case "userTypeAllOptions":
                myList = userTypeAllOption;
                break;
        }

        userType.click();
        listSelectOption(myList, option);
    }

    public void findAndEdit(String oldString, String newString) {
        scrollToUpElement(rightScroll);
        findAndSend("searchInput", oldString);
        findAndClick("searchBtn");
        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("editBtn");
        findAndSend("nameInput", newString);
        findAndClick("saveButton");
    }


}
