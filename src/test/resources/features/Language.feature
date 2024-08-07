@lang
Feature: Switch Language
  As a user
  I want to switch the language of the application
  So that I can use the application in my preferred language

  Scenario: Switch language from English to Spanish

    Given I am on the Home page
    When I click Language dropdown menu
    When I select 'ES' from the language dropdown
    Then language dropdown menu should be "ES"



