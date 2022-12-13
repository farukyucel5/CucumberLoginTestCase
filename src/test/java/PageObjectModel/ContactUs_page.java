package PageObjectModel;

import DriverPack.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.security.auth.x500.X500Principal;

public class ContactUs_page extends AbstractClass{
    WebDriver driver;

    public ContactUs_page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    private WebElement contactUsButton;

    public void clickContactUs(){
        clickFunction(contactUsButton);
    }

    @FindBy(xpath = "//input[@id='wpforms-161-field_0']")
    private WebElement firstname;

    public void setFirstname(){
        sendkeys(firstname,"Faruk");
    }

    @FindBy(xpath = "//input[@id='wpforms-161-field_0-last']")
    private WebElement lastname;

    public void setLastname(){
        sendkeys(lastname,"Yucel");
    }

    @FindBy(xpath = "//input[@id='wpforms-161-field_1']")
    private WebElement email;

    public void setEmail(){
        sendkeys(email,"frk44@gmail.com");
    }

    @FindBy(xpath = "//textarea[@id='wpforms-161-field_2']")
    private WebElement message;

    public void setMessage(){
        sendkeys(message,"hello sir ");
    }

    @FindBy(xpath = "//button[@id='wpforms-submit-161']")
    private WebElement submit;

    public void clicksubmit(){
       clickFunction(submit);
    }

    @FindBy(xpath = "//p[contains(text(),'Thanks for contacting us! We will be in touch with')]")
    private WebElement confirmation;

    public void setConfirmation(){
        assertion(confirmation);
    }











}
