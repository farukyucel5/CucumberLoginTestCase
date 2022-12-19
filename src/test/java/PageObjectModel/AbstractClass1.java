package PageObjectModel;

import DriverPack.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AbstractClass1 {

    private WebDriver driver = Driver.getDriver();



    public void clickFunction(WebElement clickElement){

        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){

        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element){

        Select slc = new Select(dropdown);

        slc.selectByVisibleText(element);

    }


    public void Assertion(WebElement actual,String expected){
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message :  " + actual.getText());

    }
}
