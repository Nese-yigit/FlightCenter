@login
Feature: Sign In Functionality
  As a user
  I want to sign in to the application
  So that I can access my account

  Scenario: Unsuccessful sign in with invalid credentials

    Given I am on the Home page
    When I click sign in button on the Home page
    When I enter an invalid email and password
    And I click the Login button
    Then I should see an error message "Invalid email or password"