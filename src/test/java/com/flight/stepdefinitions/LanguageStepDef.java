package com.flight.stepdefinitions;

import com.flight.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LanguageStepDef {
    HomePage homePage = new HomePage();


    @When("I click Language dropdown menu")
    public void iClickLanguageDropdownMenu(){

        homePage.clickLanguage();
    }

    @When("I select {string} from the language dropdown")
    public void iSelectESFromTheLanguageDropdown(String languages) {

         homePage.dropdownMenu(languages);
    }


    @Then("language dropdown menu should be {string}")
    public void languageDropdownMenuShouldBe(String language) {

        String expectedResult= language;
        String actualResult= homePage.getLanguage();

        Assert.assertEquals(expectedResult,actualResult);

    }
}
