@search
Feature: Search Tool Functionality
  As a user
  I want to search for a tool in the application
  So that I can quickly find the tool I need

  Scenario: Search for an existing tool

    Given I am on the Home page
    When I enter "Hammer" in the Search bar
    And I click the Search button
    Then I should see the tool "Hammer" in the search results

