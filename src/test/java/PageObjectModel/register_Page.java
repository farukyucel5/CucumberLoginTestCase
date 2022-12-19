package PageObjectModel;

import DriverPack.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_Page extends AbstractClass1 {

    private WebDriver driver;

    public register_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }


    @FindBy(css = "a[href='/login']")
    private WebElement signInButton;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    private WebElement submitButton;
    @FindBy(css = "input[placeholder='Name']")
    private WebElement firstname;

    public void clickOnSignInButton(){

        clickFunction(signInButton);
    }

    public void typeEmail(String email){

        sendKeysFunction(emailTextBox,email);
    }

    public void clickOnSubmitButton(){

        clickFunction(submitButton);
    }
    public void typeFirstnameAndLastName(String firstName){

        sendKeysFunction(firstname,firstName);

    }


}
