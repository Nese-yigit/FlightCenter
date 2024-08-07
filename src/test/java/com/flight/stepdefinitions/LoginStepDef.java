package com.flight.stepdefinitions;

import com.flight.pages.HomePage;
import com.flight.utilities.ConfigReader;
import com.flight.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    HomePage homePage = new HomePage();

    @Given("I am on the Home page")
    public void iAmOnTheHomePage() {
        Driver.get().get(ConfigReader.get("url"));


    }

    @When("I click sign in button on the Home page")
    public void iClickSignInButtonOnTheHomePage(){

        homePage.clickSingIn();

    }

    @When("I enter an invalid email and password")
    public void iEnterAnInvalidEmailAndPassword()
    {

        String email= ConfigReader.get("email");
        String password=ConfigReader.get("password");
        homePage.addEmailPassword(email,password);

    }

    @And("I click the Login button")
    public void iClickTheLoginButton() {
        homePage.clickLogIn();
        
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String message) {
        String expectedResult = message ;
        String actualResult = homePage.getErrorMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
}
