package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Parent {
    WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 5);

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void wait(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element); //element gozukene kadar bekle
        scrollToElement(element);//elemente kadar kaydir(javascript)
        element.clear();//elementin icini temizle
        element.sendKeys(value);//degeri gonder
    }

    public void scrollToUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);//element gozukene kadar bekle
        //scrollToElement(element); //elemente kadar kaydir(javascript)
        element.click();//click yap
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) BaseDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));
    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, number));
    }

    public List<WebElement> waitVisibleListOfAllElements(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        return elements;
    }

    public void waitnumberOfElementsToBeMoreThan(By selector, int number) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(selector, number));
    }

    public void getWindowSizeSmall(int count) {
        try {
            for (int i = 0; i < count; i++) {
                Robot rbt = new Robot();
                rbt.keyPress(KeyEvent.VK_CONTROL);
                rbt.keyPress(KeyEvent.VK_MINUS);
                rbt.keyRelease(KeyEvent.VK_MINUS);
                rbt.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }


    }

    public void listSelectOption(List<WebElement> list, String option) {
        //List den istenen eleman click yapacak
        for (WebElement e : list) {
            if (e.getText().contains(option)) {
                e.click();
                break;
            }
        }
    }


}
