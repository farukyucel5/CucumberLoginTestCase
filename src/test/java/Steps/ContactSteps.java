package Steps;

import DriverPack.Driver;
import PageObjectModel.ContactUs_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ContactSteps {
    ContactUs_page contactUsPage=new ContactUs_page();
    private WebDriver driver;
    @Given("navigate to the website")
    public void navigateToTheWebsite() {
        driver= Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/contact/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @And("click on contact us button")
    public void clickOnContactUsButton() {
        contactUsPage.clickContactUs();

    }
    @And("type in your firstname")
    public void typeInYourFirstname() {
        contactUsPage.setFirstname();
    }

    @And("type in your lastname")
    public void typeInYourLastname() {
        contactUsPage.setLastname();
    }
    @And("type in your email")
    public void typeInYourEmail() {
        contactUsPage.setEmail();
    }

    @And("write a message")
    public void writeAMessage() {

        contactUsPage.setMessage();
    }

    @When("click on the send button")
    public void clickOnTheSendButton() {
        contactUsPage.clicksubmit();
    }

    @Then("verify confirmation message")
    public void verifyConfirmationMessage() {
        contactUsPage.setConfirmation();
    }


    @Then("close it")
    public void closeIt() {
        driver.quit();
    }
}
