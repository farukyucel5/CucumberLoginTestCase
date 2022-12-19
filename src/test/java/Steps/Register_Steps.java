package Steps;

import DriverPack.Driver;
import PageObjectModel.register_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class Register_Steps {
    register_Page register_page = new register_Page();
    private WebDriver driver;
    @Given("^Navigate to Website$")
    public void navigateToWebsite() {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @And("^click Sign in button$")
    public void clickSignInButton() {


        register_page.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) {

        register_page.typeEmail(email);
    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {


        register_page.clickOnSubmitButton();

    }
    @And("type firstname {string}")
    public void typeFirstname(String fullname) {
        register_page.typeFirstnameAndLastName(fullname);

    }

    @And("close all the windows")
    public void closeAllTheWindows() {
        Driver.getDriver();
    }



}
