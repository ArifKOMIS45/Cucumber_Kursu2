package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    WebElement myElement;
    @FindBy(css = "mat-form-field[formgroupname='academicPeriod']>div>div>div>mat-select")
    private WebElement academicPeriod1;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private WebElement academicPeriod2;

    @FindBy(css = "mat-form-field[formgroupname='gradeLevel']>div>div>div")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[5]")
    private WebElement gradeLevel2;

    @FindBy(css = "ms-save-button>button")
    private WebElement saveBtn;

    @FindBy(css = ".mat-form-field-type-mat-input>div>div>div>input")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.FIRST_NAME']//input")
    private WebElement searchInput2;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteBtn;

    @FindBy(css = "[type='submit']")
    private WebElement deleteDialog;

    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[2]")
    private WebElement gradeLevel1;
    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[5]")
    private WebElement gradeLevel4;
    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[3]")
    private WebElement gradeLevel21;
    @FindBy(xpath = "(//div[@role='listbox']/mat-option)[4]")
    private WebElement gradeLevel3;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement employeeName;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement employeeSurname;

    @FindBy(css = "mat-option:nth-of-type(2) > .mat-option-text")
    private WebElement employeeGenderMale;

    @FindBy(css = "[formcontrolname='gender'] .mat-select-value")
    private WebElement employeeGender;

    @FindBy(css = "[formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]/div[2]/button[1]")
    private WebElement dashButton;

    @FindBy(css = "[formcontrolname='type'] .mat-select-value")
    private WebElement employeeDocumentType;
    @FindBy(css = "mat-option:nth-of-type(1) > .mat-option-text")
    private WebElement employeeDocumentType2;

    @FindBy(css = "[formcontrolname='documentNumber']")
    private WebElement employeeDocumentNumber;


    public FormContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "academicPeriod1":
                myElement = academicPeriod1;
                break;
            case "academicPeriod2":
                myElement = academicPeriod2;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "gradeLevel2":
                myElement = gradeLevel2;
                break;
            case "saveBtn":
                myElement = saveBtn;
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
            case "gradeLevel1":
                myElement = gradeLevel1;
                break;
            case "gradeLevel21":
                myElement = gradeLevel21;
                break;
            case "gradeLevel3":
                myElement = gradeLevel3;
                break;
            case "gradeLevel4":
                myElement = gradeLevel4;
                break;
            case "employeeGenderMale":
                myElement = employeeGenderMale;
                break;
            case "employeeGender":
                myElement = employeeGender;
                break;


            case "employeeId":
                myElement = employeeId;
                break;
            case "employeeDocumentType":
                myElement = employeeDocumentType;
                break;
            case "employeeDocumentType2":
                myElement = employeeDocumentType2;
                break;
            case "dashButton":
                myElement = dashButton;
                break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "searchInput":
                myElement = searchInput;
                break;
            case "employeeId":
                myElement = employeeId;
                break;
            case "employeeDocumentNumber":
                myElement = employeeDocumentNumber;
                break;
            case "employeeName":
                myElement = employeeName;
                break;
            case "employeeSurname":
                myElement = employeeSurname;
                break;
            case "searchInput2":
                myElement = searchInput2;
                break;
        }
        sendKeysFunction(myElement, value);

    }

    public void findAndDelete(String deleteString) {

        findAndSend("searchInput", deleteString);
        findAndClick("searchBtn");
        //waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteBtn");
        findAndClick("deleteDialog");
    }


}
