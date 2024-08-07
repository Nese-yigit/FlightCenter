package com.flight.stepdefinitions;

import com.flight.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDef {
    HomePage homePage = new HomePage();


    @When("I enter {string} in the Search bar")
    public void iEnterInTheSearchBar(String tool) {

        homePage.addTool(tool);
    }

    @And("I click the Search button")
    public void iClickTheSearchButton(){

        homePage.clickSearchBtn();
    }

    @Then("I should see the tool {string} in the search results")
    public void iShouldSeeTheToolInTheSearchResults(String tool) {

        String expectedResult = tool;
        String actualResult = homePage.getSearchResult();

        Assert.assertTrue(expectedResult,actualResult.endsWith(tool));

    }







}
