package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    WebElement myElement;
    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c129-23 ng-star-inserted']")
    private WebElement inventory;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c129-24 ng-star-inserted']")
    private WebElement setup;

    @FindBy(xpath = "//span[.='Item Categories']")
    private WebElement itemCategory;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[contains(text(),'Entrance Exams')]")
    private WebElement enteranceExam;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement enteranceSetup;

    @FindBy(xpath = "//a[@href='/exam/list']")
    private WebElement enteranceExamForm;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement employees;

    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "Countries":
                myElement = country;
                break;

            case "citizenShip":
                myElement = citizenShip;
                break;

            case "inventory":
                myElement = inventory;
                break;
            case "setup":
                myElement = setup;
                break;
            case "itemCategory":
                myElement = itemCategory;
                break;

            case "nationalities":
                myElement = nationalities;
                break;

            case "fees":
                myElement = fees;
                break;

            case "enteranceExam":
                myElement = enteranceExam;
                break;
            case "enteranceSetup":
                myElement = enteranceSetup;
                break;
            case "enteranceExamForm":
                myElement = enteranceExamForm;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "employees":
                myElement = employees;
                break;

        }

        clickFunction(myElement);
    }
}


