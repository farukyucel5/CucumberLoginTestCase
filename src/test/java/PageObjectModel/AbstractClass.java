package PageObjectModel;

import DriverPack.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public  void sendkeys(WebElement sendKeysElement,String keysvalue){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(keysvalue);
    }

    public void selectElementFromDropDown(WebElement dropDown,String element){
        Select slc =new Select(dropDown);
        slc.selectByVisibleText(element);
    }

    public void assertion(WebElement confirmation){
        Assert.assertTrue(confirmation.isDisplayed());
        System.out.println("The expected message: "+ confirmation.getText());
    }
}
